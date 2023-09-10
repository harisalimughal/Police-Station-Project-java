/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa;

/**
 *
 * @author Prince Ali
 */
public class Prisoner1 {
        private String name;
        private String gender;
         private int age;
         private String nationality;
        private String offense;
        private int case_Num;
        private String bail;
         private int jail;

    public Prisoner1(String name, String gender, int age, String nationality, String offense, int case_Num, String bail, int jail) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        this.offense = offense;
        this.case_Num = case_Num;
        this.bail = bail;
        this.jail = jail;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getOffense() {
        return offense;
    }

    public int getCase_Num() {
        return case_Num;
    }

    public String getBail() {
        return bail;
    }

    public int getJail() {
        return jail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setOffense(String offense) {
        this.offense = offense;
    }

    public void setCase_Num(int case_Num) {
        this.case_Num = case_Num;
    }

    public void setBail(String bail) {
        this.bail = bail;
    }

    public void setJail(int jail) {
        this.jail = jail;
    }

    @Override
    public String toString() {
        return "Prisoner1{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", nationality=" + nationality + ", offense=" + offense + ", case_Num=" + case_Num + ", bail=" + bail + ", jail=" + jail + '}';
    }
         
}
