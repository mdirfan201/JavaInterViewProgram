import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingNumberInInteger {
	/**
	 * int a[]={1,2,3,4,6,7,8,9,10};
	 * logic: add all array number: 1+2+3+4+6+7+8+9+10=50
	 * 	      add all number including miss= 55
	 * 		substract (all number- sum of array) 55-50=5
	 * 	
	 */
 
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,29,30};
		System.out.println("Original Array Num is:: "+Arrays.toString(a));
		int sum=0;
		for(int i=0; i<a.length;i++) {
			sum=sum+a[i];
		}
		
		
		System.out.println("Array of sum is:: "+ sum);
		
		int sum1=0;
		for(int j=0; j<=30;j++) {
			sum1=sum1+j;
		}
		System.out.println("Sum of all number is :: "+ sum1);
		System.out.println("The Missing number is :: " + (sum1-sum));
	}
}
