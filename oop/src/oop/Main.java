package oop;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "product 1", 25 ,"expensive",10); //Instance
		
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Product 2");
		product2.setDetail("Expensive");
		product2.setDiscount(20);
		product2.setUnitPrice(5);
		System.out.println(product2.getUnitPriceAfterDiscount());
//
//		Product product3 = new Product(); 
//		
//		
//		Product[] products = {product1,product2,product3};
//	
//		for (Product product : products) {
//			
//		System.out.println(product.name);
//		
//		}
//		
//		System.out.println(products.length);
		
		Category category1 = new Category();
		
		category1.setId(1);
		category1.setName("Category 1");
	
		Category category2 = new Category();
		
		category2.setId(2);
		category2.setName("Category 2");

		System.out.println(category1.getName());

		System.out.println(category2.getName());
		
		
//		ProductManager productManager = new ProductManager();
//		productManager.addToCart(product1);
//		productManager.addToCart(product2);
//		productManager.addToCart(product3);
//			
//			
//		
	}

}
