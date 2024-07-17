package pipeline.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x,y) -> x * 2 - y);
        System.out.println(sum);

        List<Integer> newList = list.stream().filter(x -> x % 2 != 0).map(x -> x * 2).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}
