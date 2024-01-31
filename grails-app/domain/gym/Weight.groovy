package gym

class Weight extends Exercise {

    ArrayList<Series> sets

    static constraints = {
    }

    Weight(String name){
        super(name)
        this.sets = new ArrayList<Series>()
    }

    void setSerie(int repetitions, int rest, int weight){
        sets.add(new Series(repetitions, rest, weight))
    }

    void modifyValues(int repetitions, int rest, int weight){
        for(otherSet in sets){
            otherSet.copyValues(repetitions, rest, weight)
        }
    }

    Series getSerie(){
       sets.get(0)
    }

    int numberSeries(){
        sets.size()
    }
}
