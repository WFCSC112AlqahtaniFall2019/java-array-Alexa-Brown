import java.util.Scanner;

public class ArrayCylinders {

    public static void main ( String [] args ){
       Scanner in = new Scanner(System.in);
       Cylinder list []= new Cylinder[5] ;
       //Cylinder temp = new Cylinder(0,0);
       //1) fill the information for each Cylinder from the user
        for(int i = 0; i < list.length; i++){
            System.out.println("For cylinder #" + (i +1) + ": ");
            System.out.println("Enter radius");
            int rad = in.nextInt();
            System.out.println("Enter height");
            int height = in.nextInt();
            list[i] = new Cylinder(rad, height);
        }

        // 2)print the information of all Cylinders
        for(int i = 0; i < list.length; i++) {
            Cylinder temp = list[i];
            System.out.println("Cylinder " + (i+1) + " height = " + temp.getHeight());
            System.out.println("Cylinder " + (i+1) + " radius = " + temp.getRadius());
            System.out.println("Cylinder " + (i+1) + " volume = " + temp.getVolume());
        }

    }
 }

