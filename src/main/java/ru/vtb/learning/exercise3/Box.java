package ru.vtb.learning.exercise3;

import java.util.ArrayList;

public class Box<T extends Fruit>  implements Comparable<Box>{
    private ArrayList<T> arrayList = new ArrayList<>();

    public float getWeigth(){
        if(arrayList.size() == 0){
            return 0.0f;
        }

        return arrayList.size() * arrayList.get(0).getWeigth();
    }

    public void add(T fruit){
        arrayList.add(fruit);
    }

    public void merge(Box<T> box){
        this.arrayList.addAll(box.arrayList);
        box.arrayList.clear();
    }

    public boolean compare(Box box){
        return compareTo(box) == 0;
    }

    @Override
    public int compareTo(Box o) {
        float diff = this.getWeigth() - o.getWeigth();
        if(diff < 0){
            return -1;
        }

        if(diff > 0) {
            return 1;
        }

        return 0;
    }
}
