package becker;

import becker.robots.*;

public class DeliverParcel
{
    public static void girarDerecha (Robot karel, int a){
       for (int i = 0; i<a; i++ ){
          karel.turnLeft();
      } 
    }
    public static void andar (Robot karel, int a){
       for (int i = 0; i<a; i++ ){
          karel.move();
      } 
    }
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Wall p1= new Wall (prague, 1, 1, Direction.NORTH);
      Wall p2= new Wall (prague, 1, 2, Direction.NORTH);
      Wall p3= new Wall (prague, 1, 2, Direction.EAST);
      Wall p4= new Wall (prague, 2, 2, Direction.EAST);
      Wall p5= new Wall (prague, 2, 2, Direction.SOUTH);
      Wall p6= new Wall (prague, 2, 1, Direction.SOUTH);
      Wall p7= new Wall (prague, 2, 1, Direction.WEST);
      Wall p8= new Wall (prague, 1, 1, Direction.WEST);
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
    
      // Direct the robot to the final situation
      girarDerecha(karel, 2);
      andar (karel, 1);
      girarDerecha(karel, 3);
      andar (karel, 3);
      girarDerecha(karel, 3);
      andar (karel, 3);
      girarDerecha(karel, 3);
      andar (karel, 3);
      girarDerecha(karel, 3);
      andar (karel, 2);
      girarDerecha(karel, 2);
      
      
      	// start turning right as three turn lefts
      
      	// finished turning right
      
     // karel.putThing();
      System.out.println(karel.countThingsInBackpack());
   }
}
