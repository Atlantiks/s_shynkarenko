package homework9;

import java.util.Collection;

public class MyLinkedList implements CustomCollection {
    Node firstNode;
    Node lastNode;
    int size;

    public MyLinkedList() {
        clear();
    }

    public MyLinkedList(String[] strArray) {
        clear();
        addAll(strArray);
    }

    @Override
    public boolean add(String value) {
        if (size == 0) {
            firstNode = new Node(value,null, null);
            lastNode = firstNode;
        } else {
            Node previous = lastNode;
            lastNode = new Node(value, previous, firstNode);
            previous.next = lastNode;
            firstNode.previous = lastNode;
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
        if (index == 0) {
            firstNode = firstNode.next;
            lastNode.next = firstNode;
        } else if (index < 0 || index > size - 1) {
            System.out.println("Index out of collection size bounds");
            return false;
        } else {
            Node previousNode = firstNode;
            Node followingNode = firstNode.next;

            for (int i = 1; i < index; i++) {
                previousNode = followingNode;
                followingNode = followingNode.next;
            }

            previousNode.next = followingNode.next;
        }
        size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        int successfulCounter = 0;

        if (firstNode.actual.equals(str)) {
            firstNode = firstNode.next;
            firstNode.previous = lastNode;
            successfulCounter++;
        }
        Node currentNode = firstNode;
        Node previousNode = firstNode.previous;
        Node nextNode = firstNode.next;

        for (int i = 0; i < size; i++) {
            if (currentNode.actual.equals(str)) {
                previousNode.next = nextNode;
                nextNode.previous = previousNode;
                successfulCounter++;
            }
            currentNode = currentNode.next;
            previousNode = currentNode.previous;
            nextNode = currentNode.next;
        }

        size -= successfulCounter;
        return successfulCounter != 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean contains(String str) {
        if (size == 0) return false;
        Node currentNode = firstNode;

        do {
            if (currentNode.actual.equals(str)) return true;
            currentNode = currentNode.next;
        } while (currentNode != lastNode);

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
        return this.size;
    }

    @Override
    public boolean trim() {
        return true;
    }

    @Override
    public boolean equals(Collection coll) {
        return false;
    }
}
