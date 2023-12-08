package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
	
	//Intermediate operations
	
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evenNumbers=num.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
        List<String> words = Arrays.asList("aarya", "aarya 2", "pushpa", "aalavykuntapuram lo");
        List<String> wordsTCaps=words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(wordsTCaps);

		List<Integer> dup=Arrays.asList(1,2,4,3,4,5,6,8,7,8,9,10);
		List<Integer> distict=dup.stream().distinct().collect(Collectors.toList());
		System.out.println(distict);

		List<Integer> number=Arrays.asList(10,1,9,2,8,7,3,5,4,6);
		List<Integer> sortingNum=number.stream().sorted().collect(Collectors.toList());
		List<Integer> sortingNumRev=number.stream().sorted(Comparator.reverseOrder()).toList();
		List<Integer> print5numbers=number.stream().limit(5).collect(Collectors.toList());
		List<Integer> skip5numbers=number.stream().skip(5).collect(Collectors.toList());


        System.out.println("Using Limit function :"+print5numbers);
        System.out.println("Using skip function :"+skip5numbers);

        System.out.println(sortingNum);
        System.out.println(sortingNumRev);
        

		

	}

}
