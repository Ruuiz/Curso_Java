package generics;

import java.util.TreeSet;

public class ComparableTeste {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
			nums.add(10);
			nums.add(103);
			nums.add(23);
			nums.add(45);
			nums.add(6);
			nums.add(70);
			nums.add(89);
			nums.add(766);
			
		for(Integer n:nums) {
			System.out.println(n);
		}
		
	}

}
