package com.test.main;

import com.test.strategy.impl.QuickSort;
import com.test.strategy.impl.SelectionSort;

public class Application {
	public static void main(String[] args) {
		SortArray context;
		context = new SortArray(new QuickSort());
		context.setArray(new int[] { 1, 5, 78, 2, 3, 8, 1 });
		int[] resultA = context.doSort();
		for (int i = 0; i < resultA.length; i++) {
			System.out.println(resultA[i]);
		}

		System.out.println("===========================");

		context = new SortArray(new SelectionSort());
		context.setArray(new int[] { 4, 6, 8, 3, 5, 8, 1 });
		int[] resultB = context.doSort();
		for (int i = 0; i < resultB.length; i++) {
			System.out.println(resultB[i]);
		}
	}
}