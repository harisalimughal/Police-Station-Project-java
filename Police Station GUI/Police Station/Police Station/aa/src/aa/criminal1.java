/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa;

/**
 *
 * @author Prince Ali
 */
public class criminal1 {
     private String name;
    private String gender;
    private int age;
     private String nationality;
      private String offense;

    public criminal1(String name, String gender, int age, String nationality, String offense) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        this.offense = offense;
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

    @Override
    public String toString() {
        return "criminal1{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", nationality=" + nationality + ", offense=" + offense + '}';
    }
      
}
