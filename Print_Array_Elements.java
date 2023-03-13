
public class Print_Array_Elements {
	public static void main(String[] args) {
		Print_Array_Elements print = new Print_Array_Elements();
		int array[] = {25,4,46,28,13,14};
		print.elementCount(array);//calls the function to print the number of elements of the array.
		print.printArray(array);//calls the function to print the elements of the array.
		print.copyArray(array);//calls the function to print the elements of the copied  array.
		print.reverseArray(array);//calls the function to reverse the original array.
		print.arraySortAscending(array);//calls the function to print the sorted array in ascending order.
		print.arraySortDescending(array);//calls the function to print the sorted array in descending order.
		print.maxValue(array);//calls the function to print the largest of the array.
		print.leastValue(array);//calls the function to print the least of the array.
	}
	//Print the elements of an array.
	public int printArray(int array[]) {
		System.out.print("Original array: ");
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");		
		}
		System.out.println();
		return 0;
	}
	//copythe elementsof an array.
	public int copyArray(int array[]) {
		int array_copy[] = new int [array.length];
		System.out.print("Copied Array: ");
		for(int i = 0; i< array.length; i++) {
				array_copy[i] = array[i];
			}
		for(int i = 0; i< array_copy.length; i++) {
				System.out.print(array_copy[i]+" ");
			}
		System.out.println();
		return 0;
	}
	//function to reverse the original array.
	public int reverseArray(int array[]) {
		System.out.print("Reversed Array: ");
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		return 0;
	}
	//find the max value in an array
	public int maxValue(int array[]) {
		System.out.print("Maximum element in Array: ");
		int max = array[0];
		for(int i = 0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println(max);
		
		return max;
	}
	//least element in an array.
	public int leastValue(int array[]) {
		System.out.print("Least element in Array: ");
		int least = array[0];
		for(int i = 0; i<array.length; i++) {
			if(array[i]<least) {
				least = array[i];
			}
		}
		System.out.println(least);
		return least;
	}
	// This method counts the number of elements the array.
	public int elementCount(int array[]) {
		int count = 0 ;
		System.out.print("Number element in Array: ");
		for(int i = 0; i<array.length; i++) {
			count++;
		}
		System.out.println(count);
		return 0;
	}
	//This method sorts the array elements in ascending order.
	public int arraySortAscending(int array[]) {
		int temp = 0;
		System.out.print("Sorted array in ascending order: ");
		for(int i=0; i<array.length; i++) {
			for(int j = 0; j <array.length; j++) {
				if(array[i]<array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print (array[i]+" ");
		}
		System.out.println();
		return 0;
	}
	//This method sorts the array elements in descending order.
	public int arraySortDescending(int array[]) {
		int temp = 0;
		System.out.print("Sorted array in Descending order: ");
		for(int i=0; i<array.length; i++) {
			for(int j = 0; j <array.length; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print (array[i]+" ");
		}
		System.out.println();
		return 0;
	}
}
