package main.home042.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ListToSet<T>{
    public Set<T> getSetFromList (ArrayList<T> list) {
        return new HashSet<>(list);
    }
}