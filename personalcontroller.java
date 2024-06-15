package controller;

public class personalcontroller extends BounceController
{
	@Override
	  public void updateObject()
	  {
		if (getX() < 50 || getX() > 650) {
            setVX(-this.getVX() * Math.random() * 2 + 500);
        } 

        if (getX() <= 50)
        {
            setX(50);
        }
        else if (getX() >= 650)
        {
            setX(650);
        }

        if (getY() < 50 || getY() > 650)
        {
        	setVY(-this.getVY() * Math.random() * 2 + 500);
        }

        if (getY() <= 50) 
        {
            setY(50);
        }
        else if (getY() >= 650)
        {
            setY(650);
        }
        this.applySpeedVector();
	  }
}