package ru.vtb.learning.exercise3;

public class Program {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println(orangeBox.compare(appleBox));

        orangeBox.add(new Orange());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        appleBox.merge(appleBox2);
        System.out.println(appleBox.getWeigth());
        System.out.println(appleBox2.getWeigth());


    }
}
