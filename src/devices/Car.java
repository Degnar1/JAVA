package devices;

public class Car
{
    final String model;
    final String producer;
    Double millage;
    final String colour;
    Double height;
    Double width;
    Double value;

    Car(String model, String producer, Double millage, String colour, Double height, Double width, Double value)
    {
        this.model = model;
        this.producer = producer;
        this.millage = millage;
        this.colour = colour;
        this.height = height;
        this.width = width;
        this.value = value;
    }

    public String toString() {
        return "Model: " + this.model + " Producer: " + this.producer + " millage: " + this.millage + " colour: " + this.colour + " height: " + this.height + " width: " + this.width + " value: " + this.value;
    }

}