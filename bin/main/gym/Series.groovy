package gym

class Series {

    int repetitions
    int rest
    int weight

    static constraints = {
        repetitions nullable: false, numerable: true
        rest nullable: false, numerable: true
        weight nullable: false, numerable: true
    }

    Series(int repetitions, rest, weight){
        assert repetitions > 0
        assert rest > 0
        assert weight > 0
        this.repetitions = repetitions
        this.rest = rest
        this.weight = weight
    }

    void copyValues(Series series){
        this.repetitions = series.repetitions
        this.rest = series.rest
        this.weight = series.weight
    }

    boolean compareValues(Series series){
        this.repetitions == series.repetitions && this.rest == series.rest && this.weight == series.weight
    }

    boolean weightLessThan(int weight){
        this.weight < weight
    }
}
