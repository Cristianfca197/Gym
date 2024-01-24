package gym

class User {

    String name
    ArrayList<Exercise> exercises

    static constraints = {
    }

    User(String name){
        this.name = name
        this.exercises = new ArrayList<Exercise>()
    }

    void addExercise(Exercise exercise){
        exercises.add(exercise)
    }

    int quantityExercise(){
        exercises.size()
    }

    Routine createRoutine(Training training){
       training.createRoutine(exercises)
    }
}
