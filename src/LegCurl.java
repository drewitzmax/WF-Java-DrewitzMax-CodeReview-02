public class LegCurl extends Exercise{
    public LegCurl(){
        super("Leg Curl",
                "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.",
                90,
                "standing");

    }
    public LegCurl(int duration){
        this();
        super.duration =  duration;
    }
}
