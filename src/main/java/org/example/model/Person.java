package org.example.model;

import java.util.Arrays;
import java.util.Objects;

public class Person {


    private String firstName; //this.firstName
    private String lastName; //and so on
    private int age;
    private boolean sleeping;
    private Toy[] toys;

    public Person(String firstName, String lastName, int age, boolean sleeping){
        if(age < 0) throw new IllegalArgumentException("Age cant be negative");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sleeping = sleeping;

    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0, false);
    }

    public Person(){
        this("undefined", "undefined");
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public boolean isSleeping(){
        return sleeping;
    }

    public void setSleeping(boolean sleeping){
        this.sleeping = sleeping;
    }

    public Toy[] getToys() {
        if(toys == null) toys = new Toy[0];
        return toys;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }

    public void addToy(Toy toy){
        if(toy != null){
            if(toys == null) toys = new Toy[0];
            toys = Arrays.copyOf(toys, toys.length + 1);
            toys[toys.length-1] = toy;
        }
    }

    public String getPlayWithToys(String toyName){
        if(toys == null) toys = new Toy[0];
        String message = firstName + " could not find any" + toyName + " to play with";
        for(Toy toy : toys){
            if(toy.getToyName().equalsIgnoreCase(toyName)){
                return firstName + " " + toy.getPlayDescription();
            }
        }
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && sleeping == person.sleeping && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, sleeping);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sleeping=" + sleeping +
                ", toys=" + Arrays.toString(toys) +
                '}';
    }

}
