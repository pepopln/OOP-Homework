package Tuple;


public class Tuple<T> implements Thruple<T> {
    private T first;
    private T second;
    private T third;

    public Tuple(T first, T second, T third) {
        this.setFirst( first);
        this.setSecond(second);
        this.setThird(third);
    }

    private void setFirst(T first) {
        this.first = first;
    }

    private void setSecond(T second) {
        this.second = second;
    }

    private void setThird(T third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s",this.first,this.second,this.third);
    }

    @Override
    public T getFirst() {
        return this.first;
    }

    @Override
    public T getSecond() {
        return this.second;
    }

    @Override
    public T getThird() {
        return this.third;
    }
}
