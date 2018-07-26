package edu.digital.test;

public class Main {

    public static void main(String[] args) {

        String[] supportedTypes = {"ddr2", "ddr3", "ddr4"};

        Specification specification = new Specification(supportedTypes, 100);
        Ram ram = new Ram("ddr",2048);
        VideoCard videoCard = new VideoCard(101, 2048);
        Motherboard motherboard = new Motherboard("ASUS",specification);

        motherboard.setRam(ram);
        motherboard.setVideoCard(videoCard);
        ram.setType("ddr3");
        videoCard.setSpeed(100);
        motherboard.setRam(ram);
        motherboard.setVideoCard(videoCard);

        Hdd hdd = new Hdd("Kingston", 1);
        MotherboardWithHdd motherboardWithHdd = new MotherboardWithHdd("RALINK",specification, hdd);
        motherboardWithHdd.setRam(ram);

    }
}
