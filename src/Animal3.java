public class Animal3 {
    String species;
    String name;
    Double weight;
    Boolean isAlive;

    Animal3(){
        isAlive = true;
        species = "canis";

    }
    Animal3(String species){
        this.species = species;
    }

    void feed(){
        if(isAlive) {
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
        }else{
             System.out.println("fajnie, ale trochę za późno");
        }
        if (this.weight <= 0 ){
            this.isAlive = false;
        }
    }
}
