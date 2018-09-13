package ftclib.commandSystem;

import java.util.ArrayList;

public class ParallelCommand {

    public ArrayList<Command> commands;

    public ParallelCommand(){
        commands = new ArrayList<>();
    }

    public void addCommand(Command c){
        commands.add(c);
    }

}

