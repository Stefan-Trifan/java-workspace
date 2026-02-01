package main;

import java.util.ArrayList;

import e01.*;
import e02.*;
import e03.*;
import e04.*;
import e05.*;
import e06.*;
import e07.*;
import e08.*;
import e10.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        // 1. Crea una clase Vehicle con un método move().
        // Luego crea una subclase Car que herede de Vehicle
        // y agrega el método honk().
        System.out.println("1 ->");
        Vehicle miVehicle = new Vehicle();
        Car miCar = new Car();
        miVehicle.move();
        miCar.move();
        miCar.honk();
        System.out.println("---");

        // 2. Define una clase Person con los atributos name y age.
        // Luego crea una clase Student
        // que agregue el atributo grade y un método study().
        System.out.println("2 ->");
        Person miPerson = new Person();
        Student miStudent = new Student();
        System.out.println("---");

        // 3. Crea una clase Animal con el método makeSound().
        // Haz que Dog diga “Woof” y Cat diga “Meow”
        // sobrescribiendo ese método.
        System.out.println("3 ->");
        Animal miAnimal = new Animal();
        Dog miDog = new Dog();
        Cat miCat = new Cat();

        System.out.print("miAnimal.makeSound() -> ");
        miAnimal.makeSound();
        System.out.print("miDog.makeSound() -> ");
        miDog.makeSound();
        System.out.print("miCat.makeSound() -> ");
        miCat.makeSound();
        System.out.println("---");

        // 4. La clase Employee tiene los atributos name y salary.
        // Manager hereda de Employee y agrega el atributo department.
        System.out.println("4 ->");
        Employee miEmployee = new Employee();
        Manager miManager = new Manager();
        System.out.println("---");

        // 5. Crea una clase abstracta Shape
        // con un método calculateArea().
        // Luego implementa ese método en Circle y Rectangle.
        System.out.println("5 ->");
        Circle miCircle = new Circle();
        Rectangle miRectangle = new Rectangle();

        miRectangle.base = 5;
        miRectangle.altura = 3;
        miRectangle.calculateArea();
        System.out.println("Area rectangulo es: " + miRectangle.area);

        miCircle.radio = 5;
        miCircle.calculateArea();
        System.out.println("Area circulo es: " + miCircle.area);

        System.out.println("---");

        // 6. Crea una clase Bird con el método fly().
        // Luego crea Eagle que sobrescriba fly()
        // pero también llame al método original con super.fly().
        System.out.println("6 ->");
        Bird miBird = new Bird();
        Eagle miEagle = new Eagle();

        miEagle.fly();
        System.out.println("---");

        // 7. Haz una clase Device
        // con un constructor que imprima “Device created”.
        // Luego crea Phone que herede de Device
        // y en su constructor imprima “Phone ready”.
        System.out.println("7 ->");
        Device miDevice = new Device();
        Phone miPhone = new Phone();
        System.out.println("---");

        // 8. Account tiene un saldo 
        // y métodos para deposit() y withdraw().
        // SavingsAccount hereda y agrega un método addInterest().
        System.out.println("8 ->");
        Account miAccount = new Account();
        SavingsAccount miSavingsAccount = new SavingsAccount();

        miAccount.deposit(20);
        miAccount.withdraw(10);

        System.out.println(miAccount.saldo);
        System.out.println(miSavingsAccount.saldo);
        System.out.println("---");

        // 10. Crea un ArrayList<Animal>
        // que contenga instancias de Dog, Cat y Bird.
        // Recorre la lista y llama a makeSound().
        System.out.println("10 ->");
        ArrayList<Animal10> misAnimals = new ArrayList<>();
        misAnimals.add(new Dog10());
        misAnimals.add(new Cat10());
        misAnimals.add(new Bird10());

        for(int i = 0; i < misAnimals.size(); i++)
        {
            misAnimals.get(i).makeSound();
        }

        System.out.println("---");

        System.out.println("\n_______________________END\n");
    }
}