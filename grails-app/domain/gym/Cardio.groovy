package gym

class Cardio extends Exercise{

    static constraints = {
    }

    @Override
    void setSerie(int repetitions, int rest, int weight) {

    }

    @Override
    void modifyValues(int repetitions, int rest, int weight) {

    }

    @Override
    Series getSerie() {
        return null
    }

    @Override
    int numberSeries() {
        return 0
    }

    @Override
    void deleteSerie() {

    }

    @Override
    boolean weightLess(int weight) {
        return false
    }
}
