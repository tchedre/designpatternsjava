package com.premaseem.icecreams;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class StrawberryIceCream {
    String brand = "un branded";
    Integer cost = 2;
    Integer calories = 200;

    @Override
    public String toString () {
        return this.getClass().getSimpleName() + " with Calories: " + calories + " and cost: $" + cost;
    }
}