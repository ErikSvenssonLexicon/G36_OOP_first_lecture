package org.example.model;

import java.util.Objects;

public class Toy {
    private String toyName;
    private String description;

    public Toy(String toyName, String description) {
        this.toyName = toyName;
        this.description = description;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlayDescription(){
        return "play with " + toyName;
    }

    public String toString(){
        return getToyName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Objects.equals(toyName, toy.toyName) && Objects.equals(description, toy.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toyName, description);
    }
}
