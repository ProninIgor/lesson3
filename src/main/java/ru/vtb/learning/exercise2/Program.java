package ru.vtb.learning.exercise2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        CastManager castManager = new CastManager();
        ArrayList<String> stringArrayList = castManager.CastToArrayList(new String[]{"apple", "pear", "banana"});
        System.out.println(stringArrayList.getClass().getTypeName());
    }
}
