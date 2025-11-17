package ss10_list_to_java.thuc_hanh.trien_khai_lop_list_don_gian;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Phần tử index 2: " + list.get(2));

        ArrayList<String> lister = new ArrayList<>();
        lister.add("Hello");
        lister.add("Java");
        System.out.println("Phần tử index i : " + lister.get(1));
        }
    }

