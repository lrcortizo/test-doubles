package es.uvigo.esei.xcs.mocks;

import static java.util.Arrays.stream;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * Compares the equality of two {@link Customer}.
 * 
 * @author Miguel Reboiro Jato
 *
 */
public class IsEqualsToCustomer extends TypeSafeMatcher<Customer> {
	private final Customer customer;
	
	private IsEqualsToCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void describeTo(Description description) {
		description.appendValue(this.customer);
	}

	@Override
	protected boolean matchesSafely(Customer item) {
		return item != null
			&& customer.getId() == item.getId()
			&& customer.getLastYearBilling() == item.getLastYearBilling()
			&& customer.getName().equals(item.getName());
	}

	/**
	 * Creates a {@link org.hamcrest.Matcher} that checks the equality of two
	 * {@link Customer} objects. The comparison is done at properties level, not
	 * using the {@link Object#equals(Object)} method. 
	 * 
	 * @param customer the expected customer.
	 * @return a {@link org.hamcrest.Matcher} that checks the equality of two
	 * {@link Customer} objects.
	 */
	@Factory
	public static IsEqualsToCustomer equalsToCustomer(Customer customer) {
		return new IsEqualsToCustomer(customer);
	}

	/**
	 * Creates a {@link org.hamcrest.Matcher} that checks if an {@link Iterable}
	 * collection contains a list of {@link Customer} objects in any order.
	 * 
	 * <p>The matcher returned is a combination of the
	 * {@link org.hamcrest.collection.IsIterableContainingInAnyOrder} matcher
	 * and this matcher.</p>
	 * 
	 * @param customers the list of {@link Customer} objects to look for in an
	 * {@link Iterable} collection.
	 * @return a combination of the
	 * {@link org.hamcrest.collection.IsIterableContainingInAnyOrder} matcher
	 * and this matcher.
	 */
	@Factory
	public static Matcher<Iterable<? extends Customer>> equalsToCustomers(Customer[] customers) {
		final IsEqualsToCustomer[] matchers = stream(customers)
			.map(IsEqualsToCustomer::equalsToCustomer)
		.toArray(IsEqualsToCustomer[]::new);
		
		return containsInAnyOrder(matchers);
	}
}
