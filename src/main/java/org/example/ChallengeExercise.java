package org.example;

import java.util.*;

public class ChallengeExercise {
    public static void main(String[] args) {
        ex3();
    }

    public static void ex1(){
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("MONDAY");
        weekDays.add("TUESDAY");
        weekDays.add("WEDNESDAY");
        weekDays.add("THURSDAY");
        weekDays.add("FRIDAY");
        weekDays.add("SATURDAY");
        weekDays.add("SUNDAY");

        HashSet<String> weekDay = new HashSet<>();
        weekDay.add("SATURDAY");
        weekDay.add("SUNDAY");

        System.out.println("Before comparing: " + weekDays);
        weekDays.retainAll(weekDay);
        System.out.println("After comparing: " + weekDays);
    }

    public static void ex2(){
        HashMap<String,String> details = new HashMap<>();
        details.put("adejohn@gmail.com", "John");
        details.put("henry24@gmail.com", "Henry");
        details.put("willcarinton@yahoo.co.uk", "Will");

        Set<String> detail = details.keySet();
        Iterator<String> itr = detail.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void ex3(){
        List<SuperHero> heroes = new ArrayList<>();
        heroes.add(new SuperHero(1, "Batman", 49));
        heroes.add(new SuperHero(2, "Superman", 51));
        heroes.add(new SuperHero(3,"Ironman", 45));
        heroes.add(new SuperHero(4, "Hulk", 42));
        heroes.add(new SuperHero(5, "Thor", 47));
        heroes.add(new SuperHero(6, "Captain America", 70));

        Collections.sort(heroes);
        for (SuperHero hero : heroes){
            System.out.println(hero.getAge() + " " + hero.getName());
        }
    }

    public static void ex4(){
        int [] array = {1,4,4,2,6,7};
        Set<Integer> newArray = new HashSet<>();
        for (Integer digit : array){
            newArray.add(digit);
        }
        System.out.println(newArray);
    }

    public static void ex5(){
        Integer[] array = {1,4,4,2,6,7};
        List<Integer> newArray = Arrays.asList(array);
        Set<Integer> digit = new HashSet<>(newArray);
        System.out.println(digit);
    }
}
