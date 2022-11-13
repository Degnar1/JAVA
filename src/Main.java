import devices.Car;

public class Main {
    public static void main(String[] args)
    {
//--------------------------------------------------------------------------------------------
        Animal dog = new Animal("labrador");
        dog.name = "Szarik";
        dog.isAlive = true;

        Human me = new Human();
        me.firstName = "Jan";
        me.lastName = "Krogul";
        me.pet = dog;

        System.out.println(me.firstName + " masz zwierze, nazywa się: " + dog.name);
        System.out.println("Czy żyje? " + dog.isAlive);
        System.out.println("Gatunek: " + dog.species);

        System.out.println("Ile waży pies: " + dog.weight);
        dog.feed();
        dog.feed();
        System.out.println("Teraz pies waży: " + dog.weight + "\n");

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        System.out.println("Teraz pies waży: " + dog.weight);
        System.out.println(dog);
//---------------------------------------------------------------------------------------
        Car car = new Car("C2", "Citroen",175000.2,"black",146.1,165.9,5000.0);
       //me.car = car;
        System.out.print("\nmodel: " + car.model);
        System.out.print("\nproducer: " + car.producer);
        System.out.println("\nmillage: " + car.millage);
        System.out.println("colour: " + car.colour);
        System.out.println("height: " + car.height);
        System.out.println("width: " + car.width);
        System.out.println("value: " + car.value + "\n");
//-----------------------------------------------------------------------------------------

        System.out.println(me.getYourSalary());
        System.out.println("\n");

        System.out.println(me.setYourSalary());

        Car car1 = new Car("C3", "Citroen",175000.2,"black",146.1,165.9,100.0);
        Car car2 = new Car("C5", "Citroen",175000.2,"black",146.1,165.9,10000.0);
        Car car3 = new Car("XSARA", "Citroen",175000.2,"black",146.1,165.9,1000000.0);
        Car car4 = new Car("XSARA", "Citroen",175000.2,"black",146.1,165.9,1000000.0);

        System.out.println("\n" + car1);
        System.out.println(car2 + "\n");

        me.setCar(car1);
        me.setCar(car2);
        me.setCar(car3);
        System.out.println("\n");

        System.out.println(car1.equals(car2));
        System.out.println(car3);
        System.out.println(car4);
        System.out.println("\n");
        System.out.println(me);
        System.out.println(car);
        System.out.println(dog);

    }
}