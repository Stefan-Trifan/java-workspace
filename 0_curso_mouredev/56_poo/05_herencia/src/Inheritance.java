public class Inheritance {
    public static void main(String[] args) throws Exception {
        System.out.println("\n_______________________START\n");

        Animal miAnimal = new Animal("Mi Animal");
        miAnimal.eat();

        Dog miDog = new Dog("Mou", 20);
        miDog.eat();

        Cat miCat = new Cat("Cou");
        miCat.eat();

        Bird miBird = new Bird("Bo");
        miBird.eat();
        miBird.fly();

        System.out.println("\n_______________________END\n");
    }

    public static class Animal
    {
        // Atributos
        protected String name;

        // Constructores
        public Animal(String name)
        {
            this.name = name;
        }

        // Getters
        // Setters

        // Métodos públicos
        public void eat()
        {
            System.out.println("Mi animal con nombre " + this.name + " está comiendo");
        }

        // Métodos privados
    }

    public static class Dog extends Animal
    {
        // Atributos 
        int age;

        // Constructores 
        public Dog(String name, int age)
        {
            super(name);
            this.age = age;
        }

        // Getters // Setters

        // Métodos públicos
        @Override
        public void eat()
        {
            System.out.println("Mi perro con nombre " + this.name + " está comiendo");
        }

        // Métodos privados
    }

    public static class Cat extends Animal
    {

        // Atributos 
        
        // Constructores 
        public Cat(String name)
        {
            super(name);
        }

        // Getters // Setters 

        // Métodos públicos 
        @Override
        public void eat()
        {
            System.out.println("Mi gato con nombre " + this.name + " está comiendo");
        }
        
        // Métodos privados

    }

    public static class Bird extends Animal
    {
        // Atributos 
    
        // Constructores
        public Bird(String name)
        {
            super(name);
        }
        
        // Getters // Setters

        // Métodos públicos
        @Override
        public void eat()
        {
            System.out.println("Mi pajaro con nombre " + this.name + " está comiendo");
        }

        public void fly()
        {
            System.out.println("Mi pajaro está volando");
        }
        // Métodos privados
    }
}