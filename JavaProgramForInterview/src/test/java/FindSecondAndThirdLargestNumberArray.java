import java.util.Arrays;

public class FindSecondAndThirdLargestNumberArray {

	public static void main(String[] args) {
		int arr[]= {-1,1,2,3,4,5,68,9,10,11};
		Arrays.sort(arr);
		System.out.println("The Original number is :: "+Arrays.toString(arr));
		System.out.println("The Largest number is :: "+arr[arr.length-1]);
		System.out.println("The Second Largest number is :: "+arr[arr.length-2]);
		System.out.println("The Third Largest number is :: "+arr[arr.length-3]);
		System.out.println("The 2nd Smallest number is :: "+arr[1]);
		System.out.println("The 3rd Smallest number is :: "+arr[2]);
		System.out.println("The 6th Smallest number is :: "+arr[5]);
		System.out.println("The  Smallest number is :: "+arr[0]);
	}

}
