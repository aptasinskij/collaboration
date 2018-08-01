package edu.digital.callback;

public class Database {

    private User[] userDb = {new User("User2", 2), new User("User3", 3), new User("User4", 4)};

    void search(int id, Ui ui) {
        System.out.printf("Searching user with Id %d%n", id);
        for (int i = 0; i < userDb.length; i++) {
            if (userDb[i].getId() == id) {
                ui.render(userDb[i]);
                return;
            }
        }
        ui.notFound();
    }

}
