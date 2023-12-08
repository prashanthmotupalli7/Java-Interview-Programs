package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsOps {
public static void main(String[] args) {
	List<Integer> a= Arrays.asList(11,2,7,18,44,12,52);
	List<Integer> asecdeningOrder=a.stream().sorted().collect(Collectors.toList());
	System.out.println("asecending Order : "+asecdeningOrder);
	
	List<Integer> descendingOrder=a.stream().sorted((n1,n2)->n2-n1).collect(Collectors.toList());
	System.out.println("desecending Order : "+descendingOrder);
	
	Optional<Integer> max=	a.stream().max(Integer::compare);
	System.out.println("maximum "+max);
	
	Optional<Integer> min=	a.stream().min(Integer::compare);
	System.out.println("minimum "+min);
	
}
}
