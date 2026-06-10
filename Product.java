package p1.entity;

public class Product {
 private String ProductId;
 private String ProductName;
 private long quantity;
 public long getQuantity() {
	return quantity;
}
 public void setQuantity(long quantity) {
	this.quantity = quantity;
 }
 public String getProductId() {
	return ProductId;
 }
 public void setProductId(String productId) {
	ProductId = productId;
 }
 public String getProductName() {
	return ProductName;
 }
 public void setProductName(String productName) {
	ProductName = productName;
 }
}
