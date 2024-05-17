package gym

class IncreasedWeight extends Program{

    Routine firstWeek
    Routine secondWeek

    static constraints = {
    }

    IncreasedWeight(Routine routine){
        this.firstWeek = routine
        this.secondWeek = routine.increasedWeight()
    }

    Program getProgramWith(Routine routine) {
        if(routine.allowsWeightProgression()){
            this.firstWeek = routine
            this.secondWeek = routine.increasedWeight()
            this
        }else{
            //error
            null
        }
    }
}
