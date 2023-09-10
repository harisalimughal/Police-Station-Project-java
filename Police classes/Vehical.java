

public class Vehical {
    protected int model;
    protected int engine_no;
    protected String name;
    protected String company;

    public Vehical() {
    }

    public Vehical(int model, int engine_no, String name, String company) {
        this.model = model;
        this.engine_no = engine_no;
        this.name = name;
        this.company = company;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getEngine_no() {
        return engine_no;
    }

    public void setEngine_no(int engine_no) {
        this.engine_no = engine_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Vehical{" +
                "model=" + model +
                ", engine_no=" + engine_no +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
