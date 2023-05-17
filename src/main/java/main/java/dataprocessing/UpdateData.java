package main.java.dataprocessing;

public class UpdateData {
	private final String productId = "2344719";
	
	public void updateProduct(String productId) {
		if (productId==null) {
			productId=this.productId;
		}
		
	}

}
