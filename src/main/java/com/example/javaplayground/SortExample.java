package com.example.javaplayground;

import java.util.Arrays;
import java.util.Comparator;

public class SortExample {

    static class Person {
        int age;
        int bornAge;

        public Person(int age, int bornAge) {
            this.age = age;
            this.bornAge = bornAge;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", bornAge='" + bornAge + '\'' +
                    '}';
        }
    }

    public static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            if (o1.bornAge > o2.bornAge) {
                return 1;
            }

            if (o1.bornAge < o2.bornAge) {
                return -1;
            }

            if (o1.age > o2.age) {
                return 1;
            }

            if (o1.age < o2.age) {
                return -1;
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person(10, 0),
            new Person(5, 1),
            new Person(3, 0)
        };

        Arrays.sort(people, new PersonComparator());

        // 3, 5, 10
        System.out.println(Arrays.toString(people));
    }

}
