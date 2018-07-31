package edu.digital.builder;

import lombok.Builder;

import java.util.Date;

@Builder
public class ComplicatedObject {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Date birthDate;
    private String email;
    private String address;

    private ComplicatedObject(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.birthDate = builder.birthDate;
        this.email = builder.email;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "ComplicatedObject{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private Date birthDate;
        private String email;
        private String address;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder dialTo(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder wasBornAt(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder sendEmailTo(String email) {
            this.email = email;
            return this;
        }

        public Builder livingAt(String address) {
            this.address = address;
            return this;
        }

        public ComplicatedObject build() {
            return new ComplicatedObject(this);
        }

    }



}
