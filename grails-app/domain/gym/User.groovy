package gym

class User {

    String name
    HashSet<Exercise> exercises
    HashMap<String, Routine> Routines

    static constraints = {
    }

    User(String name){
        this.name = name
        this.exercises = new HashSet<Exercise>()
        this.routines = new HashMap<String, Routine>()
    }

    void addExercise(Exercise exercise){
        exercises.add(exercise)
    }

    int quantityExercise(){
        exercises.size()
    }

    Routine createRoutine(Training training){
        Routine routine = training.createRoutine(exercises)
        routines.put(routine.getName(), routine)
        routine
    }

    void addSeriesExercise(Exercise exercise,Routine routine){
        routines.get(routine.getName()).addSeriesExercise(exercise)
    }

    int numberExerciseSeries(Exercise exercise, Routine routine){
        routines.get(routine.getName()).numberExerciseSeries(exercise)
    }
}
