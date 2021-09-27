import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,4,8,2};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
		
		System.out.println("*******Using Hash Set**********");
		Set<Integer> data= new HashSet<Integer>();
		for(Integer e:arr) {
			if(data.add(e)==false) {
				System.out.println(e);
			}
		}
		
		System.out.println("******Using HashMap***********");
		Map<Integer, Integer>strMap= new HashMap<Integer, Integer>();
			for(Integer e:arr) {
				Integer count= strMap.get(e);
				if(count==null) {
					strMap.put(e, 1);
					
				}else {
					strMap.put(e, ++count);
				}
			}
		Set<Entry<Integer, Integer>>	entrySet=strMap.entrySet();
		for(Entry<Integer, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
	
	}
	
}
}


/*
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
		System.out.println("*******Using Hash Set**********");
		Set<String> data= new HashSet<String>();
		for(String e:str) {
			if(data.add(e)==false) {
				System.out.println(e);
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
		}*/