package com.itProger;

import java.util.Random;

public class Worker {
    private String name;
    private int age;
    private String sex;
    private double productivity;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getProductivity() {
        return productivity;
    }
    


    public Worker(String name, int age, String sex, double productivity) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.productivity = productivity;
    }
   
    
    @Override
    public String toString() {
        return "Worker{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + ", productivity="
                + productivity + '}';
    }
}
