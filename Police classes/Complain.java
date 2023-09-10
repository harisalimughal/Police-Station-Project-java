

public class Complain {
    public String crime;
    public  String type;
    public String location;
    public String time;
    public PoliceMan police;
    public Criminal crimes;
    public Victim victimes;
    public Complain() {
        police=new PoliceMan();
        crimes=new Criminal();
        victimes=new Victim();
    }

    public Complain(int rank,float salary,float attendence,int criminal_no,String punishment,String duration,String crime_attempted, float economical_loss, boolean emotional_harm, boolean property_demage,String crime, String type, String location, String time) {
        this.crime = crime;
        this.type = type;
        this.location = location;
        this.time = time;
        police=new PoliceMan( rank,salary,attendence);
        crimes=new Criminal(criminal_no,punishment, duration);
        victimes=new Victim(crime_attempted,  economical_loss, emotional_harm,  property_demage);

    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public PoliceMan getPolice() {
        return police;
    }

    public void setPolice(PoliceMan police) {
        this.police = police;
    }

    public Criminal getCrimes() {
        return crimes;
    }

    public void setCrimes(Criminal crimes) {
        this.crimes = crimes;
    }

    public Victim getVictimes() {
        return victimes;
    }

    public void setVictimes(Victim victimes) {
        this.victimes = victimes;
    }

    @Override
    public String toString() {
        return "Complain{" +
                "crime='" + crime + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", police=" + police +
                ", crimes=" + crimes +
                ", victimes=" + victimes +
                '}';
    }
}

