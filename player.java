/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the templat e in the editor.
 */
package footballmanagement;

/**
 *
 * @author Isratjahanpayel
 */


//The public class is a keyword ehich declars a mamber access as public.
//public members are visible to all other classes.

public class player extends person {
//    The Private keyword is an access modifier used for attributes,
//    methods and constractors, making them only accessable within the declared 
//    class.
//    mamber variable

    private double salary;
    
//    constructor
        public player( String name, int number, int age, double salary) {
        super(name, number, age);
        this.salary = salary;
    }
//getter method
        
    public double getSalary() {
        return salary;
    }
    
//setter method
    public void setSalary(double salary) {
        this.salary = salary;
    }



//display player name, jusrsy number, age, player salary
//    \n using for line break
    
//    The void keyword spesifices that a method should not have a return value.
    
    public void displayPlayer() {
        System.out.println("Player name: " + getName() + "\nPlayer Number: " + getNumber() + "\nPlayer Age: " + getAge()
                + "\nPlayer Salary: " + salary);
    }


}
