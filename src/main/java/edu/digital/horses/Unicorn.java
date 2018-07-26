package edu.digital.horses;

public class Unicorn extends Horse implements MagicMaker {

    public void igogo() {
        System.out.println("Igogo like a Unicorn");
    }

    public void makeMagic() {
        igogo();
        System.out.println("Make Magic");
    }

}
