import java.io.*;

class binarySearch {
	//return index of x if it is in arr[]
	int binarySearch(int arr[], int x) {
		int l = 0, r = arr.length -1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			//check if x is in mid
			if (arr[m] == x)
				return m;
			//If x greater, ignore left side
			if (arr[m] < x)
				l = m + 1;
			//if x is smaller, ignore right side
			else
				r = m - 1;
			}
			// element is not present
			return -1;
			}

	public static void main(String args[])
	{
		binarySearch ob = new binarySearch();
		int arr[] = {2,3,4,10,40};
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println(
				"Not in array");
		else
			System.out.println("Element is at index" + result);
		}
	}



