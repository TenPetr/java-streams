package com.tenpetr;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person(20, "Name 1", "Surname 1"));
        people.add(new Person(25, "Name 2", "Surname 2"));
        people.add(new Person(30, "Name 3", "Surname 3"));
        people.add(new Person(35, "Name 4", "Surname 4"));
    }
}
