
public class SwapToNumbersWithoutTemporaryVariable {

	/***
	 * Swap to numbers without temporary variable
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=10;
		//1. With using tem ver:t
		//x=5 and y=10
		
		
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println("-----With using third veriable----");
		System.out.println(" "+x);
		System.out.println(" "+y);
			
		//2.Without using third veriable: + - operator
		System.out.println("-----Without using third veriable----");
		x=x+y;//15
		y=x-y; //5
		x=x-y;//10
		System.out.println(" "+x);
		System.out.println(" "+y);
		
		//3.Without using third veriable: * operator
		System.out.println("-----Without using third veriable---using *-----");
		x=x*y;//50
		y=x/y;//5
		x=x/y;//10
		
		System.out.println(" "+x);
		System.out.println(" "+y);
		
		//4. using XOR: ^
		x=x^y; //15
		y=x^y;
		x=x^y;
		System.out.println(" "+x);
		System.out.println(" "+y);
		
		
	}

}
