public class BackwardKick extends Exercise {
    public BackwardKick(){
        super("Backward Kick",
                "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.",
                60,
                "floor");
    }

    public BackwardKick(int duration){
        this();
        super.duration = duration;
    }
}
