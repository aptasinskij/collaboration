package edu.digital.builder;

import java.sql.Date;

public class BuilderDemo {

    public static void main(String[] args) {
        ComplicatedObject complicatedObject = new ComplicatedObject.Builder()
                .withFirstName("Andrew")
                .withLastName("Ptasinskij")
                .wasBornAt(Date.valueOf("1992-08-12"))
                .livingAt("Vinnitsa")
                .dialTo("+380983332211")
                .sendEmailTo("aptasinskij@gmail.com")
                .build();
        System.out.println(complicatedObject);
    }

}
