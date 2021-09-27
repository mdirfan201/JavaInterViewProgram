import org.apache.commons.lang3.StringUtils;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		
		String newString="  This is Selenium Automation Class "
				+"\n Java course " 
				+"\n core java tutorial "
				+"\n\t spring boot course \t";
		System.out.println(newString);
		String noWhiteSpaceString="";
		System.out.println("*******************By using ForLoop***************");
		for(int i=0; i<newString.length(); i++) {
			if(newString.charAt(i)!=' ' && newString.charAt(i)!='\t') {
				noWhiteSpaceString=noWhiteSpaceString+newString.charAt(i);
			}
		}
		
		
		System.out.println(noWhiteSpaceString);
		
		System.out.println();
		System.out.println("By using Trim method--"+ newString.trim()); //It will remove space from Right and Left side
		
		System.out.println("By using ReplaceAll method--"+ newString.replaceAll("\\s+", ""));
		
		String remString =StringUtils.deleteWhitespace(newString);
		System.out.println("By using StringUtils method--"+ remString);
	}
}
