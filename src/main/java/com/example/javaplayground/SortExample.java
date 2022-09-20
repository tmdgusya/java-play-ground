package com.example.javaplayground;

import java.util.Arrays;

public class SortExample {

    static class Person implements Comparable<Person> {

        public Person(int age) {
            this.age = age;
        }

        int age;

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Person o) {
            return o.age * -1;
        }
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person(10),
            new Person(5),
            new Person(3)
        };

        Arrays.sort(people);

        // 3, 5, 10
        System.out.println(Arrays.toString(people));
    }

}
