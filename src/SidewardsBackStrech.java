public class SidewardsBackStrech extends Exercise{
    public SidewardsBackStrech(){
        super("Sidewards Back Strech",
                "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.",
                60,
                "standing");
    }
    public SidewardsBackStrech(int duration){
        this();
        super.duration = duration;
    }
}
