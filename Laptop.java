
public class Laptop {
	private int model;
	private String processor;
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", processor=" + processor + ", Brand=" + Brand + ", price=" + price + "]";
	}
	public Laptop(int model, String processor, String brand, int price) {
		super();
		this.model = model;
		this.processor = processor;
		Brand = brand;
		this.price = price;
	}
	private String Brand;
	private int price;

}
