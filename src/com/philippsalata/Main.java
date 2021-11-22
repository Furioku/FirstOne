package com.philippsalata;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> nameToMeal = new HashMap<>();

        nameToMeal.put("Philipp", "Salad");
        nameToMeal.put("Mari", "Sushi");
        nameToMeal.put("Hinata", "Pizza");

       // System.out.println(nameToMeal.get("Philipp"));

        Set<String> keys = nameToMeal.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

        Collection<String> values = nameToMeal.values();

        for (String value: values) {
            System.out.println(value);
        }
        /*Set<String> meals = new HashSet<>();
        meals.add("Pizza");
        meals.add("Burger");
        meals.add("Pizza");
        meals.add("Salad");

        for (String meal :
                meals) {
            System.out.println(meal);

        }
       /*List<String> names = new ArrayList<>();
       names.add("Sasha");
       names.add("Hinata");
       names.add("Mari");
       names.add("Sasha");
       Collections.sort(names);
        System.out.println(names.isEmpty());

        for (String name:names) {
            System.out.println(name);
        }
        names.remove("Sasha");
        System.out.println(names.contains("Philipp"));
        System.out.println(names.contains("Mari"));
        System.out.println(names.get(0));

        /*System.out.println(args[0]);
        */
       /* String[] names = new String[4];

        names[0] = "Sania";
        names[1] = "Philipp";
        names[2] = "Mari";
        names[3] = "Ishiki";

        for (String name : names) {
            System.out.println(name);

        /*for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {
            System.out.println("Give a number");
            int usersNumber = scanner.nextInt();
            if (usersNumber < numberToGuess) {
                System.out.println("Number is too little");
            } else if (usersNumber > numberToGuess) {
                System.out.println("number is too big");
            } else {
                System.out.println("Good job");
                wasNumberGuessed = true;

            }
        /*for (int i = 1; i < 101;i++ ){
            if (i % 15 ==0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        /*int i = 0;

        while (i<10) {
            System.out.println(i);
            i++;
        }
        boolean skyIsBlue = false;
        do {
            System.out.println("Sky is Blue");
        } while (
                skyIsBlue
        );
        /*for (int i=0; i<10; i++) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the name");
        String name = scanner.nextLine();

        System.out.println("Hey " + name);

        if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Congratz! You are women");
        } else if (!name.isEmpty() && !name.endsWith("a")) {
            System.out.println("Eeeh, you are a man");
        }*/
        }
    }

