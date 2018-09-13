package ftclib.commandSystem;

public abstract class Command {

    public abstract void start();

    public abstract void execute();

    public abstract void stop();

    public abstract boolean finished();

}
