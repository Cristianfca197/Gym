package gym

class Routine {

    String name
    ArrayList<Exercise> exercises

    static constraints = {
    }

    Routine(String name){
        this.name = name
        this.exercises = new ArrayList<Exercise>()
    }

    void addExercise(Exercise exercise){
        exercises.add(exercise)
    }
}
