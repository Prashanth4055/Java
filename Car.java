
public class Car {
	private int model;
	public Car(int model, String name, String company, int price) {
		super();
		this.model = model;
		Name = name;
		this.company = company;
		this.price = price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", Name=" + Name + ", company=" + company + ", price=" + price + "]";
	}
	private String Name;
	private String company;
	private int price;

}
