package agh.edu.pl;

/**
 * Created by student6 on 2014-10-16.
 */
public class BoxT<T> {
    private T t;
    public void add(T t){
        this.t = t;

    }
    public T get(){
        return t;
    }
}
