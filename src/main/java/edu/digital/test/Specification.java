package edu.digital.test;

public class Specification {

    private String[] supportedRamTypes;
    private int supportedVideoSpeed;

    public Specification(String[] supportedRamTypes, int supportedVideoSpeed) {
        this.supportedRamTypes = supportedRamTypes;
        this.supportedVideoSpeed = supportedVideoSpeed;
    }

    public boolean isAcceptable(Ram ram){
        for (int i = 0; i < supportedRamTypes.length; i++) {
            if (supportedRamTypes[i].equals(ram.getType())) return true;
        }
        return false;
    }

    public  boolean isSpeedNotExceeded(VideoCard videoCard){
        return videoCard.getSpeed() <= supportedVideoSpeed;
    }

}
