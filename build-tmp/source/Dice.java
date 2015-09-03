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
	background(255);
	dice = new Die(150,150);
	dice.show();
	dice.roll();
		//your code here
}
public void mouseClicked()
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
		rollr = 6;
		answ = 1;

	}
	public void roll()
	{
		//your code here
		rollr = (int)(Math.random()*6)+1;
								


	}
	public void show()
	{	
		fill(180,5,121);
		rect (myX,myY,40,40);
		fill(0);
		strokeWeight(5);

		if (rollr==1) {
			point(myX+20, myY+20);
		} else if (rollr == 2) {
			point (myX+10,myY+10);
			point (myX+30,myY+30);
		} else if (rollr == 3) {
			point (myX+10,myY+10);
			point (myX+20,myY+20);
			point (myX+30,myY+30);
		} else if (rollr == 4) {
			point (myX+10,myY+10);
			point (myX+30,myY+10);
			point (myX+10,myY+30);
			point (myX+30,myY+30);
		} else if (rollr == 5){
			point (myX+10,myY+10);
			point (myX+30,myY+10);
			point (myX+10,myY+30);
			point (myX+30,myY+30);
			point (myX+20,myY+20);
		} else if (rollr == 6) {
			point (myX+10,myY+10);
			point (myX+30,myY+10);
			point (myX+10,myY+20);
			point (myX+30,myY+20);
			point (myX+10,myY+30);
			point (myX+30,myY+30);
		}

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
