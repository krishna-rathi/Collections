import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {

	// A Dequeue (Double ended queue) based method for printing maximum element of 
// all subarrays of size k 
static void printKMax(int arr[], int n, int k) 
{ 
	// Create a Double Ended Queue, Qi that will store indexes of array elements 
	// The queue will store indexes of useful elements in every window and it will 
	// maintain decreasing order of values from front to rear in Qi, i.e., 
	// arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order 
	Deque<Integer> Qi = new ArrayDeque<>(k);

	/* Process first k (or first window) elements of array */
	int i; 
	for (i = 0; i < k; ++i) { 
		// For every element, the previous smaller elements are useless so 
		// remove them from Qi 
		while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.getLast()]) 
			Qi.pollLast(); // Remove from rear 

		// Add new element at rear of queue 
		Qi.add(i); 
	} 

	// Process rest of the elements, i.e., from arr[k] to arr[n-1] 
	for (; i < n; ++i) { 
		// The element at the front of the queue is the largest element of 
		// previous window, so print it 
		System.out.print(arr[Qi.peek()] + " ");

		// Remove the elements which are out of this window 
		while ((!Qi.isEmpty()) && Qi.peek() <= i - k) 
			Qi.poll(); // Remove from front of queue 

		// Remove all elements smaller than the currently 
		// being added element (remove useless elements) 
		while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.getLast()]) 
			Qi.pollLast(); 

		// Add current element at the rear of Qi 
		Qi.add(i); 
	} 

	// Print the maximum element of last window 
	System.out.print(arr[Qi.peek()]); 
} 

public static void main (String[] args) {
			
	int n,k;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	k = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	printKMax(arr, n, k); 
	} 
}
