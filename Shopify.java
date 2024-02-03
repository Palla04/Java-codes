package ClassConcept;

import java.util.Scanner;

public class Shopify {
	int ProductId;
	String ProductName;
	int ProductPrice;
	String ProductMDate;
	String ProductExDate;
    
    public Shopify(int productId, String productName, int productPrice, String productMDate, String productExDate) {
		
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
		ProductMDate = productMDate;
		ProductExDate = productExDate;
	}

	

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	public String getProductMDate() {
		return ProductMDate;
	}

	public void setProductMDate(String productMDate) {
		ProductMDate = productMDate;
	}

	public String getProductExDate() {
		return ProductExDate;
	}

	public void setProductExDate(String productExDate) {
		ProductExDate = productExDate;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ProductID: ");
		int id = sc.nextInt();
		sc.close();
		
		/* Here we have used one parameterized constructor */
		Shopify s = new Shopify(id, "Cake", 450, "20-Apr-2023", "23-Apr-2023");
		/* Here we have use Getter() */
		System.out.println(s.getProductId());
		System.out.println(s.getProductName());
		System.out.println(s.getProductPrice());
		System.out.println(s.getProductMDate());
		System.out.println(s.getProductExDate());
		
		/* Here we use setter() */
		s.setProductName("Crea Cake");
		
		/* Here we use getter() */
		System.out.println(s.getProductName());
	    
        s.setProductName("Cream Cake");
		
		System.out.println(s.getProductName());
  }
}
