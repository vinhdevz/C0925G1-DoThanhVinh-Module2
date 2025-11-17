package ss10_list_to_java.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity <= 0) capacity = DEFAULT_CAPACITY;
        elements = new Object[capacity];
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newSize = elements.length * 2;
            if (newSize < minCapacity) newSize = minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        elements[size++] = e;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        }

        E removed = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null; // tránh memory leak
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        }
        return (E) elements[index];
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Danh sách sau khi add:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Size: " + list.size());

        String removed = list.remove(1);
        System.out.println("\nĐã xóa: " + removed);

        System.out.println("Danh sách sau khi xóa:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Size: " + list.size());
    }
}
