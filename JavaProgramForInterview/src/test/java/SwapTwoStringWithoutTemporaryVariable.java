
public class SwapTwoStringWithoutTemporaryVariable {

	/***
	 * Swap to String without temporary variable
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Selenium";
		String b="WebDriver";
		System.out.println("Before Swaping : ");
		System.out.println("Value of a is:---"+a);
		System.out.println("Value of b is:---"+b);
		
		//1. by using Append a and b
		a=a+b; //HelloWorld
		
		//Store initial string a in String b:
		b=a.substring(0, a.length()-b.length());
		
		//Store initial String b in String a
		a=a.substring(b.length());
		
		System.out.println();
		System.out.println("*****The Value of a and b after Swapping is******");
		System.out.println("Value of a is:---"+a);
		System.out.println("Value of b is:---"+b);
		
	}

}
