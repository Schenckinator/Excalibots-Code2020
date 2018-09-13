package ftclib.commandSystem;

import com.qualcomm.robotcore.util.ElapsedTime;

public class Scheduler {

    public static void startCommand(Command c, double timeout_){
        ElapsedTime t = new ElapsedTime();
        t.startTime();
        c.start();
        while((t.milliseconds() <= timeout_ * 1000) || !c.finished()){
            c.execute();
        }
        c.stop();
    }

    public static void startParallelCommand(ParallelCommand pc, double timeout_){
        ElapsedTime t = new ElapsedTime();
        t.startTime();
        for(Command c: pc.commands){
            c.start();
        }
        while((t.milliseconds() <= timeout_ * 1000) || pc.commands.size() == 0){
            for(Command c: pc.commands){
                if(c.finished()){
                    c.stop();
                    pc.commands.remove(c);
                }
            }
        }
    }


}
