package org.example;

import java.util.Comparator;
import java.util.Objects;

public class SuperHero implements Comparable<SuperHero>{

    private int id;
    private String name;
    private int age;


    public SuperHero(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return id == superHero.id && age == superHero.age && Objects.equals(name, superHero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }


    @Override
    public int compareTo(SuperHero superHeroInput) {
        if (this.getAge() > superHeroInput.getAge()){
            return 1;
        } else if (this.getAge() < superHeroInput.getAge()) {
            return -1;
        }
        return 0;
    }
}
