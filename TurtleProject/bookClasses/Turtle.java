package bookClasses;

import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////

  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture)
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y,
                 ModelDisplay modelDisplayer)
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }

  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay)
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }

  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }

  /////////////////// methods ///////////////////////


  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
    t1.square(25);
  }
  /**
   * Square - draw a square of n length
   * @param side length
   */

  public void square(int side)
  {
      forward(side);
      turn(90);
      forward(side);
      turn(90);
      forward(side);
      turn(90);
      forward(side);
      turn(90);


  }
public void drawEqTriangle(int side)
{
    forward(side);
    turn(120);
    forward(side);
    turn(120);
    forward(side);
    turn(120);
}
public void drawRec(int width, int height)
{
    forward(height);
    turn(90);
    forward(width);
    turn(90);
    forward(height);
    turn(90);
    forward(width);
    turn(90);
}
public void drawHex(int side)
{
    forward(side);
    turn(60);
    forward(side);
    turn(60);
    forward(side);
    turn(60);
    forward(side);
    turn(60);
    forward(side);
    turn(60);
    forward(side);
    turn(60);
}
public void randomWalk(int steps)
{
    Random gen = new Random();
    penDown();
    double angle = gen.nextInt(360) + 1;
    int x = steps * Math.cos(angle);
    int y = steps * Math.sin(angle);
    moveTo(steps * Math.cos(angle), steps * Math.sin(angle));
}
} // this } is the end of class Turtle, put all new methods before this