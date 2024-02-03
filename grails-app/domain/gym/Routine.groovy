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
        for(Exercise e : routine.exercises.values()){
            exercises.put(e.getName(), training.addExerciseIncreasedWeight(e))
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
        //exercises.get(exercise.getName()).modifyValues(rep, rest, weight)
        training.changeSeriesExercise(rep, rest, weight, exercise)
    }

    Series getSeriesExercise(Exercise exercise){
        Series series = exercises.get(exercise.getName()).getSerie()
        series
    }

    void deleteSeriesExercise(Exercise exercise){
        training.deleteSeriesExercise(exercise)
    }

    boolean allowsWeightProgression(){
        training.allowsWeightProgression(this)
    }

    boolean compareWeights(int weight){
        boolean check = true
        for(String key : exercises.keySet()){
            if(!exercises.get(key).weightLess(weight)){
                check = false
            }
        }
        check
    }

    void createAdvancedTechnique(Exercise exercise, AdvancedTechnique advancedTechnique){
        advancedTechnique.setValues(exercises.get(exercise.getName()), training)
    }
}
