package homework9;

public class TestMyCollection {
    public static void main(String[] args) {
        CustomCollection mylist = new MyLinkedList();
        CustomCollection anotherMylist = new MyLinkedList(new String[]{"Odessa", "Kiev", "Adelaida", "Berlin", "Tokyo"});

        mylist.addAll(new String[]{"2","2","1","2","3"});
        System.out.println("Does list contain Odessa? " + anotherMylist.contains("Odessa"));
        System.out.println("Does list contain Moscow? " + anotherMylist.contains("Moscow"));

        System.out.println(mylist.contains("3"));

        System.out.println("Size or LinkedList: " + mylist.size());
        System.out.println(mylist.delete("2"));
        System.out.println("Size or LinkedList: " + mylist.size());
        System.out.println(mylist.get(0));
        System.out.println(mylist.get(1));
        System.out.println(mylist.get(2));
        System.out.println(mylist.delete("1"));
        System.out.println("Size or LinkedList: " + mylist.size());

        System.out.println(mylist.get(0));
        System.out.println(mylist.get(1));
        System.out.println(mylist.get(2));
        System.out.println(mylist.get(3));
        System.out.println(mylist.get(4));


    }
}
