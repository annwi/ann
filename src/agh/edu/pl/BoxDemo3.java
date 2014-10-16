package agh.edu.pl;

/**
 * Created by student6 on 2014-10-16.
 */
public class BoxDemo3 {
    public static void main(String[] args) {
        BoxT<Integer> integerBox;
        integerBox = new BoxT<Integer>();
        integerBox.add(new Integer(10));
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}
