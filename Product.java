package exerciseone;

import java.math.BigDecimal;

public class Product {

	private int itemId;
	private String shortDescription;
	private BigDecimal price;
	private String brand;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int itemId, String shortDescription, BigDecimal price, String brand) {
		super();
		this.itemId = itemId;
		this.shortDescription = shortDescription;
		this.price = price;
		this.brand = brand;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "Product [itemId=" + itemId + ", shortDescription=" + shortDescription + ", price=" + price + ", brand="
				+ brand + "]";
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
