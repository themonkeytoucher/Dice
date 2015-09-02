import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die dice;

public void setup()
{	
	size(300,300);
	noLoop();
}
public void draw()
{
	background(0);
	dice = new Die(150,150);
	dice.show();
		//your code here
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX,myY,rollr,answ;
	
	//variable declarations here
	Die(int x, int y)
	{
		//variable initializations here
		myX = x;
		myY = y;
		rollr = (int)(Math.random()*6)+1;
		answ = 0;

	}
	public void roll()
	{
		//your code here
		if (rollr == 1){
			answ = 1;
		}
		if (rollr == 2){
			answ = 2;
		}
		if (rollr == 3){
			answ = 3;
		}
		if (rollr == 4){
			answ = 4;
		}
		if (rollr == 5){
			answ = 5;
		}
		if (rollr == 6){
			answ =  6;
		}
								


	}
	public void show()
	{
		rect (40,40,40,40);
		fill(0);
		ellipse(60, 60, 5, 5);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
