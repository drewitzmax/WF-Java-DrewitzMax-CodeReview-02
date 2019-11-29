public class IntervalWorkout {
    private int repititions;
    private int breakTime;
    private Exercise[] exercises;

    private final String start = "***************************** \n" +
            "Interval Workout STARTS !!!!\n" +
            "*****************************\n" +
            "=============================";

    private final String end = "*****************************\n" +
            " CONGRATS - YOU ARE DONE !!!\n" +
            "*****************************";

    public IntervalWorkout(){
        this.repititions = 4;
        this.breakTime = 30;
        this.exercises = new Exercise[] {new PushUp(), new Squats(), new Planks()};
    }

    public IntervalWorkout(Exercise[] exercises, int repititions, int breakTime){
        this.exercises = exercises;
        this.repititions = repititions;
        this.breakTime = breakTime;
    }

    private String breakMarker(){
        return "=============================\n" +
                "DO THE BREAK ("+ breakTime +" SECONDS)\n" +
                "=============================";
    }

    private String roundString(int i){
        return "ROUND " + i + ":";
    }

    private int roundTime(){
        int result = 0;

        for(Exercise e: exercises) result += e.getDuration();

        return result;
    }

    public void print(){
        System.out.println(start);

        for(int i=1; i <= repititions; i++){
            System.out.println( roundString(i) );

            for(Exercise e: exercises){
                System.out.println(e.getName());
            }

            try {
                Thread.sleep(roundTime() * 100 );
            }catch (Exception ex){
                System.out.println("Waiting Exeption");
            }

            if( i != repititions ) {
                System.out.println(breakMarker());

                try {
                    Thread.sleep(breakTime * 100);
                } catch (Exception ex) {
                    System.out.println("Waiting Exeption");
                }
            }
        }

        System.out.println(end);
    }

    public int getRepititions() {
        return repititions;
    }

    public int getBreakTime() {
        return breakTime;
    }

    public Exercise[] getExercises() {
        return exercises;
    }
}
