public class Animal
{
    final String species;
    String name;
    Double weight;
    //public class Animal implements Ownable
    private static final Double DEFAULT_LABRADOR_WEIGHT = 8.0;
    private static final Double DEFAULT_JAMNIK_WEIGHT = 2.5;
    private static final Double DEFAULT_OWCZAREK_WEIGHT = 15.0;
    Boolean isAlive;

    Animal(String species)
    {
        this.isAlive = true;
        this.species = species;

        switch (species) {
            case "labrador":
                this.weight = DEFAULT_LABRADOR_WEIGHT;
                break;
            case "jamnik":
                this.weight = DEFAULT_JAMNIK_WEIGHT;
                break;
            case "owczarek":
                this.weight = DEFAULT_OWCZAREK_WEIGHT;
                break;
        }

    }
    void feed() {
        if (this.isAlive == true) {
            this.weight += 0.5;
            System.out.println("Dzięki za żarcie");
        }
    }

    void takeForAWalk() {
        if (this.isAlive == true) {
            this.weight -= 1.0;
            if (this.weight <= 0) {
                System.out.println("\nZabiłeś psa!");
                this.isAlive = false;
            } else {
                System.out.println("Dzięki za spacer");
            }
        } else {
            System.out.println("Dzwonie na policje!\n");
        }
    }

    public String toString() {
        return this.species + " " + this.weight;
    }
//13.11.2022-----------------------------------------------------------------
    public Pet(){
        super("");
        this.weight = 10.0;
    }
    public FarmAnimal(){
        super("homo sapiens");
        this.weight = 10.0;
    }
//------------------------------------------------------------------------------
}