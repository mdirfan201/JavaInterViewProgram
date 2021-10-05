
public class FindthecountofCapitalandSmalllettersinastring {

	public static void main(String[] args) {
		String str="thisIsIrfan@123";
		int capcount = 0;
		int small=0;
		int number=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				capcount++;
			}
		}
		System.out.println(" "+capcount++);
		
		
		for(int j=0; j<str.length();j++) {
			if(str.charAt(j)>='a' && str.charAt(j)<='z') {
				small++;
			}
		}
		System.out.println(" "+small++);
		
		
		for(int k=0; k<str.length();k++) {
			if(str.charAt(k)>='0' && str.charAt(k)<='9') {
				number++;
			}
		}
		System.out.println(" "+number++);
		
	}

}
