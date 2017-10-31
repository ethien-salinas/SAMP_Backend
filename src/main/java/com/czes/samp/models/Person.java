package com.czes.samp.models;

import java.io.Serializable;

public class Person implements Serializable {

    private final static long serialVersionUID = 159487263L; 

    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
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
}