
public class HowToFindEvenAndOddNumber {

	public static void main(String[] args) {
		int num=100;
		System.out.print("List of even numbers from 1 to "+ num +": ");  
		
		for(int i=0; i<=num; i++) {
			if(i%2==0) {
				System.out.print(i +" ");
			}
		}
	
		int oddnum=100;
		System.out.println();
		System.out.print("List of even numbers from 1 to "+ oddnum +": "); 
		for(int k=0;k<oddnum;k++) {
			if(k%2!=0) {
				System.out.print(k + " ");
			}
		}

	}
}
