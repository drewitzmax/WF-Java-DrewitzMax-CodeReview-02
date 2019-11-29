public class Planks extends Exercise {
    Planks(){
        super("Planks",
                "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.",
                30,
                "floor");
    }
    Planks(int duration){
        this();
        super.duration = duration;
    }
}
