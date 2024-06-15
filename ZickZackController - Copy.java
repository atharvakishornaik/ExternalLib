package controller;

import javashooter.controller.LimitedTimeController;

public class ZickZackController extends  LimitedTimeController 
{

	double Interval = 0.5;
	public ZickZackController(double g0, double duration)
	{
		super(g0, duration);
		// TODO Auto-generated constructor stub
	}
	
	
	 @Override
	 public void updateObject()
	 {
		 System.out.println((getGameTime() % 1));
		 if(getGameTime() % 1 <= Interval)
		 {
			 setVX(30);
		 }
		 else
		 {
			 setVX(-30);
		 }
		 super.updateObject(); 	
     }
	
}
