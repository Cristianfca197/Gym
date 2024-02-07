package gym

class Cardio extends Exercise{

    static constraints = {
    }

    @Override
    void setSeries(int repetitions, int rest, int weight) {

    }

    @Override
    void modifyValues(int repetitions, int rest, int weight) {

    }

    @Override
    Series getFirstSeries() {
        return null
    }

    @Override
    int numberSeries() {
        return 0
    }

    @Override
    void deleteSeries() {

    }

    @Override
    boolean weightLess(int weight) {
        return false
    }

    @Override
    int getWeight() {
        return 0
    }

    @Override
    void modifySeries(int serie, int rep, int rest, int weight) {

    }

    @Override
    int numberRepetitions() {
        return 0
    }

    @Override
    boolean hasAdvancedTechnique() {
        return false
    }

    @Override
    void withAdvancedTechnique(AdvancedTechnique advancedTechnique) {

    }
}
