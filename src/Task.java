import java.util.Objects;
import java.util.Random;

public class Task {
    private  String task;
     private Random number1=new Random();
    private Random number2=new Random();


    public Task() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task1)) return false;
        return Objects.equals(task, task1.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task);
    }

    public String getTask() {
        task=number1.nextInt(2,9)+"*"+number2.nextInt(2,9);
        return task;
    }



}
