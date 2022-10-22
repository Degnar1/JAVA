public class main {
    public static void main(String[] args){
        Animal3 dog = new Animal3();
        System.out.println("Hello world!");
        String species = "canis";
        dog.name = "Szarik";
        dog.weight = 10.3;

        System.out.println("Masz zwierzę, nazywa się:");
        System.out.println(dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
    }

    public static class Animal3 {
        String species;
        String name;
        Double weight;
        Boolean isAlive;

        Animal3(){
            isAlive = true;
            species = "canis";

        }
        Human me = new Human();
        Animal3 cat = new Animal3("felis");
        me.pet.feed();

        me.pet = dog;
        System.out.println(me.pet.species);

        //jak w tej linijce nakarmić kota
        //cat.feed() todo: zrobić na kolejnych zajęciach
        me.pet.feed();
        dog.feed():

        Car fiat = new Car("Fiat","Bravo");
        me.car = fiat;
        System.out.println(me.car.producer)
    }
}
