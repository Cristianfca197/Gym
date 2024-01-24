package gym

class Set {

    int repetitions
    int rest
    int weight

    static constraints = {
    }

    Set(int repetitions, rest, weight){
        this.repetitions = repetitions
        this.rest = rest
        this.weight = weight
    }

    void copyValues(Set set){
        this.repetitions = set.repetitions
        this.rest = set.rest
        this.weight = set.weight
    }
}
