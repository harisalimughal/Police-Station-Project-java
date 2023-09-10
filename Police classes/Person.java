

public class Person {
    protected int id;
    protected char gender;
    protected String name;

    public Person()
    {

    }
    public Person(int id,char gender,String name){
        this.id=id;
        this.gender=gender;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
