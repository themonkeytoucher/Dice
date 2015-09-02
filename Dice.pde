Die dice;

void setup()
{	
	size(300,300);
	noLoop();
}
void draw()
{
	background(0);
	dice = new Die(150,150);
	dice.show();
		//your code here
}
void mousePressed()
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
	void roll()
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
	void show()
	{
		if (answ==1) {
			rect (myX,myY,40,40);
			fill(0);
			ellipse(myX+20, myY+20, 5, 5);
		} else if 
	}
}
