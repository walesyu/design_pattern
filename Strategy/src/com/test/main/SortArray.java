package com.test.main;

import com.test.strategy.sortStrategy;

public class SortArray {
	int[] array;

	private sortStrategy sortStrategy;

	public SortArray(sortStrategy strategy) {
		this.sortStrategy = strategy;
	}

	public int[] doSort() {
		return this.sortStrategy.sort(array);
	}

	public void setArray(int[] array) {
		this.array = array;
	}
}