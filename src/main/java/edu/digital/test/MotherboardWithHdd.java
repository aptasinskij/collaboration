package edu.digital.test;

public class MotherboardWithHdd extends Motherboard {

    private Hdd hdd;

    public MotherboardWithHdd(String model, Specification specification, Hdd hdd) {
        super(model, specification);
        this.hdd = hdd;
    }
}
