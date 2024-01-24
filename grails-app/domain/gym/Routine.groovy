package gym

class Routine {

    String name
    Training training
    ArrayList<Exercise> exercises

    static constraints = {
    }

    Routine(String name, Training training){
        this.name = name
        this.training = training
        this.exercises = new ArrayList<Exercise>()
    }

    void addExercise(Exercise exercise){
        exercises.add(training.addExercise(exercise))
    }

    int quantityExercise(){
        exercises.size()
    }

}
