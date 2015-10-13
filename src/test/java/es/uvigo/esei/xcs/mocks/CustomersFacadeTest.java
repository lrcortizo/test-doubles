package es.uvigo.esei.xcs.mocks;

import static es.uvigo.esei.xcs.mocks.CustomerDataset.activeCustomers;
import static es.uvigo.esei.xcs.mocks.CustomerDataset.customer;
import static es.uvigo.esei.xcs.mocks.CustomerDataset.customerWithId;
import static es.uvigo.esei.xcs.mocks.IsEqualsToCustomer.equalsToCustomer;
import static es.uvigo.esei.xcs.mocks.IsEqualsToCustomer.equalsToCustomers;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomersFacadeTest {
	private CustomersFacade facade = new CustomersFacade();

	@Test
	public void testCreate() {
		final Customer newCustomer = customer();
		final Customer newCustomerWithId = customerWithId();

		//TODO: Complete test
		
		assertThat(facade.create(newCustomer), is(equalsToCustomer(newCustomerWithId)));
	}
	
	@Test(expected = NullPointerException.class)
	public void testCreateNullCustomer() {
		//TODO: Complete test

		facade.create(null);
	}

	@Test
	public void testDelete() {
		final Customer customer = customerWithId();

		//TODO: Complete test
		
		facade.delete(customer);
	}

	@Test(expected = NullPointerException.class)
	public void testDeleteNull() {
		//TODO: Complete test
		
		facade.delete(null);
	}

	@Test(expected = MissingIdException.class)
	public void testDeleteCustomerWithoutId() {
		final Customer customer = customer();

		//TODO: Complete test
		
		facade.delete(customer);
	}

	@Test
	public void testUpdate() {
		final Customer customer = customerWithId();

		//TODO: Complete test
		
		facade.update(customer);
	}

	@Test(expected = NullPointerException.class)
	public void testUpdateNull() {
		//TODO: Complete test
		
		facade.update(null);
	}

	@Test(expected = MissingIdException.class)
	public void testUpdateCustomerWithoutId() {
		final Customer customer = customer();

		//TODO: Complete test
		
		facade.update(customer);
	}

	@Test
	public void testFindByName() {
		final Customer customer = customer();
		final String name = customer.getName();

		//TODO: Complete test
		
		assertThat(facade.findByName(name), is(equalsToCustomer(customer)));
	}

	@Test
	public void testFindByNameMissing() {
		final String name = "Wally";

		//TODO: Complete test
		
		assertThat(facade.findByName(name), is(nullValue()));
	}

	@Test(expected = NullPointerException.class)
	public void testFindByNameNull() {
		//TODO: Complete test
		
		facade.findByName(null);
	}

	@Test
	public void testListActiveCustomers() {
		//TODO: Complete test
		
		assertThat(facade.listActiveCustomers(), is(equalsToCustomers(activeCustomers())));
	}
}
