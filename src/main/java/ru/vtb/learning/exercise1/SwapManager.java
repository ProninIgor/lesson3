package ru.vtb.learning.exercise1;

public class SwapManager {
    public <T> void Swap(T [] array, int pos1, int pos2){
        int size = array.length;

        if(pos1 > size || pos1 < 0 || pos2 > size || pos2 < 0){
            throw new ArrayIndexOutOfBoundsException();
        }

        T obj1 = array[pos1];
        T obj2 = array[pos2];
        array[pos1] = obj2;
        array[pos2] = obj1;
    }
}
