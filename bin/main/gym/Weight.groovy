package gym

class Weight extends Exercise {

    //ArrayList<Series> sets
    //AdvancedTechnique advancedTechnique

    static constraints = {
        name nullable: false, blank: false
        //advancedTechnique nullable: true
    }

    Weight(String name){
        super(name)
        this.sets = new ArrayList<Series>()
        //this.advancedTechnique = null
    }

    void setSeries(int repetitions, int rest, int weight){
        sets.add(new Series(repetitions, rest, weight))
    }

    void modifyValues(int repetitions, int rest, int weight){
        for(otherSet in sets){
            otherSet.copyValues(new Series(repetitions, rest, weight))
        }
    }

    Series getFirstSeries(){
       sets.get(0)
    }

    int numberSeries(){
        sets.size()
    }

    void deleteSeries(){
        sets.removeLast()
    }

    boolean weightLess(int weight){
        boolean check = false
        for(Series s : sets){
            if(s.weightLessThan(weight)){
                check = true
            }
        }
        check
    }

    int getWeight(){
        this.getFirstSeries().getWeight()
    }

    void modifySeries(int series, int rep, int rest, int weight){
        sets.get(series).copyValues(new Series(rep, rest, weight))
    }

    int numberRepetitions(){
        this.getFirstSeries().getRepetitions()
    }

    boolean hasAdvancedTechnique(){
        this.advancedTechnique != null
    }

    void withAdvancedTechnique(AdvancedTechnique advancedTechnique){
        this.advancedTechnique = advancedTechnique
    }
}
