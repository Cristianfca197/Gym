package gym

class Weight extends Exercise {

    ArrayList<Set> sets

    static constraints = {
    }

    Weight(String name){
        super(name)
        this.sets = new ArrayList<Set>()
    }

    void set(Set set){
        sets.add(set)
    }

    void modifyValues(Set set){
        for(otherSet in sets){
            otherSet.copyValues(set)
        }
    }
}
