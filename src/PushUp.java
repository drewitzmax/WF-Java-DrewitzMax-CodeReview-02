public class PushUp extends Exercise {
    public PushUp(){
        super("Push-Ups",
                "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.",
                90,
                "floor");
    }

    public PushUp(int duration){
        this();
        super.duration = duration;
    }
}
