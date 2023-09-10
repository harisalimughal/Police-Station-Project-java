

public class Victim extends Person {
    public  String crime_attempted;
    public float economical_loss;
    public boolean emotional_harm;
    public boolean property_demage;
    public Victim(){

    }
    public Victim(String crime_attempted, float economical_loss, boolean emotional_harm, boolean property_demage) {

        this.crime_attempted = crime_attempted;
        this.economical_loss = economical_loss;
        this.emotional_harm = emotional_harm;
        this.property_demage = property_demage;
    }
    public Victim(Person p,String crime_attempted, float economical_loss, boolean emotional_harm, boolean property_demage) {
        super(p.id,p.gender,p.name);
        this.crime_attempted = crime_attempted;
        this.economical_loss = economical_loss;
        this.emotional_harm = emotional_harm;
        this.property_demage = property_demage;
    }

    public Victim(int id, char gender, String name, String crime_attempted, float economical_loss, boolean emotional_harm, boolean property_demage) {
        super(id, gender, name);
        this.crime_attempted = crime_attempted;
        this.economical_loss = economical_loss;
        this.emotional_harm = emotional_harm;
        this.property_demage = property_demage;
    }

    public String getCrime_attempted() {
        return crime_attempted;
    }

    public void setCrime_attempted(String crime_attempted) {
        this.crime_attempted = crime_attempted;
    }

    public float getEconomical_loss() {
        return economical_loss;
    }

    public void setEconomical_loss(float economical_loss) {
        this.economical_loss = economical_loss;
    }

    public boolean isEmotional_harm() {
        return emotional_harm;
    }

    public void setEmotional_harm(boolean emotional_harm) {
        this.emotional_harm = emotional_harm;
    }

    public boolean isProperty_demage() {
        return property_demage;
    }

    public void setProperty_demage(boolean property_demage) {
        this.property_demage = property_demage;
    }
    public void setperson(Person p){
        super.setId(p.id);
        super.setGender(p.gender);
        super.setName(p.name);
    }

    @Override
    public String toString() {
        return "Victim{" +
                "id=" + id +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", crime_attempted='" + crime_attempted + '\'' +
                ", economical_loss=" + economical_loss +
                ", emotional_harm=" + emotional_harm +
                ", property_demage=" + property_demage +
                '}';
    }
}

