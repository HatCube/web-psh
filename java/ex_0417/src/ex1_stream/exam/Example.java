package ex1_stream.exam;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,5,7,8,10,4,1,2,6,9,1,1,1,3,3,3);
		
		//짝수만 골라 10을 더한뒤 출력하세요
		
		numbers
		.stream()
		.filter(x -> x % 2 == 0)
		.map(x -> x + 10)
		.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		List<String> words = Arrays.asList("java", "spring", "react", "db", "server");
		
		//문자열의 길이가 5 이상인 문자열만 남긴 뒤
		//대문자로 변환하여 출력
		
		words.stream()
		.filter(x -> x.length() >= 5)
		.map(String::toUpperCase)
		.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		//문제들
		
		
		List<Integer> orders = Arrays.asList(12000, 80000, 45000, 50000, 99000, 30000);
		orders.stream().filter(x -> x >= 50000).forEach(x -> System.out.print(x + " "));
		
		List<Integer> ages = Arrays.asList(21, 35, 17, 42, 63, 15);
		boolean age = ages.stream().anyMatch(x -> x <= 19);
		System.out.println(age);
		
		boolean age2 = ages.stream().allMatch(x -> x >= 19);
		System.out.println(age2);
		
		boolean age3 = ages.stream().anyMatch(x -> x >= 100);
		System.out.println(age3);
		
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		numbers2.stream().filter(x -> x % 2 == 0)
		.sorted((a,b) -> b-a)
		.forEach(x -> System.out.print((x * x) + " "));
		System.out.println();
		
		List<Integer> scores = Arrays.asList(55, 90, 82, 67, 99, 80, 73);
		scores.stream()
		.filter(x -> x >= 80)
		.sorted((a,b) -> b-a)
		.toList()
		.forEach(x -> System.out.print(x + " "));
		
	}
}
