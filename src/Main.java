import com.gmail.robmadeyou.plugin.Activator;

/**
 * Created by rob on 10/05/14.
 */
public class Main extends Activator {


    private int STAGE = 0;
    public Main(){
        super("scheduler", "schedule");
    }

    @Override
    public void end() {
    }

    @Override
    public void init() {
    }

    @Override
    public void onActivation() {
        out("What would you like me to schedule for you?");
        lock();
        out("I can do many things");
        getInput();
        out("Okay, that was good");
        unlock();
    }
}
