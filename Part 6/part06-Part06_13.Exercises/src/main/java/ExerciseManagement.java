import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise e : this.exercises) {
            list.add(e.getname());
        }
        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise e : exercises) {
            if (e.getname().equals(exercise)) {
                e.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise e : exercises) {
            if (e.getname().equals(exercise)) {
                return e.isCompleted();
            }
        }
        return false;
    }


}
