package com.datastructures;

public class Node<K, V> {

	public K key;
	public V value;
	Node<K, V> next, prev;

	public Node(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
	
	
	
}
