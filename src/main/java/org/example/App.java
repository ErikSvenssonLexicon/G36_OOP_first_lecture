package org.example;

import org.example.model.Person;
import org.example.model.Toy;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person erik = new Person("Erik", "Svensson", 25, false);
        erik.setAge(25);

        Person person = new Person();
        System.out.println("Firstname is " + person.getFirstName());
        System.out.println("Lastname is " + person.getLastName());
        System.out.println("Age is " + person.getAge());
        System.out.println("isSleeping " + person.isSleeping());

        erik.addToy(
                new Toy(
                        "Computer",
                        "Brand new gaming rig"
                )
        );

        System.out.println(Arrays.toString(erik.getToys()));
        System.out.println(erik.getPlayWithToys("ComPuTer"));
        System.out.println(erik.getPlayWithToys("Teddybear"));


        System.out.println("Calling toString method of erik:");

        System.out.println(erik);
        erik.addToy(new Toy("Teddy bear", "Fluffy and cuddly BOBO"));
        System.out.println(erik);
    }
}
