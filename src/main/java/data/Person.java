package data;

import lombok.Getter;

/**
 * Created by student14 on 30/11/2016.
 */

@Getter
public class Person {

    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}


//IsAdult
