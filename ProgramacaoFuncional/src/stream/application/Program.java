package stream.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,7,8);
        Stream<Integer> st1 = list.stream().map(s -> s * s);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob").map(s -> s += 'A');
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, s -> s + 1);
        System.out.println(Arrays.toString(st3.limit(100).toArray()));

        // fibonacci;
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, s -> new Long[] {s[1], s[0] + s[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(100).toArray()));

    }
}
