package com.har.longincre;

class LongIncrese {
	static int lis(int arr[], int n) {
		int lis[] = new int[n];
		int i, j, max = 0;

		for (i = 0; i < n; i++)
			lis[i] = 1;

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[]) {
		int arr[] = { 0, 7, 5, 12, 42, 10, 6, 2, 11, 9, 5, 13, 3, 11, 7, 15,3 };
		int n = arr.length;
		System.out.println("Length of the longest seq is " + lis(arr, n) + "\n");
	}
}
