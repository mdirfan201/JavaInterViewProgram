
public class ReverseInteger {
	
	/**
	 * How to reverse number
	 * Input eg: int num=12345
	 * Output :54321
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		//1 using algorithem
		long num=123455432; //need reverse 54321
		long rev=0;
		
		while(num !=0) {
			rev=rev*10+num%10; //5
			num = num/10;//1234
		}
		System.out.println("Reverse number is:: " +rev);
		
		//2.using String buffer
		long num1=12345;
		System.out.println("Reverse number using StringBuffer:: " +new StringBuffer(String.valueOf(num1)).reverse());
		
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}
}
