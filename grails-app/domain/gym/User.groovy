package gym

class User {

    String name
    ArrayList<Exercise> exercises
    ArrayList<Routine> routines

    static constraints = {
    }

    User(String name){
        this.name = name
        this.exercises = new ArrayList<Exercise>()
        this.routines = new ArrayList<Routine>()
    }

    void addExercise(Exercise exercise){
        exercises.add(exercise)
    }

    int quantityExercise(){
        exercises.size()
    }

    Routine createRoutine(Training training){
        Routine routine = training.createRoutine(exercises)
        routines.add(routine)
        routine
    }
}
