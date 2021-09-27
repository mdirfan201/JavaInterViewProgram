
public class FibonacciSeries {
/**
 * FibonacciSeries from 1 to 10 is ::- 0 1 1 2 3 5 8 13 21 34 
 * @param args
 */
	public static void main(String[] args) {
		int n1=0,n2=1,count=0;    
		System.out.print(n1+" "+n2);//printing 0 and 1    

		for(int i=2;i<10;++i)//loop starts from 2 because 0 and 1 are already printed    
		{    
			count=n1+n2;    
			System.out.print(" "+count);    
			n1=n2;    
			n2=count;    
		}    

	}

}
