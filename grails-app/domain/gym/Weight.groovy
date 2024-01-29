package gym

class Weight extends Exercise {

    ArrayList<Series> sets

    static constraints = {
    }

    Weight(String name){
        super(name)
        this.sets = new ArrayList<Series>()
    }

    void setSerie(Series serie){
        sets.add(serie)
    }

    void modifyValues(Series set){
        for(otherSet in sets){
            otherSet.copyValues(set)
        }
    }

    Series getSerie(){
       sets.get(0)
    }

    int numberSeries(){
        sets.size()
    }
}
