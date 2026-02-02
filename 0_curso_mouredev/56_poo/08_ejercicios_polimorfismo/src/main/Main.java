package main;

import java.util.ArrayList;

import e01.*;
import e02.*;
import e03.*;
import e04.*;
import e06.*;
import e07.*;
import e08.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");
        // 1. Crea una clase Animal con el método makeSound().
        // Luego crea subclases Dog, Cat y Cow
        // que sobrescriban ese método con sonidos diferentes.
        // Llama al método desde una lista de Animal.
        System.out.println("1 ->");
        ArrayList<Animal> misAnimals = new ArrayList<>();
        misAnimals.add(new Dog());
        misAnimals.add(new Cat());
        misAnimals.add(new Cow());
        for (Animal a : misAnimals)
        {
            System.out.print(a.getType() + " -> ");
            a.makeSound();
        }
        System.out.println("---");

        // 7. Crea una función showAnimalType(Animal animal)
        // que imprima el tipo de animal.
        // Pasa diferentes subclases (Dog, Cat, Horse)
        // para que cada una imprima su tipo
        // con su propio getType() sobrescrito.
        System.out.println("7 ->");
        showAnimalType(misAnimals.get(0));
        System.out.println("---");

        // 2. Crea una clase Shape con el método calculateArea().
        // Luego implementa subclases Circle y Rectangle
        // con sus propias fórmulas.
        // Usa una lista de Shape para recorrer e imprimir
        // el área de varias figuras.
        System.out.println("2 ->");
        ArrayList<Shape> misShapes = new ArrayList<>();
        misShapes.add(new Rectangle(3, 4));
        misShapes.add(new Circle(5));
        for (Shape shape : misShapes)
        {
            System.out.println(shape.calculateArea());
        }

        System.out.println("---");
                 
        // 3. Crea una clase Printer con varios métodos print() sobrecargados que
        // acepten diferentes tipos de parámetros
        // (String, int, double).
        // Llama a cada uno desde main.
        System.out.println("3 ->");
        Printer mPrinter = new Printer();
        mPrinter.imprimir(2.2);
        System.out.println("---");

        // 4. Crea una clase Greeter con dos métodos greet():
        // uno que salude con “Hello”,
        // y otro que reciba un nombre y salude con
        // “Hello, [nombre]”.
        System.out.println("4 ->");
        Greeter mGreeter = new Greeter();
        mGreeter.greet();
        mGreeter.greet("Steve");
        System.out.println("---");

        // 6. Crea una clase Notification con método send(), 
        // y subclases EmailNotification, SMSNotification.
        // Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        System.out.println("6 ->");
        Notification n = new SMSNotification();
        sendNotification(n);
        System.out.println("---");

        // 8. Crea una clase Converter con métodos
        // convert(int), convert(double), y convert(String)
        // que devuelvan diferentes formatos de texto.
        System.out.println("8 ->");

        System.out.println("---");

        // 9. Crea una clase Product con el método getPrice().
        // Luego, Book y Electronic deben sobrescribirlo
        // con su propia lógica de descuento.
        // Recorre una lista de Product
        // e imprime el precio final de cada uno.
        System.out.println("9 ->");

        System.out.println("---");
        System.out.println("\n_______________________END\n"); 
    }

    public static void showAnimalType(Animal animal)
    {
        System.out.println(animal.getType());
    }

    public static void sendNotification(Notification n)
    {
        n.send();
    }
}