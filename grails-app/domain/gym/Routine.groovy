package gym

class Routine {

    String name
    Training training
    HashMap<String, Exercise> exercises

    static constraints = {
    }

    Routine(String name, Training training){
        this.name = name
        this.training = training
        this.exercises = new HashMap<String, Exercise>()
    }

    Routine(Routine routine){
        this.name = routine.name
        this.training = routine.training
        this.exercises = new HashMap<String, Exercise>()
        for(Exercise exercise in routine.exercises){
            exercises.add(exercise.getName(), training.addExerciseIncreasedWeight(exercise))
        }
    }

    void addExercise(Exercise exercise){
        exercises.put(exercise.getName(), training.addExercise(exercise))
    }

    int quantityExercise(){
        exercises.size()
    }

    Routine increasedWeight(){
        Routine routine = new Routine(this)
        routine
    }

    void addSeriesExercise(Exercise exercise){
        training.addSeriesExercise(exercises.get(exercise.getName()))
    }

    int numberExerciseSeries(Exercise exercise){
        exercises.get(exercise.getName()).numberSeries()
    }

    void changeSeriesExercise(int rep, int rest, int weight, Exercise exercise){
        exercises.get(exercise.getName()).modifyValues(rep, rest, weight)
    }

    Series getSeriesExercise(Exercise exercise){
        Series series = exercises.get(exercise.getName()).getSerie()
        series
    }
}
