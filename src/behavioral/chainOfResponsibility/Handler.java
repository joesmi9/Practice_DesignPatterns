package src.behavioral.chainOfResponsibility;

import java.net.http.HttpRequest;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
        if(doHandle(request)){
            return;
        }

        if(next != null){
            next.handle(request);
        }
    }

    public abstract void doHandle(HttpRequest request);
}
