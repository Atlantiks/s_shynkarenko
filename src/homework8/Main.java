package homework8;

public class Main {
    public static void main(String[] args) {

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
        assert (!test2.equals(test));

        // Check clear
        assert (test.clear());
        assert (!test.contains("Some value"));
        assert (!test.delete("Some value"));
        assert (test.size() == 0);

        checkOperations();

    }

    private static void checkOperations() {
        // Check create collection
        MyStringCollectionImpl c = new MyStringCollectionImpl();
        assert (c.size() == 0);

        // Check add elements
        assert (c.add("one"));
        assert (c.add("two"));
        System.out.println(c);
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("two"));

        // Check contains element
        assert (c.contains("one"));
        assert (!c.contains("three"));


        // Check delete element by value
        assert (c.delete("two"));
        assert (!c.delete("two"));
        assert (c.size() == 1);


        // Check add element by index
        assert (c.add("four"));
        assert (!c.add(10, "five"));
        assert (c.add(1, "five"));
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("five"));
        assert (c.get(2).equals("four"));
        assert (c.delete("four"));

        // Check equals
        MyStringCollectionImpl c1 = new MyStringCollectionImpl();
        assert (c1.add("one"));
        assert (c1.add("five"));
        assert (c1.equals(c));
        assert (c1.add("ten"));
        assert (!c1.equals(c));


        // Check clear
        assert (c.clear());
        assert (!c.contains("Some value"));
        assert (!c.delete("Some value"));
        assert (c.size() == 0);
    }
}
