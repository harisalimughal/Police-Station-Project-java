 

public class PoliceMan  extends Person {
    private int rank;
    private float salary;
    private float attendence;

    public PoliceMan() {
    }
    public PoliceMan(int rank,float salary,float attendence){

        this.rank=rank;
        this.salary=salary;
        this.attendence=attendence;

    }
    public PoliceMan(Person p,int rank,float salary,float attendence){
        super(p.id,p.gender,p.name);
        this.rank=rank;
        this.salary=salary;
        this.attendence=attendence;

    }

    public PoliceMan(int id, char gender, String name, int rank,float salary,float attendence) {
        super(id, gender, name);
        this.attendence = attendence;
        this.rank=rank;
        this.salary=salary;
    }

    public float getAttendence() {
        return attendence;
    }

    public void setAttendence(float attendence) {
        this.attendence = attendence;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setperson(Person p){
        super.setId(p.id);
        super.setGender(p.gender);
        super.setName(p.name);
    }

    /*
    @Override
    public String toString() {
        return "PoliceMan{" + "id=" + getId() +", gender="+ getGender()+", name="+getName()+
                ", rank=" + rank +
                ", salary=" + salary +
                ", attendence=" + attendence +
                '}';
    }
}
*/
public float[] getArray() {

    float[] array = new float[3];
    array[0]= rank;
    float a =(salary);
    array[1]=a;
    float b = (attendence);
    array[2]=b;
    return array;
}

}
