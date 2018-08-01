package edu.digital.callback;

public class MainCallback {
    public static void main(String[] args) {
        Ui ui = new Ui();
        Database database = new Database();
        database.search(2, ui);
        System.out.println("return");
    }
}
