package src.behavioral.templateMethod;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail();
    }

    public void execute() {
        auditTrail.record();

        doExecute();
    }

    /**
     * Needs to be protected so that it can't be called directly in main, but can still be
     * implemented in the child classes (it wouldn't be able to be found by the child classes if it was private
     */
    protected abstract void doExecute();
}
