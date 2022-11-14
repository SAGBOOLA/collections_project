package org.example;

import java.util.*;

public class CollectionExercise {
    public static void main(String[] args) {
        ex12();
    }

    public static void ex1(){
        List<String> weekDay = new ArrayList<>();
        weekDay.add("MONDAY");
        weekDay.add("TUESDAY");
        weekDay.add("WEDNESDAY");
        weekDay.add("THURSDAY");
        weekDay.add("FRIDAY");
        weekDay.add("SATURDAY");
        weekDay.add("SUNDAY");
        System.out.println(weekDay);
    }

    public static void ex2(){
        List<String> weekDay = new ArrayList<>();
        weekDay.add("MONDAY");
        weekDay.add("TUESDAY");
        weekDay.add("WEDNESDAY");
        weekDay.add("THURSDAY");
        weekDay.add("FRIDAY");
        weekDay.add("SATURDAY");
        weekDay.add("SUNDAY");

        Iterator<String> weekDays = weekDay.iterator();
        while (weekDays.hasNext()){
            System.out.println(weekDays.next());
        }
    }

    public static void ex3(){
        List<String> weekDay = new ArrayList<>();
        weekDay.add("MONDAY");
        weekDay.add("TUESDAY");
        weekDay.add("WEDNESDAY");
        weekDay.add("FRIDAY");
        weekDay.add("SATURDAY");
        weekDay.add("SUNDAY");
        System.out.println("Before adding: " + weekDay);
        weekDay.add(3,"THURSDAY");
        System.out.println("After adding: " + weekDay);
    }

    public static void ex4(){
        List<String> weekDays = new ArrayList<>();
        weekDays.add("MONDAY");
        weekDays.add("TUESDAY");
        weekDays.add("WEDNESDAY");
        weekDays.add("THURSDAY");
        weekDays.add("FRIDAY");
        weekDays.add("SATURDAY");
        weekDays.add("SUNDAY");
        List<String> newList = weekDays.subList(0,3);
        System.out.println("Sublist: " + newList);
    }

    public static void ex5(){
        HashSet<String> days = new HashSet<>();
        days.add("MONDAY");
        days.add("TUESDAY");
        days.add("WEDNESDAY");
        days.add("THURSDAY");
        days.add("FRIDAY");
        days.add("SATURDAY");
        days.add("SUNDAY");
        System.out.println(days);
    }

    public static void ex6(){
        HashSet<String> days = new HashSet<>();
        days.add("MONDAY");
        days.add("TUESDAY");
        days.add("WEDNESDAY");
        days.add("THURSDAY");
        days.add("FRIDAY");
        days.add("SATURDAY");
        days.add("SUNDAY");
        ArrayList<String> arrayDays = new ArrayList<>(days);
        System.out.println(arrayDays);
    }

    public static void ex7(){
        HashSet<String> names = new HashSet<>();
        names.add("Sunmbo");
        names.add("Daphne");
        names.add("George");
        names.add("Jacob");
        names.add("Tinuke");
        ArrayList<String> newNames = new ArrayList<>(names);
        System.out.println("Before sorting: " + newNames);
        Collections.sort(newNames);
        System.out.println("After sorting: " + newNames);
    }

    public static void ex8(){
        HashSet<String> listNames = new HashSet<>();
        listNames.add("Adejoke");
        listNames.add("Joseph");
        listNames.add("Anderson");
        listNames.add("Uriel");
        listNames.add("Catherine");
        listNames.add("Edwin");

        System.out.println("Before sorting: " + listNames);
        TreeSet<String> names = new TreeSet<>(listNames);
        System.out.println("After sorting: " + names);
    }

    public static void ex9(){
        HashMap<Integer,String> vehicle = new HashMap<>();
        vehicle.put(504, "Peugeot");
        vehicle.put(450, "Benz");
        vehicle.put(470, "Lexus");
        vehicle.put(230, "Toyota");
        for (Map.Entry car : vehicle.entrySet()){
            System.out.println("Key: " + car.getKey() + ", Value: " + car.getValue());
        }
    }

    public static void ex10(){
        HashMap<Integer,String> vehicle = new HashMap<>();
        vehicle.put(504, "Peugeot");
        vehicle.put(450, "Benz");
        vehicle.put(470, "Lexus");
        vehicle.put(230, "Toyota");
        for (Map.Entry car : vehicle.entrySet()){
            System.out.println("Key: " + car.getKey());
        }
    }

    public static void ex11(){
        HashMap<Integer,String> vehicle = new HashMap<>();
        vehicle.put(504, "Peugeot");
        vehicle.put(450, "Benz");
        vehicle.put(470, "Lexus");
        vehicle.put(230, "Toyota");
        for (Map.Entry car : vehicle.entrySet()){
            System.out.println("Value: " + car.getValue());
        }
    }


    public static void ex12(){
        HashMap<Integer, Car> vehicle = new HashMap<>();
        vehicle.put(60, new Car(1, "Peugeot","504"));
        vehicle.put(61, new Car(2, "Benz", "E350"));
        vehicle.put(62, new Car(3, "Lexus", "GX470"));
        for(Car car : vehicle.values()){
            System.out.println(car.getBrand());
        }
    }
}
