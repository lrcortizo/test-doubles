package es.uvigo.esei.xcs.mocks;

public final class CustomerDataset {
	private CustomerDataset() {}
	
	public static Customer customer() {
		return new Customer("John Smith", true, 20000);
	}
	
	public static Customer customerWithId() {
		return new Customer(1, "John Smith", true, 20000);
	}
	
	public static Customer[] customers() {
		return new Customer[] {
			new Customer(1, "John Smith", true, 20000),
			new Customer(2, "Joan Smith", true, 22000),
			new Customer(2, "Martin Smith", false, 30000),
			new Customer(3, "Martina Smith", false, 33000),
			new Customer(4, "Michael Smith", true, 40000),
			new Customer(5, "Michaela Smith", false, 44000),
			new Customer(6, "Louis Smith", true, 50000),
			new Customer(7, "Louisa Smith", false, 55000)
		};
	}
	
	public static Customer[] activeCustomers() {
		return new Customer[] {
			new Customer(1, "John Smith", true, 20000),
			new Customer(2, "Joan Smith", true, 22000),
			new Customer(4, "Michael Smith", true, 40000),
			new Customer(6, "Louis Smith", true, 50000)
		};
	}
}
