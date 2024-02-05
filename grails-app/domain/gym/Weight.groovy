package gym

class Weight extends Exercise {

    ArrayList<Series> sets
    AdvancedTechnique advancedTechnique

    static constraints = {
    }

    Weight(String name){
        super(name)
        this.sets = new ArrayList<Series>()
        this.advancedTechnique = null
    }

    void setSerie(int repetitions, int rest, int weight){
        sets.add(new Series(repetitions, rest, weight))
    }

    void modifyValues(int repetitions, int rest, int weight){
        for(otherSet in sets){
            otherSet.copyValues(new Series(repetitions, rest, weight))
        }
    }

    Series getSerie(){
       sets.get(0)
    }

    int numberSeries(){
        sets.size()
    }

    void deleteSerie(){
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
        this.getSerie().getWeight()
    }

    void modifySerie(int serie, int rep, int rest, int weight){
        sets.get(serie).copyValues(new Series(rep, rest, weight))
    }

    int numberRepetitions(){
        this.getSerie().getRepetitions()
    }

    boolean hasAdvancedTechnique(){
        this.advancedTechnique != null
    }

    void withAdvancedTechnique(AdvancedTechnique advancedTechnique){
        this.advancedTechnique = advancedTechnique
    }
}
