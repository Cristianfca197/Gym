package gym

class User {

    String name
    //HashSet<ExerciseUser> exercisesUser = new HashSet<ExerciseUser>()
    //HashMap<String, Routine> routines

    static hasMany = [exercisesLists: ExerciseList]

    static constraints = {
    }

    User(String name){
        this.name = name
        //this.exercises = new HashSet<Exercise>()
        //this.routines = new HashMap<String, Routine>()
    }

    ExerciseUser addExercise(Exercise exercise){
        ExerciseUser exerciseUser = new ExerciseUser(exercise, this)
        exercisesUser.add(exerciseUser)
        exerciseUser
    }

    int quantityExercise(){
        exercises.size()
    }

    Routine createRoutine(Training training){
        Routine routine = training.createRoutine(exercises)
        routines.put(routine.getName(), routine)
        routine
    }

    void addSeriesExercise(Exercise exercise,Routine routine){
        routines.get(routine.getName()).addSeriesExercise(exercise)
    }

    int numberExerciseSeries(Exercise exercise, Routine routine){
        routines.get(routine.getName()).numberExerciseSeries(exercise)
    }

    void changeSeriesExercise(int rep, int rest, int weight, Exercise exercise, Routine routine){
        routines.get(routine.getName()).changeSeriesExercise(rep, rest, weight, exercise)
    }

    Series getSeriesExercise(Exercise exercise, Routine routine){
        Series series = routines.get(routine.getName()).getSeriesExercise(exercise)
        series
    }

    void deleteSeriesExercise(Exercise exercise, Routine routine){
        routines.get(routine.getName()).deleteSeriesExercise(exercise)
    }

    Program createProgram(Routine routine, Program program){
        Program  otherProgram = program.getProgramWith(routines.get(routine.getName()))
        otherProgram
    }

    void createAdvancedTechnique(Exercise exercise, AdvancedTechnique advancedTechnique, Routine routine){
        routines.get(routine.getName()).createAdvancedTechnique(exercise, advancedTechnique)
    }

    boolean exerciseWithAdvancedTechnique(Exercise exercise, Routine routine){
        routines.get(routine.getName()).exerciseWithAdvancedTechnique(exercise)
    }
}
