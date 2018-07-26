package edu.digital.test;

public class Motherboard {

    private String model;
    private Specification specification;
    private Ram ram;
    private VideoCard videoCard;


    public Motherboard(String model, Specification specification) {
        this.model = model;
        this.specification = specification;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        boolean acceptable = specification.isAcceptable(ram);
        if (acceptable) {
            this.ram = ram;
            System.out.println("RAM was successfully installed. Type: " + ram.getType() + ", Capacity: " + ram.getCapacity());
        }
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        boolean acceptable = specification.isSpeedNotExceeded(videoCard);
        if (acceptable) {
            this.videoCard = videoCard;
            System.out.println(String.format("GPU was successfully installed. Speed %d, Capacity %d", videoCard.getSpeed(), videoCard.getCapacity()));
        }

    }
}
