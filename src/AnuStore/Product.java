package AnuStore;

public class Product {

	private String id;
	private String pname;
	private int qty;
	private double price;
	private double totalprice;

	public Product(String id, String pname, int qty, double price, double totalprice) {

		super();
		this.id = id;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.totalprice = totalprice;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public static void displayFormat() {
		System.out.println(
				"----------------------------------------------------------------------------------------------------");

		System.out.print("\nProductID \t \t Name \t \t Quantity \t\t Rate \t\t Total Price \n");

		System.out.println(
				"----------------------------------------------------------------------------------------------------\n");

	}

	public void display() {
		System.out.format("    %-9s             %-9s       %5d            %9.2f            %14.2f \n", id, pname, qty,
				price, totalprice);
	}

}
