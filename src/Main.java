import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> ourSet = new HashSet<>();
        ourSet.add("hello");
        ourSet.add("world");
        System.out.println(ourSet.size());
        System.out.println(ourSet.isEmpty());
        System.out.println(ourSet.contains("hello"));
        System.out.println(ourSet);

        Iterator<String> it = ourSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Object[] setArray = ourSet.toArray();
        System.out.println(Arrays.toString(setArray));

        ourSet.remove("hello");
        System.out.println(ourSet.contains("hello"));

        ourSet.addAll(List.of("hello", "sun", "day", "winter", "summer"));
        System.out.println(ourSet);

        // world 113318802
        // hello 99162322
        // sun   114252
        // summer -891207761
        if ("summer".hashCode() > "hello".hashCode()) {
            System.out.println("summer string will be stored before hello");
        } else {
            System.out.println("hello string will be stored before summer");
        }

        ourSet.removeAll(List.of("summer", "winter"));
        System.out.println(ourSet);

        ourSet.retainAll(List.of("world", "hello"));
        System.out.println(ourSet);

        ourSet.clear();
        System.out.println(ourSet);


        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);
        System.out.println(numbers);
        for (Integer num : numbers) {
            System.out.println(num);
        }

        Comparator<Integer> descending = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        };

        Set<Integer> numbers1 = new TreeSet<>(descending);
        numbers1.add(5);
        numbers1.add(7);
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(3);
        numbers1.add(1);
        numbers1.add(10);
        System.out.println(numbers1);
        numbers1.forEach(System.out::println);  // advanced, no need to understand at this point

//        NonComparable nonComparable = new NonComparable();
//        NonComparable nonComparable2 = new NonComparable();
//        Set<NonComparable> nonComparableSet = new TreeSet<>();
//        nonComparableSet.add(nonComparable);
//        nonComparableSet.add(nonComparable2);

        Set<Integer> numbers2 = new LinkedHashSet<>();
        numbers2.add(5);
        numbers2.add(7);
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(3);
        numbers2.add(1);
        numbers2.add(10);
        System.out.println(numbers2);
    }
}