import java.util.Random;

public class Task {
    private Random number1=new Random();
    private Random number2=new Random();
    private String taskString;

    public Task() {

    }

    public String addTask() {

        taskString=number1+"*"+number1;

        return taskString;
    }


}
