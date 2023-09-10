

public class PrisinorVan extends Vehical {
    private int capacity_of_peaople;
    private boolean bullet_proff;
    private boolean bomb_proof;
    private PoliceMan police;
    private Criminal criminals;
    private Victim victimes;

//    private String [] array;

    public PrisinorVan() {

    }
    public PrisinorVan(Vehical v,int capacity_of_peaople, boolean bullet_proff, boolean bomb_proof) {
        super(v. model, v. engine_no, v.name, v. company);
        this.capacity_of_peaople = capacity_of_peaople;
        this.bullet_proff = bullet_proff;
        this.bomb_proof = bomb_proof;
    }

    public PrisinorVan(int model, int engine_no, String name, String company, int capacity_of_peaople, boolean bullet_proff, boolean bomb_proof, PoliceMan police, Criminal criminals, Victim victimes) {
        super(model, engine_no, name, company);
        this.capacity_of_peaople = capacity_of_peaople;
        this.bullet_proff = bullet_proff;
        this.bomb_proof = bomb_proof;
        this.police = police;
        this.criminals = criminals;
        this.victimes = victimes;
    }

    public PrisinorVan(int capacity_of_peaople, boolean bullet_proff, boolean bomb_proof, PoliceMan police, Criminal criminals, Victim victimes) {
        this.capacity_of_peaople = capacity_of_peaople;
        this.bullet_proff = bullet_proff;
        this.bomb_proof = bomb_proof;
        this.police = police;
        this.criminals = criminals;
        this.victimes = victimes;
    }

    public int getCapacity_of_peaople() {
        return capacity_of_peaople;
    }

    public void setCapacity_of_peaople(int capacity_of_peaople) {
        this.capacity_of_peaople = capacity_of_peaople;
    }

    public boolean isBullet_proff() {
        return bullet_proff;
    }

    public void setBullet_proff(boolean bullet_proff) {
        this.bullet_proff = bullet_proff;
    }

    public boolean isBomb_proof() {
        return bomb_proof;
    }

    public void setBomb_proof(boolean bomb_proof) {
        this.bomb_proof = bomb_proof;
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


//    @Override
//    public String[] toString() {
//        return "PrisinorVan{" +
//                "capacity_of_peaople=" + capacity_of_peaople +
//                ", bullet_proff=" + bullet_proff +
//                ", bomb_proof=" + bomb_proof +
//                ", police=" + police +
//                ", criminals=" + criminals +
//                ", victimes=" + victimes +
//                '}';
//        return array[];
//    }


    public int[] getArray()
    {
        int[] array = new int[3];
        array[0] = capacity_of_peaople;
        int a = (bullet_proff) ? 1 : 0;
        array[1] = a;
        int b = (bomb_proof) ? 1 : 0;
        array[2] = b;
        return array;
    }

//    public void setArray(String[] array) {
//        this.array = array;
//    }

    public String display(){
        return "PrisinorVan{" +
                "capacity_of_peaople=" + capacity_of_peaople +
                ", bullet_proff=" + bullet_proff +
                ", bomb_proof=" + bomb_proof +
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
