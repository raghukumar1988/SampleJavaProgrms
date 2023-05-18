
package java8features.streams3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*Refer: https://beginnersbook.com/2017/10/java-8-features-with-examples/ */
public class StreamParallelVsSequential5 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) {
			myList.add(i);
		}
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();

		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		highNums.forEach(p -> System.out.println("High Nums parallel="+p)); // Observe the order in output
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));

	}

}
