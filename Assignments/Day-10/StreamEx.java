package com.corejava.assignments.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(12, "Intel", 30000f));
		list.add(new Product(78, "Dell", 35000f));
		list.add(new Product(90, "Lenevo", 20000));
		list.add(new Product(10, "Apple", 50000f));

		System.out.println(list);// print without using for

		for (Product i : list) { // Filter without using stream
			if (i.price > 25000)
				System.out.println(i.name);
		}

		List<Float> productPriceList2 = list.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);
		// Iterating

		list.stream().forEach(System.out::println);
		// Filtering and Iterating Collection
		list.stream().filter(product -> product.price == 35000)
		          .forEach(product -> System.out.println(product.name));
		// reduce() Method in Collection
		float totalPrice2 = list.stream()
				 .map(product -> product.price)
				 .reduce(0.0f, Float::sum); // accumulating price,
														   // by referring
											               // method of Float
														   // class
		System.out.println(totalPrice2);
		// Sum by using Collectors Methods
		double totalPrice3 = list.stream()
				.collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);

		// Find Max and Min Product Price
		// max() method to get max Product price
		Product productA = list.stream()
				.max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();

		System.out.println(productA.price);

		// min() method to get min Product price
		Product productB = list.stream()
				.max((product1, product2) -> product1.price < product2.price ? 1 : -1).get();
		System.out.println(productB.price);

		// count() Method in Collection
		// count number of products based on the filter
		long count = list.stream()
				.filter(product -> product.price >= 30000).count();
		System.out.println(count);

		// Convert List into Set
		// Converting product List into Set
		Set<Float> productPriceList = list.stream()
				.filter(product -> product.price <= 50000) // filter product on the
																								// base of price
				.map(product -> product.price).collect(Collectors.toSet()); // collect it as Set(remove duplicate
																			// elements)
		System.out.println(productPriceList);

		// Convert List into Map
		Map<Integer, String> productPriceMap = list.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name));

		System.out.println(productPriceMap);

		// Method Reference in stream
		List<Float> productPriceList1 = list.stream()
				.filter(p -> p.price > 30000) // filtering data
				.map(Product::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList1);
	}

}
