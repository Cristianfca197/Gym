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

    void copyValues(int repetitions, int rest, int weight){
        this.repetitions = repetitions
        this.rest = rest
        this.weight = weight
    }

    boolean compareValues(Series serie){
        this.repetitions == serie.repetitions && this.rest == serie.rest && this.weight == serie.weight
    }

    boolean weightLess(int weight){
        this.weight < weight
    }
}
