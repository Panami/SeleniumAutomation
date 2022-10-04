import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import junit.framework.Assert;

import java.util.ArrayList;

public class Test1 {

	// count the number of names starting with alphabet A in list
	@Test

	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhjeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}

		}
		System.out.println(count);
	}

	@Test
	public void StreamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhjeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		// There is no life for intermediate operation if there is no terminal
		// operation
		// terminal operation will execute only if intermediate operation
		// (filter) returns true
		// we can create stream
		// how to use filter in stream API

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		long d = Stream.of("Abhjeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println();
		// print all the name of Arraylist
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	@Test
	public void streamMap()

	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhjeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Rama");

		// print name which have last latter as "a" with Uppercase
		Stream.of("Abhjeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		List<String> names1 = Arrays.asList("Abhjeet", "Don", "Alekhya", "Adam", "Rama");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// merging two different list
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@Test
	public void streamCollect() {
		List<String> ls = Stream.of("Abhjeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(1));

		List<Integer> values = Arrays.asList(3, 2, 2, 5, 8, 7, 9, 4, 5, 7);
		// print unique number from this array
		// sort the array -3rd index -2,3,4,5,7,8,9
		// values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));

	}

}
