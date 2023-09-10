/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa;

/**
 *
 * @author Prince Ali
 */
public class main1 {
    private String staff;
     private String criminal;
     private String prisoner;
       private String complaint;
        private String logout;
         private String exit;

    public main1(String staff, String criminal, String prisoner, String complaint, String logout, String exit) {
        this.staff = staff;
        this.criminal = criminal;
        this.prisoner = prisoner;
        this.complaint = complaint;
        this.logout = logout;
        this.exit = exit;
    }

    public String getStaff() {
        return staff;
    }

    public String getCriminal() {
        return criminal;
    }

    public String getPrisoner() {
        return prisoner;
    }

    public String getComplaint() {
        return complaint;
    }

    public String getLogout() {
        return logout;
    }

    public String getExit() {
        return exit;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public void setCriminal(String criminal) {
        this.criminal = criminal;
    }

    public void setPrisoner(String prisoner) {
        this.prisoner = prisoner;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public void setLogout(String logout) {
        this.logout = logout;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }
    
    @Override
    public String toString() {
        return "main1{" + "staff=" + staff + ", criminal=" + criminal + ", prisoner=" + prisoner + ", complaint=" + complaint + ", logout=" + logout + ", exit=" + exit + '}';
    }
         
}
