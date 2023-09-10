

public class Car extends Vehical {
    private int capacirty_of_people;
    private boolean bullet_proof;
    private String patrolling_area;
    private String chasing_speed;
    private PoliceMan police;
    private Criminal criminals;
    private Victim victimes;

    public Car() {
    }

    public Car(int model, int engine_no, String name, String company, int capacirty_of_people, boolean bullet_proof, String patrolling_area, String chasing_speed) {
        super(model, engine_no, name, company);
        this.capacirty_of_people = capacirty_of_people;
        this.bullet_proof = bullet_proof;
        this.patrolling_area = patrolling_area;
        this.chasing_speed = chasing_speed;
    }


    public Car(Vehical v,int capacirty_of_people, boolean bullet_proof, String patrolling_area, String chasing_speed) {
        super(v. model, v. engine_no, v.name, v. company);
        this.capacirty_of_people = capacirty_of_people;
        this.bullet_proof = bullet_proof;
        this.patrolling_area = patrolling_area;
        this.chasing_speed = chasing_speed;
    }

    public Car(int capacirty_of_people, boolean bullet_proof, String patrolling_area, String chasing_speed, PoliceMan police, Criminal criminals, Victim victimes) {
        this.capacirty_of_people = capacirty_of_people;
        this.bullet_proof = bullet_proof;
        this.patrolling_area = patrolling_area;
        this.chasing_speed = chasing_speed;
        this.police = police;
        this.criminals = criminals;
        this.victimes = victimes;
    }

    public int getCapacirty_of_people() {
        return capacirty_of_people;
    }

    public void setCapacirty_of_people(int capacirty_of_people) {
        this.capacirty_of_people = capacirty_of_people;
    }

    public boolean isBullet_proof() {
        return bullet_proof;
    }

    public void setBullet_proof(boolean bullet_proof) {
        this.bullet_proof = bullet_proof;
    }

    public String getPatrolling_area() {
        return patrolling_area;
    }

    public void setPatrolling_area(String patrolling_area) {
        this.patrolling_area = patrolling_area;
    }

    public String getChasing_speed() {
        return chasing_speed;
    }

    public void setChasing_speed(String chasing_speed) {
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
                "capacirty_of_people=" + capacirty_of_people +
                ", bullet_proof=" + bullet_proof +
                ", patrolling_area='" + patrolling_area + '\'' +
                ", chasing_speed='" + chasing_speed + '\'' +
                ", police=" + police +
                ", criminals=" + criminals +
                ", victimes=" + victimes +
                '}';
    }



    public String display(){
        return "Car{" +
                "capacirty_of_people=" + capacirty_of_people +
                ", bullet_proof=" + bullet_proof +
                ", patrolling_area='" + patrolling_area + '\'' +
                ", chasing_speed='" + chasing_speed + '\'' +
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

