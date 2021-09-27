

public class PrintName {

	/**
	 * Printing Nme 1000 time without using any loop
	 */
	
	public static void main(String[] args) {
		String name="Irfan";
		String s="i";
		s= s.replaceAll("i", "iiiiiiiiii");//10
		s= s.replaceAll("i", "iiiiiiiiii");//10*10=100
		s= s.replaceAll("i", "iiiiiiiiii");//100*10=1000
		
		s= s.replaceAll("i", name +"\n");
		System.out.println(s);

	}
}
