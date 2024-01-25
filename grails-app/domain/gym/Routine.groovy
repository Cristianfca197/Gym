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

    Routine(Routine routine){
        this.name = routine.name
        this.training = routine.training
        this.exercises = new ArrayList<Exercise>()
        for(Exercise exercise in routine.exercises){
            exercises.add(training.addExerciseIncreasedWeight(exercise))
        }
    }

    void addExercise(Exercise exercise){
        exercises.add(training.addExercise(exercise))
    }

    int quantityExercise(){
        exercises.size()
    }

    Routine increasedWeight(){
        Routine routine = new Routine(this)
        routine
    }
}
