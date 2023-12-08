package test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {
public static void main(String[] args) {
 System.out.println("------------STREAMS PRIMARY OPERATION----------"); 
	Stream<String> stream = Stream.of("a", "b", "c");
	stream.forEach(v->System.out.println(v+" "));
	Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2).takeWhile(i->i<=50);
	 infiniteStream.forEach(System.out::println);
	

	 
	 String randomNumber = IntStream.range(0, 6)
             .mapToObj(i -> Integer.toString(ThreadLocalRandom.current().nextInt(0, 10)))
             .collect(Collectors.joining());

// Ensure it's a 6-digit number; if the generated number starts with '0' it would be less than 6 digits.
while(randomNumber.length() < 6) {
randomNumber = "0" + randomNumber;
}

System.out.println(randomNumber);
}
}