package com.test.strategy.impl;
import com.test.strategy.sortStrategy;

public class SelectionSort implements sortStrategy {
	public int[] sort(int[] d) {
		for (int i = 0, minIndex; i < d.length - 1; ++i) {
			minIndex = i;
			for (int j = i + 1; j < d.length; ++j)
				if (d[j] < d[minIndex])
					minIndex = j;
			if (minIndex != i)
				Swap(d, minIndex, i);
		}
		return d;
	}

	private void Swap(int[] array, int indexA, int indexB) {
		int tmp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = tmp;
	}
}