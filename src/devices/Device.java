package com.devices;

public abstract class Device {

    protected final String producer;
    public final String model;
 //   public final Integer yearOfProduction;
  //dodać do car
    public String colour;
//13.11.2022-----------------------------------------------------------------------------------
    public Device(String producer, String model, /*String yearOfProduction*/String colour) {
        this.producer = producer;
        this.model = model;
        //this.yearOfProduction = yearOfProduction;
        this.colour = colour;
    }
//-------------------------------------------------------------------------------------------------

}
