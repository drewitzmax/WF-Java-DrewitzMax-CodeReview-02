public class Main {

    public static void main(String[] args){

        Exercise[] exercises = new Exercise[6];
        exercises[0] = new PushUp();
        exercises[1] = new Planks();
        exercises[2] = new Squats();
        exercises[3] = new BackwardKick();
        exercises[4] = new LegCurl();
        exercises[5] = new SidewardsBackStrech();
        printing(exercises);
        printing(exercises, "floor");
        printing(exercises, "floor", 60);
        IntervalWorkout workout = new IntervalWorkout();
        workout.print();
    }

    public static void printing(Exercise[] exercises){
        for(Exercise e: exercises){
            e.print();
            try {
                Thread.sleep((long) e.getDuration() * 10);
            }catch (Exception ex){
                System.out.println("Waiting Exeption");
            }
        }
    }

    public static void printing(Exercise[] exercises, String position){
        for(Exercise e: exercises){
            if(e.getPosition().equals(position)) {
                e.print();
                try {
                    Thread.sleep((long) e.getDuration() * 10);
                } catch (Exception ex) {
                    System.out.println("Waiting Exeption");
                }
            }
        }
    }

    public static void printing(Exercise[] exercises, String position, int minDuration){
        for(Exercise e: exercises){
            if(e.getPosition().equals(position) && (e.getDuration() > minDuration)) {
                e.print();
                try {
                    Thread.sleep((long) e.getDuration() * 10);
                } catch (Exception ex) {
                    System.out.println("Waiting Exeption");
                }
            }
        }
    }
}
