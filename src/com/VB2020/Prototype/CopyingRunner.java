package com.VB2020.Prototype;

public class CopyingRunner {
    public static void main(String[] args) {
        Book main = new Book(1, "Ruslan_and_Ludmila", "Pushkin");
        BookFactory factory = new BookFactory(main);
        Book mainClone = factory.cloneRestaurant();
        System.out.println(main);
        System.out.println("----------------------------------------------");
        System.out.println(mainClone);

        //return false:
        System.out.println(main == mainClone);
        System.out.println(main.equals(mainClone));
    }
}
