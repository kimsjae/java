package ch14.miniProject.searchProduct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductSearch {

	public static void main(String[] args) throws IOException {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "HP NoteBook Model 100", 4500000));
		products.add(new Product(2, "HP NoteBook Model 200", 5200000));
		products.add(new Product(3, "MacBook Air", 1500000));
		products.add(new Product(4, "Dell XPS", 3800000));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 상품을 검색하세요.
		bw.write("상품을 검색하세요.\n");
		bw.flush();
		
		// 상품의 이름(*은 모든 상품을 의미): NoteBook
		bw.write("상품의 이름(*은 모든 상품을 의미): ");
		bw.flush();
		String searchName = br.readLine();
		
		// 상품의 가격 상한: 5000000
		bw.write("상품의 가격 상한: ");
		bw.flush();
		float maxPrice = Float.parseFloat(br.readLine());
		
		// 스트림 상품 검색
		List<Product> filteredProducts = products.stream()
				.filter(p -> (searchName.equals("*") || p.getName().contains(searchName)))
				.filter(p -> p.getPrice() <= maxPrice)
				.collect(Collectors.toList());
		
		String productList = filteredProducts.stream()
				.map(Product::getName)
				.collect(Collectors.joining(", "));
		
		// 검색된 상품은 HP NoteBook Model 100 입니다.
		if (!filteredProducts.isEmpty()) {
			
			bw.write("검색된 상품은 " + productList + " 입니다.");
		} else {
			bw.write("조건에 맞는 상품이 없습니다.\n");
		}
		
		bw.flush();
		bw.close();
	}

}
