

public class Criminal extends Person {
    private   int criminal_no;
    private  String punishment;
    private String duration;

    public Criminal() {
    }

    public Criminal(int criminal_no,String punishment,String duration) {
        this.criminal_no = criminal_no;
        this.punishment=punishment;
        this.duration=duration;

    }
    public Criminal(Person p,int criminal_no,String punishment,String duration) {
        super(p.id,p.gender,p.name);
        this.criminal_no = criminal_no;
        this.punishment=punishment;
        this.duration=duration;

    }

    public Criminal(int id, char gender, String name, int criminal_no,String punishment ,String duration) {
        super(id, gender, name);
        this.criminal_no = criminal_no;
        this.punishment=punishment;
        this.duration=duration;
    }

    public int getCriminal_no() {
        return criminal_no;
    }

    public void setCriminal_no(int criminal_no) {
        this.criminal_no = criminal_no;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPunishment() {
        return punishment;
    }

    public void setPunishment(String punishment) {
        this.punishment = punishment;
    }
    public void setperson(Person p){
        super.setId(p.id);
        super.setGender(p.gender);
        super.setName(p.name);
    }

    /*
   @Override
    public String toString() {
        return "Criminal{" +"id="+id+", gender="+gender+", name="+name+
                ", criminal_no=" + criminal_no +
                ", punishment='" + punishment + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }


     */

    public String[] getArray(){

        String[] Array = new String [3];

        String str1 = Integer.toString(criminal_no);
        Array [0]=str1;

        String  a =(punishment);
        Array [1]=a;
        String  b = (duration);
        Array [2] =b;
       return Array;

    }

}






