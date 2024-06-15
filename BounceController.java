package controller;
import javashooter.controller.KinematicsController;

public class BounceController extends KinematicsController
{
	@Override
	  public void updateObject()
	  {
	    if(getX() < 30 || getX() > 670)
	    {
	    	setVX(-getVX());
	    }
	    if(getY() < 30 || getY() > 670)
	    {
	    	setVY(-getVY());
	    }
	    this.applySpeedVector();
	  }
	
}


