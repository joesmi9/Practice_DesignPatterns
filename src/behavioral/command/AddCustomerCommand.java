package src.behavioral.command;

import src.behavioral.command.framework.Command;

public class AddCustomerCommand implements Command {

    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
