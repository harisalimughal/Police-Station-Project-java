

public class Bike extends Vehical {
    private int area;
    private float chasing_speed;
    private PoliceMan police;
    private Criminal criminals;
    private Victim victimes;

    public Bike() {

    }


    public Bike(Vehical v,int area, float chasing_speed) {
        super(v. model, v. engine_no, v.name, v. company);
        this.area = area;
        this.chasing_speed = chasing_speed;
    }

    public Bike(int model, int engine_no, String name, String company, int area, float chasing_speed, PoliceMan police, Criminal criminals, Victim victimes) {
        super(model, engine_no, name, company);
        this.area = area;
        this.chasing_speed = chasing_speed;
        this.police = police;
        this.criminals = criminals;
        this.victimes = victimes;
    }

    public Bike(int area, float chasing_speed, PoliceMan police, Criminal criminals, Victim victimes) {
        this.area = area;
        this.chasing_speed = chasing_speed;
        this.police = police;
        this.criminals = criminals;
        this.victimes = victimes;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public float getChasing_speed() {
        return chasing_speed;
    }

    public void setChasing_speed(float chasing_speed) {
        this.chasing_speed = chasing_speed;
    }

    public PoliceMan getPolice() {
        return police;
    }

    public void setPolice(PoliceMan police) {
        this.police = police;
    }

    public Criminal getCriminals() {
        return criminals;
    }

    public void setCriminals(Criminal criminals) {
        this.criminals = criminals;
    }

    public Victim getVictimes() {
        return victimes;
    }

    public void setVictimes(Victim victimes) {
        this.victimes = victimes;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "area=" + area +
                ", chasing_speed=" + chasing_speed +
                ", police=" + police +
                ", criminals=" + criminals +
                ", victimes=" + victimes +
                '}';
    }

    public String display(){
        return "Bike{" +
                "area=" + area +
                ", chasing_speed=" + chasing_speed +
                ", police=" + police +
                ", criminals=" + criminals +
                ", victimes=" + victimes +
                ", model=" + model +
                ", engine_no=" + engine_no +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
