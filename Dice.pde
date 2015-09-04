Die dice;

void setup()
{	
	size(320,360);
	noLoop();
}
void draw()
{
	background(255);

	for (int i=0; i<300; i=i+40){

		for (int y=0; y<300; y=y+40){
			dice = new Die(i,y);
			dice.roll();
			dice.show();
		}
	}
	if (mousePressed == true && mouseButton == RIGHT) {
			noLoop();
	}
			//your code here
}
void mousePressed()
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

	}

	void roll()
	{
		//your code here
		rollr = (int)(Math.random()*6)+1;

	}

	void show()
	{	
		fill(180,5,121);
		rect (myX,myY,40,40);
		fill(0);

		if (rollr==1) {
			ellipse(myX+20, myY+20,5,5);
		} else if (rollr == 2) {
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+30,myY+30,5,5);
		} else if (rollr == 3) {
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+20,myY+20,5,5);
			ellipse (myX+30,myY+30,5,5);
		} else if (rollr == 4) {
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+30,myY+10,5,5);
			ellipse (myX+10,myY+30,5,5);
			ellipse (myX+30,myY+30,5,5);
		} else if (rollr == 5){
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+30,myY+10,5,5);
			ellipse (myX+10,myY+30,5,5);
			ellipse (myX+30,myY+30,5,5);
			ellipse (myX+20,myY+20,5,5);
		} else if (rollr == 6) {
			ellipse (myX+10,myY+10,5,5);
			ellipse (myX+30,myY+10,5,5);
			ellipse (myX+10,myY+20,5,5);
			ellipse (myX+30,myY+20,5,5);
			ellipse (myX+10,myY+30,5,5);
			ellipse (myX+30,myY+30,5,5);
		}

	}
}
