import devices.Car;

import java.time.LocalDateTime;

public class Human
{
    String firstName;
    String lastName;
    Animal pet;
    private Car car;
    private Car carowner;
    Double Salary = 3500.0;
    Double AddSalary = 2000.0;
    LocalDateTime localDateTime1 = LocalDateTime.now();

    Double getYourSalary()
    {
        System.out.println("Last report time and salary: ");
        System.out.println("LocalDateTime #1: " + localDateTime1);
        return Salary;
    }
    double NewSalary = Salary + AddSalary;
    Double setYourSalary()
    {
        if (AddSalary < 0) {
            System.out.println("Salary cannot be less than 0.");
        } else {
            System.out.println("The new salary has been successfully sent to the accounting system.");
            System.out.println("You need to collect the annex to the contract from Mrs. Hania from HR.");
            System.out.println("ZUS and US know about the change in payment, from now on you will not hide anything.");
            System.out.println("your new salary is: " + NewSalary);
        }
    return NewSalary;
    }

    public Car getCar()
    {
        return this.car;
    }



    public void setCar(Car car){
        if (Salary > car.value){
            System.out.println("You have bought a car!");
            carowner = car;
        }else if(Salary > car.value/12){
            System.out.println("you bought a car but on credit!");
            carowner = car;
        }else {
            System.out.println("Enroll in college and find a new job or go for a raise...");
        }
    }

    public String toString() {
        return this.firstName + " " +this.lastName;
    }



}