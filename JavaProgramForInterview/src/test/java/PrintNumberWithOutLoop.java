
public class PrintNumberWithOutLoop {

	/**
	 * Print number 1 to 100 without using any loop
	 * 1. recursive
	 * 2. Java Streams
	 */
	public static void main(String[] args) {
		
		//printNum(95);
		System.out.println("");
		printNumber(50, 110);
	}
	
//	public static void printNum(int num) {
//		if(num<=100) {
//			System.out.println(num);
//			num++;
//			printNum(num);
//		}
//	}
	
	public static void printNumber(int stnum, int endnum) {
		if(stnum<=endnum) {
			System.out.println(stnum);
			stnum++;
			printNumber(stnum,endnum);
		}
	}
}
