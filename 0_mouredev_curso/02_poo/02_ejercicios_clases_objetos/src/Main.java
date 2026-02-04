public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        // 1. Crea una clase Person con atributos privados name y age.
        // Usa los métodos getName(), setName(), getAge() y setAge()
        // para asignar y mostrar valores desde otra clase.
        System.out.println("Ejercicio 1 ");
        Person miPersona = new Person();
        miPersona.setName("Pepe");
        miPersona.setAge(60);
        System.out.println(
            "Mi nombre es " + miPersona.getName() + " y tengo " + miPersona.getAge() + " años");
        System.out.println("\n---\n");

        // 2. Crea una clase Product con el atributo privado price.
        // Añade el método setPrice(double price) que solo permita precios mayores a 0.
        System.out.println("Ejercicio 2");
        Product miProducto = new Product();
        miProducto.setPrice(20);
        System.out.println("El precio de mi producto es " + miProducto.getPrice());
        System.out.println("\n---\n");

        // 3. Crea una clase BankAccount con el atributo privado balance.
        // Implementa los métodos deposit(double amount) y withdraw(double amount) que
        // validen las cantidades correctamente.
        System.out.println("Ejercicio 3");
        BankAccount miCuenta = new BankAccount();
        miCuenta.deposit(20);
        miCuenta.withdraw(10);
        System.out.println("Tienes " + miCuenta.getBalance() + " euros");
        System.out.println("\n---\n");

        // 4. Crea una clase Book con el atributo privado title.
        // Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()).
        // El título debe asignarse solo por el constructor.
        System.out.println("Ejercicio 4");
        Book miLibro = new Book("La 100nicienta");
        System.out.println("Mi libro es " + miLibro.getTitle());
        System.out.println("\n---\n");

        // 5. Crea una clase Temperature con el atributo privado celsius.
        // El método setCelsius(double celsius) solo debe aceptar valores entre -100 y
        // 100.
        System.out.println("Ejercicio 5");
        Temperature miTemperature = new Temperature();
        miTemperature.setCelsius(20);
        System.out.println("Mi temperatura es " + miTemperature.getCelsius());
        System.out.println("\n---\n");

        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los métodos setUsername(String username), setPassword(String
        // password)
        // y checkPassword(String inputPassword) que compare contraseñas.
        System.out.println("Ejercicio 6");
        User miUser = new User();
        miUser.setUsername("steve.trf");
        miUser.setPassword("miContaraena");
        if (miUser.checkPassword("miContaraena"))
            System.out.println("La contraseña es correcta");
        else
            System.out.println("Contraseña incorrecta");
        System.out.println("\n---\n");

        // 7. Crea una clase Employee con el atributo privado salary.
        // Agrega el método raiseSalary(double percent) que solo permita aumentos
        // positivos.
        System.out.println("Ejercicio 7");
        Employee miEmployee = new Employee(1000);
        miEmployee.raiseSalary(0.20);
        System.out.println("Mi nuevo salario es: " + miEmployee.getSalary());
        System.out.println("\n---\n");

        // 8. Crea una clase Rectangle con los atributos privados width y height.
        // Agrega setters y el método calculateArea()
        // que devuelva el resultado de width * height.
        System.out.println("Ejercicio 8");
        Rectangle miRectangle = new Rectangle();
        miRectangle.setWidth(20);
        miRectangle.setHeight(20);
        System.out.println("El area es " + miRectangle.calculateArea());
        System.out.println("\n---\n");

        // 9. Crea una clase Student con el atributo privado grade.
        // Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la
        // nota es mayor o igual a 60.
        System.out.println("Ejercicio 9");
        Student miStudent = new Student();
        miStudent.setGrade(50);
        if (miStudent.isPassed())
            System.out.println("He aprobado");
        else
            System.out.println("No he aprobado");
        System.out.println("\n---\n");

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos
        // accelerate(int amount) que aumente la velocidad (máximo 120)
        System.out.println("Ejercicio 10");
        Car miCar = new Car();
        miCar.accelerate(20);
        miCar.accelerate(30);
        System.out.println("Mi velocidad es: " + miCar.getSpeed());
        System.out.println("\n---\n");

        System.out.println("\n_______________________END\n");
    }
}