package edu.digital.horses;

public class MainForHorses {

    public static void main(String[] args) {

        Unicorn unicorn = new Unicorn();
        Pegasus pegasus = new Pegasus();
        Pony pony = new Pony();

        FlyingCat flyingCat = new FlyingCat();

        makeFly(pegasus);
        makeFly(flyingCat);

        makeHorseIgogo(unicorn);
        makeHorseIgogo(pegasus);
        makeHorseIgogo(pony);

    }

    public static void makeFly(Flying flying) {
        flying.fly();
    }

    public static  void makeHorseIgogo(Horse horse) {
        horse.igogo();
    }

}
