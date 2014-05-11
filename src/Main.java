import com.gmail.robmadeyou.plugin.Activator;
import com.gmail.robmadeyou.plugin.message.SmartString;

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

    public void onActivation() {
        out("What would you like me to do for you?");
        lock();
        String nextLine = getInput();
        String name;
        if(SmartString.containsOneOf(nextLine, "add", "new")){
            out("Alright, let's add a new task. What would you like it to be called?");
            name = getInput();
            out("Okay, so: " + SmartString.dotify(name));
            out("And when would you like me to notify you?");
        }
    }
}
