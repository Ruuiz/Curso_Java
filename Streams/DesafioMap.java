package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		UnaryOperator<String> inverter =
				s -> new StringBuilder(s).reverse().toString();
				
	   Function<String, Integer> bParaS = s -> Integer.parseInt(s,2);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(bParaS)
		.forEach(System.out::println);
		
		
//		Stream<Integer> stream = nums.stream();
//		stream.forEach(Integer.toBinaryString(nums));
		
		
	}

}
