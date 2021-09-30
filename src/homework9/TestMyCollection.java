package homework9;

public class TestMyCollection {
    public static void main(String[] args) {
        CustomCollection mylist = new MyLinkedList();
        CustomCollection anotherMylist = new MyLinkedList(new String[]{"Odessa","Kiev","Adelaida","Berlin","Tokyo"});

        mylist.addAll(new String[]{"1","2","3","4","5"});
        System.out.println(anotherMylist.contains("Odessa"));
        System.out.println(anotherMylist.contains("Moscow"));

        System.out.println(anotherMylist.get(3));
        System.out.println(anotherMylist.get(4));
        System.out.println(anotherMylist.get(5));

    }
}
