public class Squats extends Exercise {
    public Squats() {
        super("Squats",
                "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.",
                45,
                "standing");
    }

    public Squats(int duration){
        this();
        super.duration = duration;
    }
}
