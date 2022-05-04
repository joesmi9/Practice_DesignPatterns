package src.behavioral.chainOfResponsibility;

import java.net.http.HttpRequest;

public class Authenticator extends Handler {

    public boolean authenticate(HttpRequest request){
        var isValid = request.getUserName() == "admin" &&
                request.getPassword() == "1234");

        System.out.println("Authenticate");

        return isValid;
    }

    @Override
    public boolean doHandle(HttpRequest request){
        return false;
    }
}
