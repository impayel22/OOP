/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballmanagement;

/**
 *
 * @author Isratjahanpayel
 */
//super class
public class person {
    private String name;
    private int number;
    private int age;
    
    //constructor
    public person(String name, int number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

//    getter method
    public String getName() {
        return name;
    }
//setter method
    public void setName(String name) {
        this.name = name;
    }

//    getter method
    public int getNumber() {
        return number;
    }

//    setter method
    public void setNumber(int number) {
        this.number = number;
    }

//    getter method
    public int getAge() {
        return age;
    }
    
//setter method
    public void setAge(int age) {
        this.age = age;
    }
    

}
