package com.company.LinkedList;


import java.util.ArrayList;

public class LinkedList {
    private class Node {
        int data;
        Node next;

        public Node() {
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head, tail;
    private int size;

    public void display() {
        display(head);
    }

    private void display(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println();
    }

    public void addLast(int item) {
        //1. create a new node;
        Node node = new Node(item, null);

        //2. check the size of linkedlist

        if (size >= 1) {
            this.tail.next = node;
            this.tail = node;
            this.size++;
        } else {
            this.head = node;
            this.tail = node;
            this.size++;
        }
    }

    public void addFirst(int item)  {
        Node node = new Node(item, null);
        if (size >= 1) {
            node.next = this.head;
            head = node;
            this.size++;
        } else {
            this.head = node;
            this.tail = node;
            this.size++;
        }
    }

    public int getFirst() throws Exception {
        if (size == 0)
            throw new Exception("LL is empty");
        return this.head.data;
    }

    public int getLast() throws Exception {
        if (size == 0)
            throw new Exception("LL is empty");
        return this.tail.data;
    }

    public int getAt(int index) throws Exception {
        if (index == 0)
            return getFirst();
        else if (index == size - 1)
            return getLast();
        else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public Node getNodeAt(int index) throws Exception {
        if (size == 0)
            throw new Exception("LL is empty");
        if (index < 0 || index >= size)
            throw new Exception("Invalid index");
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public void addNodeAt(int index, int item) throws Exception {
        if (index == 0)
            addFirst(item);
        else if (index == size - 1)
            addLast(item);
        else {
            Node temp = getNodeAt(index - 1);
            Node node = new Node(item, temp.next);
            temp.next = node;
            this.size++;
        }
    }

    public int removeFirst() throws Exception {
        if (size == 0)
            throw new Exception("LL is already empty");
        int data = head.data;
        if (size > 1) {
            this.head = this.head.next;
            this.size--;
        } else {
            this.head = null;
            this.tail = null;
            this.size--;
        }
        return data;
    }


    public int removeLast() throws Exception {
        if (size == 0)
            throw new Exception("LL is already empty");
        int data = tail.data;
        if (size > 1) {
            Node temp = getNodeAt(size - 2);

            tail = temp;
            tail.next = null;
            this.size--;
        } else {
            this.head = null;
            this.tail = null;
            this.size--;
        }
        return data;
    }

    public int removeAt(int index) throws Exception {
        if (size == 0)
            throw new Exception("LL is already empty");
        if (index < 0 || index >= size)
            throw new Exception("Invalid index");
        if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else {

            Node prev = getNodeAt(index - 1);
            Node pres = prev.next;
            Node next = pres.next;
            prev.next = next;
            this.size--;
            return pres.data;
        }
    }

    public void reverseData() throws Exception {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            Node ln = getNodeAt(left);
            Node rn = getNodeAt(right);
            int temp = ln.data;
            ln.data = rn.data;
            rn.data = temp;
            left++;
            right--;
        }
    }

    public int mid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void reverseRecr() {
        reverseRecr(head);
    }

    private void reverseRecr(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverseRecr(node.next);
        this.tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseItr() {
        if (size <= 1)
            return;

        Node prev = null;
        Node present = head;
        Node next = present.next;
        tail = head;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null)
                next = next.next;
        }
        head = prev;
    }

    private ArrayList findAll(int value) {
        Node temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        while (temp != null) {
            if (temp.data == value) {
                list.add(index);
            }
            temp = temp.next;
            index++;
        }
        return list;
    }

    public boolean exist(int value) throws Exception {
        if (size == 0)
            throw new Exception("LL is empty");
        return exist(value, head);

    }

    private boolean isEmpty() {
        return size == 0 ? true : false;
    }

    private boolean exist(int value, Node node) {
        if (node == null)
            return false;
        return node.data == value || exist(value, node.next);
    }

    public LinkedList merge(LinkedList first, LinkedList second) throws Exception {
        LinkedList merge = new LinkedList();

        while (!first.isEmpty() && !second.isEmpty()) {
            if (first.head.data < second.head.data) {
                merge.addLast(first.removeFirst());
            } else {
                merge.addLast(second.removeFirst());
            }
        }
        while (!first.isEmpty()) {
            merge.addLast(first.removeFirst());
        }
        while (!second.isEmpty())
            merge.addLast(second.removeFirst());

        return merge;
    }

    public void duplicate() {
        if (size <= 1)
            return;
        Node temp = head;
        while (temp != null) {
            if (temp.data == temp.next.data)
                temp.next = temp.next.next;
            temp = temp.next;
        }
    }
}
