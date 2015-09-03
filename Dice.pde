Die dice;

void setup()
{	
	size(300,300);
	noLoop();
}
void draw()
{
	background(255);
	dice = new Die(150,150);
	dice.show();
	dice.roll();
		//your code here
}
void mouseClicked()
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
