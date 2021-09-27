package homework9;

import java.util.Collection;

public class MyLinkedList implements CustomCollection {
    Node firstNode;
    Node lastNode;
    int size;

    public MyLinkedList() {
        clear();
    }

    @Override
    public boolean add(String value) {
        if (size == 0) {
            firstNode = new Node(value,null);
            lastNode = firstNode;
        } else {
            Node previous = lastNode;
            lastNode = new Node(value, null);
            previous.next = lastNode;
        }
        size++;
        return true;
    }


    @Override
    public boolean addAll(String[] strArr) {
        for (String x : strArr) {
            add(x);
        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean clear() {
        firstNode = null;
        lastNode = null;
        size = 0;

        return true;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean equals(Collection coll) {
        return false;
    }
}
