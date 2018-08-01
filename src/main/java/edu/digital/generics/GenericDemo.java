package edu.digital.generics;

import edu.digital.callback.User;

public class GenericDemo {

    public static void main(String[] args) {
        GenericVault<String> stringVault = new GenericVault<>("some data");
        GenericVault<Integer> integerVault = new GenericVault<>(1);
        GenericVault<User> userVault = new GenericVault<>(new User("username", 1));
        GenericVault<DataOne> dataOne = new GenericVault<>(new DataOne());
        dataOne.getData().method();
    }

}
