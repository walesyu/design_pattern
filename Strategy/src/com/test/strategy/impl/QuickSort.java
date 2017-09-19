package com.test.strategy.impl;
import com.test.strategy.sortStrategy;

public class QuickSort implements sortStrategy {

	public int[] sort(int[] d) {
		Sort(d, 0, d.length - 1);
		return d;
	}

	public void Sort(int[] array, int left, int right) {
		if (right <= left)
			return;
		int pivotIndex = (left + right) / 2;
		int pivot = array[pivotIndex];
		Swap(array, pivotIndex, right);
		int swapIndex = left;
		for (int i = left; i < right; ++i) {
			if (array[i] <= pivot) {
				Swap(array, i, swapIndex);
				++swapIndex;
			}
		}
		Swap(array, swapIndex, right);
		Sort(array, left, swapIndex - 1);
		Sort(array, swapIndex + 1, right);
	}

	private void Swap(int[] array, int indexA, int indexB) {
		int tmp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = tmp;
	}
}