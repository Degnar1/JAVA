package com.devices;

public class Phone extends Device {
    Integer Nrtel;
    String model;
    String producer;
//13.11.2022--------------------------------------------------------
    Phone (Integer Nrtel, String producer, String model)
    {
        this.Nrtel = Nrtel;
        this.producer = producer;
        this.model = model;
    }
//------------------------------------------------------------------
    public String toString() {
        return "Nrtel: " + this.Nrtel "Producer: " + this.producer + " " + "Number: " + this.telNumber;
    }






}
