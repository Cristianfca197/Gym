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
}
