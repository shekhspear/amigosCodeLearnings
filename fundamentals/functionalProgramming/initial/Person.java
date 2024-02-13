package functionalProgramming.initial;

import functionalProgramming.initial.Gender;

public class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public Gender getGender(){
        return gender;
    }

    public String toString() {
        return "functionalProgramming.initial.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
