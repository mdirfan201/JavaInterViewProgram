import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElements {
	public static void main(String[] args) {
		String str[]= {"Amazon","GCP","Flipkart","Azure","Amazon","AliBaba","Azure","GCP","SauceLabs"};
		int arr[]= {1,1,2,3,4,5,6,7,8,9,5,8,3};
		//1. brute force
		//2. HashSet
		//3. HashMap
		
		System.out.println("*********Brute Forece********");
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
		
		System.out.println("*********Reversr interger***");
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
			
			
		System.out.println("*******Using Hash Set**********");
		Set<String> data= new HashSet<String>();
		for(String e:str) {
			if(data.add(e)==false) {
				System.out.println(e);
			}
		}
		System.out.println("******Reverse Integer*Using Hash Set**********");
		Set<Integer>data1= new HashSet<Integer>();
		for(Integer i:arr) {
			if(data1.add(i)==false) {
				System.out.println(i);
			}
		}
		
		System.out.println("******Using HashMap***********");
		Map<String, Integer>strMap= new HashMap<String, Integer>();
			for(String e:str) {
				Integer count= strMap.get(e);
				if(count==null) {
					strMap.put(e, 1);
					
				}else {
					strMap.put(e, ++count);
				}
			}
		Set<Entry<String, Integer>>	entrySet=strMap.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	
	}
	
}
