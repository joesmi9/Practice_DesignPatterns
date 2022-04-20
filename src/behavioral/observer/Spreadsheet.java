package src.behavioral.observer;

public class Spreadsheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet updated");
    }
}
