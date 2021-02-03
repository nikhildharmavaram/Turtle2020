package bookClasses;

import java.util.*;


public class TurtleTest
{
  public static void main(String[] args)
  {
    Random randNumGen = new Random();
    World world = new World(false);
    Turtle me = new Turtle(world);

    //Turtle[] turtleArray = new Turtle[1000];
    //for (int i=0; i < 1000; i++)
      //turtleArray[i] = new Turtle(world);

    //for (int i=0; i < 1000; i++)
    //{
      //turtleArray[i].turn(randNumGen.nextInt(360));
      //turtleArray[i].forward(100);
    //}
    //me.moveTo(200,200);
    //me.square(200);
    //me.drawEqTriangle(200);
    //me.drawRec(200, 100);
    //me.drawHex(100);
    //me.drawCircleRadius(20);
   // me.drawCircleDiameter(20);
    world.setVisible(true);

  }
}