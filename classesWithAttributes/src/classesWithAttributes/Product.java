package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı");
		this.id=id;
		this.renk=renk;
		this.name=name;
		this.price=price;
		this.descrpition=description;
		this.stockAmount=stockAmount;
	}
	
	public Product() {
		
	}
	
	// attributes->özellikler c#'taki properties

	// attributes || field denir
	private int id;
	private String name;
	private String descrpition;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// getter bir değeri okumaya yönelik işlem
	public int getId() {
		return id;
	}

	// setter planlamak ayarlamak, bir değer vermeye yarar
	public void setId(int id) { // set edilen değer parametre olarak verilmeli
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrpition() {
		return descrpition;
	}

	public void setDescrpition(String descrpition) {
		this.descrpition = descrpition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1)+id;
	}

	
}
