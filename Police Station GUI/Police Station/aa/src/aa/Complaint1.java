/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa;

/**
 *
 * @author Prince Ali
 */
public class Complaint1 {
    private String name;
    private String F_name;
    private String gender;
    private String comType;
    private String detail;

    public Complaint1(String name, String F_name, String gender, String comType, String detail) {
        this.name = name;
        this.F_name = F_name;
        this.gender = gender;
        this.comType = comType;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public String getF_name() {
        return F_name;
    }

    public String getGender() {
        return gender;
    }

    public String getComType() {
        return comType;
    }

    public String getDetail() {
        return detail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setF_name(String F_name) {
        this.F_name = F_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Complaint1{" + "name=" + name + ", F_name=" + F_name + ", gender=" + gender + ", comType=" + comType + ", detail=" + detail + '}';
    }
    
}
