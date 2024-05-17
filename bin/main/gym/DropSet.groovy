package gym

class DropSet extends AdvancedTechnique{

    static constraints = {
    }


    void setValues(Exercise exercise, Training training){
        if(training.allowsDropSet(exercise)){
            int maxWeight = exercise.getWeight()
            for(int i = 1; i < 3; i++){
                exercise.modifySeries(i, exercise.numberRepetitions(), 0, maxWeight - (5*i))
            }
            exercise.withAdvancedTechnique(this)
        }
    }
}
