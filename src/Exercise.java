public class Exercise {
    protected String name;
    protected String description;
    protected int duration;
    protected String position;

    public Exercise(String name, String description, int duration, String position) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String toString(){
        String line = "--------------------------------------------------\n";
        return name + "\t" + "DURATION: " + duration+ " seconds.\n" + line + "DESCRIPTION: " + description + "\n" + line;
    }

    public void print(){
        System.out.println(this.toString());
    }

    public int getDuration(){
        return duration;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
