package es.uvigo.esei.xcs.mocks;

import java.util.List;

/**
 * Data Access Object for the {@link Customer} entity.
 * 
 * @author Miguel Reboiro Jato
 *
 */
public interface CustomerDAO {
	/**
	 * Creates a new customer.
	 * 
	 * @param customer the customer to create. If this customer has an id, it
	 * will be ignored.
	 * @return a persistent {@link Customer} with the data provided and the id
	 * assigned by the persistence layer.
	 * @throws NullPointerException if {@code customer} is {@code null}.
	 */
	public Customer create(Customer customer)
	throws NullPointerException;
	
	/**
	 * Deletes a customer.
	 * 
	 * @param customer the customer to delete.
	 * @throws NullPointerException if {@code customer} is {@code null}.
	 * @throws IllegalArgumentException if the {@code customer} does not have
	 * an id.
	 */
	public void delete(Customer customer)
	throws NullPointerException, IllegalArgumentException;
	
	/**
	 * Updates a customer.
	 * 
	 * @param customer the customer to update.
	 * @throws NullPointerException if {@code customer} is {@code null}.
	 * @throws IllegalArgumentException if the {@code customer} does not have
	 * an id.
	 */
	public void update(Customer customer);
	
	/**
	 * Returns the complete list of customers.
	 * 
	 * @return the complete list of customers.
	 */
	public List<Customer> list();
	
	/**
	 * Searches for a customer with the provided name.
	 * 
	 * @param name the name of the customer to be retrieved.
	 * @return the customer with the provided name.
	 * @throws NullPointerException if {@code name} is {@code null}.
	 * @throws IllegalArgumentException if no customer with the provided name is
	 * found.
	 */
	public Customer findByName(String name)
	throws NullPointerException, IllegalArgumentException;
}
