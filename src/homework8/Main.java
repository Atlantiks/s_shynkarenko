package homework8;

public class Main {
    public static void main(String[] args) {
        String[] sample = {"one","two","three","four"};
        String[] sample2 = {"one","three","five"};

        MyStringCollectionImpl test = new MyStringCollectionImpl(sample);
        StringCollection test2 = new MyStringCollectionImpl(sample2);
        test.add("four");
        test.add("five");

        System.out.println(test.get(3));
        System.out.println(test.size());
        //System.out.println(test.equals(test2));

        System.out.println(test.contains("four"));
        test.delete("four");
        test.print();
        System.out.println(test.equals(test2));
        test.clear();
    }
}
