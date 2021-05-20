package ru.vtb.learning.exercise2;

import java.util.ArrayList;
import java.util.List;

public class CastManager {
    public <T>ArrayList<T> CastToArrayList(T[] array){
        return new ArrayList<T>(List.of(array));
    }
}
