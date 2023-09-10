

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // PARENT CLASS PERSON


        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the our records System");
        System.out.println("Plz Enter the id of the person ");
        int id=sc.nextInt();
        System.out.println("Plz Enter the gender of the person , Enter \'M' for Male \'F' for Female ");
        char gender=sc.next().charAt(0);
        System.out.println("Plz Enter the name of the person ");
        String name=sc.next();
        Person p=new Person(id,gender,name);
        System.out.println("--------------------------------------------------------------------------------------");


        // SUB CLASS POLICEMAN EXTENDS PERSON



        System.out.println("The detail of the person is :\n"+p.toString());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Plz Enter the rank of the person ");
        int rank=sc.nextInt();
        System.out.println("Plz Enter the salary of the person ");
        float salary=sc.nextFloat();
        System.out.println("Plz Enter the attendence of the person ");
        float attendence=sc.nextFloat();
        PoliceMan pm=new PoliceMan(rank,salary,attendence);
        pm.setperson(p);

        float [] array = new float[3];
        array = pm.getArray();
        for (int i=0; i < 3; i++)
        {
            System.out.println(array[i]);
        }




        // SUB CLASS CRIMINAL EXTENDS PERSON



        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("The record of the Police man with his previous record is :\n"+pm.toString());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Plz Enter the criminal number  of the person ");
        int criminal_no=sc.nextInt();
        System.out.println("Plz Enter the punishment   of the person ");
        String punishment=sc.next();
        System.out.println("Plz Enter the duration  of the person " );
        String duration=sc.next();
        Criminal c=new Criminal(p,criminal_no,punishment,duration);
        System.out.println("--------------------------------------------------------------------------------------");

        String [] criminalArray = new String[3];
        criminalArray = c.getArray();
        for (int i=0; i < 3; i++)
        {
            System.out.println(array[i]);
        }



        // SUB CLASS Victim extends Person




        System.out.println("The record of the Criminal with his previous record is :\n"+c.toString());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Plz Enter the crime attempted by the person ");
        String crime_attempted=sc.next();
        System.out.println("Plz Enter the economical loss by the person ");
        float economical_loss=sc.nextFloat();
        System.out.println("Plz Enter \'true' if he did emotional loss, \'false' if he did not ");
        boolean emotional_harm=sc.nextBoolean();
        System.out.println("Plz Enter \'true' if he did property demage , \'false' if he did not ");
        boolean property_demage=sc.nextBoolean();
        System.out.println("--------------------------------------------------------------------------------------");
        Victim v=new Victim( p, crime_attempted, economical_loss,  emotional_harm,  property_demage);


        System.out.println("The record of the victim with his previous record is :\n"+v.toString());
        System.out.println("--------------------------------------------------------------------------------------");



        // COMPLAIN CLASS



        System.out.println("Plz Enter the crime  by the person ");
        String crime=sc.next();
        System.out.println("Plz Enter type of complain of the  person ");
        String type=sc.next();
        System.out.println("Plz Enter location of crime of the  person ");
        String location=sc.next();
        System.out.println("Plz Enter the crime time by the person ");
        String time=sc.next();
        System.out.println("--------------------------------------------------------------------------------------");
        Complain  co=new Complain( rank, salary, attendence, criminal_no, punishment,duration, crime_attempted,  economical_loss, emotional_harm,  property_demage, crime,  type,  location,  time);
        System.out.println("The record of the complain with his previous record is :\n"+co.toString());



        // PARENT CLASS VEHICAL




        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Plz Enter the model of the vehicaal person ");
        int model=sc.nextInt();
        System.out.println("Plz Enter the engine no of vehicle of   person ");
        int engine_no=sc.nextInt();
        System.out.println("Plz Enter the name of the vehicle of person ");
        String names=sc.next();
        System.out.println("Plz Enter the company name of the vehicle of person ");
        String company=sc.next();
        System.out.println("--------------------------------------------------------------------------------------");
        Vehical ve=new Vehical(model,engine_no,names,company);
        System.out.println("The record of the vehical  is :\n"+ve.toString());



        // VEHICAL EXENDS PRISINOR VAN



        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Plz Enter the capacity of the peoplein the prisoner van ");
        int capacity_of_peaople=sc.nextInt();
        System.out.println("Plz Enter \'true' if bullet proof , \'false' if not ");
        boolean bullet_proff=sc.nextBoolean();
        System.out.println("Plz Enter \'true' if bomb proof , \'false' if not ");
        boolean bomb_proof=sc.nextBoolean();
        System.out.println("--------------------------------------------------------------------------------------");
        PrisinorVan pv=new PrisinorVan(capacity_of_peaople,bullet_proff,bomb_proof,pm,c,v);


        int[] PrisinorVanArray = new int[3];

        PrisinorVanArray = pv.getArray();
        for (int i=0; i < 3; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println("The record of the prisoner van  is :\n"+pv.toString());
        System.out.println("--------------------------------------------------------------------------------------");



        // BIKE EXTENDS VEHICAL



        System.out.println("Plz Enter the area of the bike of the person ");
        int  area= sc.nextInt();
        System.out.println("Plz Enter the chasing speed of the bike of the person ");
        float chasing_speed=sc.nextFloat();
        Bike b=new Bike(area,chasing_speed,pm,c,v);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("The record of the bike is :\n"+b.toString());



        // BIKE EXTENDS VEHICAL SUBCLASS


        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Plz Enter the capacity of people of the person ");
        int capacirty_of_people=sc.nextInt();
        System.out.println("Plz Enter \'true' if  car is bullet proof , \'false' if not ");

        boolean bullet_proof=sc.nextBoolean();
        System.out.println("Plz Enter patrolling area of car of  the person ");
        String patrolling_area=sc.next();
        System.out.println("Plz Enter the chasing speed of car of the person ");
        String chasing_speed_car=sc.next();
        Car car=new Car(capacirty_of_people, bullet_proof,patrolling_area,chasing_speed_car,pm,c,v);
        System.out.println("The record of the car is :\n"+car.toString());
        System.out.println("*****************THANKS*****************");


    }
}
