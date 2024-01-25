package gym

class Weight extends Exercise {

    ArrayList<Series> sets

    static constraints = {
    }

    Weight(String name){
        super(name)
        this.sets = new ArrayList<Series>()
    }

    void set(Series set){
        sets.add(set)
    }

    void modifyValues(Series set){
        for(otherSet in sets){
            otherSet.copyValues(set)
        }
    }
}
