package Lab2;

import java.util.Objects;

public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
    private T first, second;

    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @Override
    public boolean equals(Object o) {
        StorePairGeneric<T> another = (StorePairGeneric<T>) o;
        return first.equals(another.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public int compareTo(StorePairGeneric<T> o) {
        return getFirst().compareTo(o.getFirst());
    }
}

class Tester{
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);
        System.out.println("The comparison result a object with b object is : " + a.compareTo(b));
        System.out.println("The comparison result a object with c object is : " + a.compareTo(c));
        System.out.println("The comparison result b object with c object is : " + b.compareTo(c));
        System.out.println("First value of a object is equal to first value of b object : " + a.equals(b));
        System.out.println("First value of a object is equal to first value of c object : " + a.equals(c));
        System.out.println("First value of b object is equal to first value of c object : " + b.equals(c));

    }
}
