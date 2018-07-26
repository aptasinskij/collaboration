package edu.digital.test;

public class VideoCard {
    private  int speed;
    private  int capacity;

    public VideoCard(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
