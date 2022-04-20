package src.behavioral.observer;

public class Chart implements Observer {

    @Override
    public void update() {
        System.out.println("Chart Updated");
    }
}
