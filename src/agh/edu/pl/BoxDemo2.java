package agh.edu.pl;

/**
 * Created by student6 on 2014-10-16.
 */
public class BoxDemo2 {
    public static void main(String[] args) {
// ONLY place Integer objects into this box!
        Box integerBox = new Box();
        integerBox.add("10");
        Integer someInteger = (Integer)integerBox.get();
        System.out.println(someInteger);
    }
}
