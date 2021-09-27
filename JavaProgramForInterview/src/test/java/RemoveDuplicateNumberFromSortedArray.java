import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateNumberFromSortedArray {
	/**
	 * Remove Duplicate Element or Number from sorted Array
	 * Source : http://webwrite.com
	 * Input is:{1,2,2,3,4,4,5,6,6,7}
	 * Output should be: {1,2,3,4,5,6,7}
	 * 
	 */
	public static void main(String[] args) {
		int arr[]={1,2,2,3,3,3,4,4,5,6,6,7};
		//System.out.println("The Original number is---:: {1,2,2,3,3,3,4,4,5,6,6,7}");
		int len=arr.length;
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0; i< len-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[len-1];
		for(int k=0;k<j;k++) {
			
			System.out.print(" "+temp [k]);
		}
	}
}
