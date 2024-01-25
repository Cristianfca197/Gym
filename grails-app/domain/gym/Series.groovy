package gym

class Series {

    int repetitions
    int rest
    int weight

    static constraints = {
    }

    Series(int repetitions, rest, weight){
        this.repetitions = repetitions
        this.rest = rest
        this.weight = weight
    }

    void copyValues(Series set){
        this.repetitions = set.repetitions
        this.rest = set.rest
        this.weight = set.weight
    }
}
