package main;

import t.T;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(1);

        ArrayList<Integer> a = new T().t(arrayList);

        for (Integer i : a) {
            System.out.println(i);
        }


    }
}
