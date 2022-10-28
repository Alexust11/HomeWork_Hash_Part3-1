import java.util.Objects;
import java.util.Random;

public class Task {
    private  String task;
    private final Integer value1;
    private final Integer value2;

    public Task(Integer value1, Integer value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        Task task = (Task) o;

        return (value1 == task.value1 && value2 == task.value2)||(value1 == task.value2 && value2 == task.value1);

    }


    public String getTask() {
        return this.value1.toString()+"*"+this.value2.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }

    @Override
    public String toString() {
        String s=this.value1+"*"+this.value2;
        return s;
    }
}
