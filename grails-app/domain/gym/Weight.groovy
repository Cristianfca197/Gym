package gym

class Weight extends Exercise {

    Set set

    static constraints = {
    }

    Weight(String name){
        super(name)
        this.set = new Set(0,0,0)
    }

    void set(Set set){
        this.set = set
    }
}
