import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product("p1", Color.GREEN, Size.SMALL));
		products.add(new Product("p2", Color.BLUE, Size.REGULER));
		products.add(new Product("p3", Color.RED, Size.LARGE));
		products.add(new Product("p4", Color.GREEN, Size.LARGE));
		products.add(new Product("p5", Color.BLUE, Size.REGULER));
		products.add(new Product("p6", Color.RED, Size.SMALL));
		products.add(new Product("p7", Color.GREEN, Size.SMALL));
		
		List<Product> output = getFilteredProduct(products, null, Size.LARGE);
	
		for (Product product : output) {
			System.out.println(product.getName());
		}
	}

	public static List<Product> getFilteredProduct(List<Product> products, Color color, Size size) {
		List<Product> filteredList = new ArrayList<Product>();
				filteredList = products.stream().filter(l -> l.getColor().equals(color) || l.getSize().equals(size))
				.collect(Collectors.toList());

		return filteredList;

	}

}
