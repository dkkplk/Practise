package com.datastructures;

import java.util.concurrent.ConcurrentHashMap;

public class LRUCache<K, V> {

	private int maxCapacity;

	private ConcurrentHashMap<K, Node<K, V>> map;

	private Node<K, V> head, tail;

	public LRUCache(int maxCapacity) {
		this(16, maxCapacity);
	}

	public LRUCache(int initialCapacity, int maxCapacity) {

		this.maxCapacity = maxCapacity;
		if (initialCapacity > maxCapacity) {
			initialCapacity = maxCapacity;
			map = new ConcurrentHashMap<>(maxCapacity);
		}

	}

	public void put(K key, V value) {
		if (map.contains(key)) {
			Node<K, V> node = map.get(key);
			node.value = value;
			removeNode(node);
			offerNode(node);
		} else {

			if (map.size() == maxCapacity) {
				System.out.println("Max Capacity Reached");
				map.remove(head);
				removeNode(head);
			}

			Node<K, V> node = new Node<>(key, value);
			offerNode(node);
			map.put(key, node);
		}
	}

	private void offerNode(Node<K, V> node) {
		// TODO Auto-generated method stub

		if (node == null) {
			return;
		}

		if (head == null) {
			head = tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			node.next = null;
			tail = node;
		}
	}

	private void removeNode(Node<K, V> node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		if (node.prev != null) {
			node.prev.next = node.next;
		} else {
			head = node.next;
		}

		if (node.next != null) {
			node.next.prev = node.prev;

		} else {
			tail = node.prev;
		}
	}

	
}
