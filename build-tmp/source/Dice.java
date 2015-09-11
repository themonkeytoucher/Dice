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
int sum,one,two,three,four,five,six,total;


public void setup()
{	
	size(320,360);
	noLoop();
}
public void draw()
{
	background(255);

	for (int i=0; i<300; i=i+40){
		for (int y=0; y<300; y=y+40){
			total=0;
			dice = new Die(i,y);
			dice.roll();
			dice.show();
			total = one+(two*2)+(three*3)+(four*4)+(five*5)+(six*6);

		}
		one = 0;
		two = 0;
		three = 0;
		four = 0;
		five = 0;
		six = 0;
	}

	if (mousePressed == true && mouseButton == RIGHT) {
			noLoop();
	}

	text ("Total roll is " + total, 150,350);
}

public void mousePressed()
{	
	loop();
}

class Die //models one single dice cube
{
	int myX,myY,rollr;
	
	//variable declarations here
	Die(int x, int y)
	{
		//variable initializations here
		myX = x;
		myY = y;
		rollr = 0;
		total = 0;

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

		if (rollr==1) {
			ellipse(myX+20, myY+20,5,5);
			one++;
		} else if (rollr == 2) {
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+30,myY+30,5,5);
			two++;
		} else if (rollr == 3) {
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+20,myY+20,5,5);
			ellipse (myX+30,myY+30,5,5);
			three++;
		} else if (rollr == 4) {
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+30,myY+10,5,5);
			ellipse (myX+10,myY+30,5,5);
			ellipse (myX+30,myY+30,5,5);
			four++;
		} else if (rollr == 5){
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+30,myY+10,5,5);
			ellipse (myX+10,myY+30,5,5);
			ellipse (myX+30,myY+30,5,5);
			ellipse (myX+20,myY+20,5,5);
			five++;
		} else if (rollr == 6) {
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+30,myY+10,5,5);
			ellipse (myX+10,myY+20,5,5);
			ellipse (myX+30,myY+20,5,5);
			ellipse (myX+10,myY+30,5,5);
			ellipse (myX+30,myY+30,5,5);
			six++;
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
