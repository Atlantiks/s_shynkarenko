package homework8;

public class Main {
    public static void main(String[] args) {
        String[] sample = {"three","four"};
        String[] sample2 = {"one","three","five"};

        MyStringCollectionImpl test = new MyStringCollectionImpl();

        assert (test.size() == 0);
        assert (test.add("one"));
        assert (test.add("two"));
        System.out.println(test);
        assert (test.get(0).equals("one"));
        assert (test.get(1).equals("two"));

        // Check contains element
        assert (test.contains("one"));
        assert (!test.contains("three"));

        // Check delete element by value
        assert (test.delete("two"));
        assert (!test.delete("two"));
        assert (test.size() == 1);

        // Check add element by index
        assert (test.add("four"));
        assert (!test.add(10, "five"));
        assert (test.add(1, "five"));
        assert (test.get(0).equals("one"));
        assert (test.get(1).equals("five"));
        assert (test.get(2).equals("four"));
        assert (test.delete("four"));

        // Check equals
        MyStringCollectionImpl test2 = new MyStringCollectionImpl();
        assert (test2.add("one"));
        assert (test2.add("five"));
        assert (test2.equals(test));
        assert (test2.add("ten"));
        System.out.println(test2.equals(test));
        //assert (!test2.equals(test));


    }
}
