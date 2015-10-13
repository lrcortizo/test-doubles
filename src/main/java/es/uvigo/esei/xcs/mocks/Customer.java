package es.uvigo.esei.xcs.mocks;

/**
 * A customer entity.
 * 
 * @author Miguel Reboiro Jato
 *
 */
public class Customer {
	private int id;
	private String name;
	private boolean active;
	private int lastYearBilling;
	
	Customer() {}
	
	Customer(int id, String name, boolean active, int lastYearBilling) {
		this(name, active, lastYearBilling);
		this.id = id;
	}
	
	/**
	 * Constructs a new instance of {@link Customer}.
	 *
	 * @param name the name of the customer.
	 * @param active {@code true} if the customer is currently active.
	 * {@code false} otherwise.
	 * @param lastYearBilling the total billing of the customer in the last
	 * year.
	 */
	public Customer(String name, boolean active, int lastYearBilling) {
		this.name = name;
		this.active = active;
		this.lastYearBilling = lastYearBilling;
	}
	
	/**
	 * Returns the generated id of the customer.
	 * 
	 * @return the generated id of the customer.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Returns the name of the customer.
	 * 
	 * @return the name of the customer.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the customer.
	 * 
	 * @param name the name of the customer.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns {@code true} if the customer is currently active. {@code false}
	 * otherwise.
	 * 
	 * @return {@code true} if the customer is currently active. {@code false}
	 * otherwise.
	 */
	public boolean isActive() {
		return active;
	}
	
	/**
	 * Changes the active status of the client.
	 * 
	 * @param active {@code true} if the customer should be activated.
	 * {@code false} if the customer should be deactivated.
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	/**
	 * Returns the total billing of the customer in the last year.
	 * 
	 * @return the total billing of the customer in the last year.
	 */
	public int getLastYearBilling() {
		return lastYearBilling;
	}
	
	/**
	 * Sets the total billing of the customer in the last year.
	 * 
	 * @param lastYearBilling the total billing of the customer in the last
	 * year.
	 */
	public void setLastYearBilling(int lastYearBilling) {
		this.lastYearBilling = lastYearBilling;
	}
}
