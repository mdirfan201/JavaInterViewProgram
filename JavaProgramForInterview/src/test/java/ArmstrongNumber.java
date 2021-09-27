
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		isArmstrongNumber(0);
		isArmstrongNumber(1);
		isArmstrongNumber(155);
		isArmstrongNumber(370);
		isArmstrongNumber(455);
	}
	
	public static 	void isArmstrongNumber(int num) {
		System.out.println("The given number is : : "+ num);
		int cube=0;
		
		int r;
		int temp;
		
		temp=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		
		if(temp==cube) {
			System.out.println("This is Armstrong Number");
		}else {
			System.out.println("This is not Armstrong Number");
		}
	}
}
