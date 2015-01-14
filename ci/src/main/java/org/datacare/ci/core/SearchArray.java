package org.datacare.ci.core;

/**
 * 
 * @author Deo
 * 
 */
public class SearchArray {

	/**
	 * Method to return the maximum value in the supplied array
	 * 
	 * @param numbers
	 * @return
	 */
	public int getMaximunValue(int[] numbers) {
		if (numbers.length == 0) {
			throw new IllegalArgumentException("Empty array");
		} else if (numbers.length == 1) {
			return numbers[0];

		} else {
			int i = 0;
			for (i = 0; i < numbers.length - 1; i++) {

				if (numbers[i] == numbers[i + 1]) {

					if (i == numbers.length - 2) {

						return numbers[i];
					}
				} else {
					break;
				}
			}

			int maximum = 0;
			for (int j = i; j < numbers.length - 1; j++) {
				if (numbers[j] < numbers[j + 1]) {
					maximum = numbers[j + 1];
				}
			}
			return maximum;
		}
	}
}