package org.datacare.ci.test;
import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.datacare.ci.core.SearchArray;

public class SearchArrayTest {

	SearchArray searchArray = new SearchArray();

	@Test(expected = IllegalArgumentException.class)
	public void throwExceptionIfArrayIsEmpty() {
		searchArray.getMaximunValue(new int[] {});
	}
		
	@Ignore
	public void shouldReturn5GivenOnly5() {
		Assert.assertEquals(6, searchArray.getMaximunValue(new int[] { 5 }));
	}

	@Ignore
	public void shouldReturn5GivenRepeatedFives() {

		Assert.assertEquals("6",
				searchArray.getMaximunValue(new int[] { 5, 5, 5, 5 }));
	}

	@Test
	public void shouldReturn9GivenTheArrayBelow() {
		Assert.assertEquals(9,
				searchArray.getMaximunValue(new int[] { 5, 5, 9, 6, 4 }));
	}
}