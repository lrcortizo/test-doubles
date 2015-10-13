package es.uvigo.esei.xcs.mocks;

import static java.util.stream.Collectors.toList;

import java.util.List;

/**
 * Facade class to work with the {@link Customer} entity.
 * 
 * @author Miguel Reboiro-Jato
 *
 */
public class CustomersFacade {
	// @Inject
	private CustomerDAO dao;
	
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
	throws NullPointerException {
		return this.dao.create(customer);
	}

	
	/**
	 * Deletes a customer.
	 * 
	 * @param customer the customer to delete.
	 * @throws NullPointerException if {@code customer} is {@code null}.
	 * @throws MissingIdException if the {@code customer} does not have an id.
	 */
	public void delete(Customer customer)
	throws NullPointerException, MissingIdException {
		try {
			this.dao.delete(customer);
		} catch (IllegalArgumentException iae) {
			throw new MissingIdException(iae);
		}
	}
	
	/**
	 * Updates a customer.
	 * 
	 * @param customer the customer to update.
	 * @throws NullPointerException if {@code customer} is {@code null}.
	 * @throws MissingIdException if the {@code customer} does not have an id.
	 */
	public void update(Customer customer)
	throws NullPointerException, MissingIdException {
		try {
			this.dao.update(customer);
		} catch (IllegalArgumentException iae) {
			throw new MissingIdException(iae);
		}
	}

	/**
	 * Returns the list of customers that are currently active.
	 * 
	 * @return the list of customers that are currently active.
	 */
	public List<Customer> listActiveCustomers() {
		return this.dao.list().stream()
			.filter(Customer::isActive)
		.collect(toList());
	}

	
	/**
	 * Searches for a customer with the provided name.
	 * 
	 * @param name the name of the customer to be retrieved.
	 * @return the customer with the provided name, if the customer exists.
	 * {@code null} if the customer does not exist.
	 * @throws NullPointerException if {@code name} is {@code null}.
	 */
	public Customer findByName(String name)
	throws NullPointerException {
		try {
			return this.dao.findByName(name);
		} catch (IllegalArgumentException iae) {
			return null;
		}
	}
}
