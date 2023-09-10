
package aa;


public class Person {
    private String name;
    private String Rank;
    private int cont_num;
    private String Atttndnc;

    public Person(String name, String Rank, int cont_num, String Atttndnc) {
        this.name = name;
        this.Rank = Rank;
        this.cont_num = cont_num;
        this.Atttndnc = Atttndnc;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return Rank;
    }

    public int getCont_num() {
        return cont_num;
    }

    public String getAtttndnc() {
        return Atttndnc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public void setCont_num(int cont_num) {
        this.cont_num = cont_num;
    }

    public void setAtttndnc(String Atttndnc) {
        this.Atttndnc = Atttndnc;
    }

    @Override
    public String toString() {
        return "Staff1{" + "name=" + name + ", Rank=" + Rank + ", cont_num=" + cont_num + ", Atttndnc=" + Atttndnc + '}';
    }
    
}
