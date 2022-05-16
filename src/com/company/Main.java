package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Circle деген класс тузунуз, анын PI деген свойствасы, area
        //жана circumference деген статик методдору болсун.
        //areaны табуу учун: PI * (radius * radius)
        //circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        Circle.area(a);
        Circle.circumference(a);
    }
}
