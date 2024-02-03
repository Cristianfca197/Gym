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

    void deleteSerie(){
        sets.removeLast()
    }

    boolean weightLess(int weight){
        boolean check = false
        for(Series s : sets){
            if(s.weightLess(weight)){
                check = true
            }
        }
        check
    }

    int getWeight(){
        this.getSerie().getWeight()
    }

    void modifySerie(int serie, int rep, int rest, int weight){
        sets.get(serie).copyValues(rep, rest, weight)
    }

    int numberRepetitions(){
        this.getSerie().getRepetitions()
    }
}
