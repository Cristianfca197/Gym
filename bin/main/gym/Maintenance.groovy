package gym

class Maintenance extends Training{

    static constraints = {
    }

    void addSeriesExercise(Exercise exercise){
        if(exercise.numberSeries() < 3){
            exercise.setSeries(8, 90, 50)
        }else{
            //error
        }
    }

    boolean validValues(int rep, int rest, int weight){
        rep > 7 && rep < 13 && rest > 59 && rest < 91 && weight > 49 && weight < 71
    }

    void changeSeriesExercise(int rep, int rest, int weight, Exercise exercise) {
        if(this.validValues(rep, rest, weight)){
            exercise.modifyValues(rep, rest, weight)
        }else{
            //error
        }
    }

    Exercise addExercise(Exercise exercise){
        this.addSeriesExercise(exercise)
        exercise
    }

    Routine createRoutine(HashSet<Exercise> exercises){
        Routine routine = new Routine("Maintenance", this)
        for(exercise in exercises){
            routine.addExercise(exercise)
        }
        routine
    }

    Exercise addExerciseIncreasedWeight(Exercise exercise){
        exercise.modifyValues(12, 60, 70)
        exercise
    }

    void deleteSeriesExercise(Exercise exercise){
        if(exercise.numberSeries() > 1){
            exercise.deleteSeries()
        }else{
            //error
        }
    }

    boolean allowsWeightProgression(Routine routine){
        boolean check = false
        if(routine.compareWeights(70)){
            check = true
        }
        check
    }

    boolean allowsDropSet(Exercise exercise){
       exercise.getWeight() >= 60 && exercise.numberSeries() == 3
    }
}
