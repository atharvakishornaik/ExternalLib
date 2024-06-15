package playground;
import javashooter.playground.Playground;
import javashooter.gameobjects.RectObject;
import javashooter.gameobjects.CircleObject;
import controller.BounceController;
import controller.personalcontroller;
import java.awt.Color;
import java.awt.Graphics2D;

public class W7Level extends Playground
{

	@Override
	public int preferredSizeX()
	{
		// TODO Auto-generated method stub
		return 700;
	}

	@Override
	public int preferredSizeY()
	{
		// TODO Auto-generated method stub
		return 700;
	}

	@Override
	public String getName()
	{
		// TODO Auto-generated method stub
		return "Custom Level";
	}

	@Override
	public void applyGameLogic()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean gameOver()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean levelFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resetRequested() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void redrawLevel(Graphics2D g2)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepareLevel(String level)
	{
		// TODO Auto-generated method stub
		RectObject BlueRect = new RectObject("Danger", this, 300, 300, 150, 50, 30, 30, Color.blue);
		BounceController ControlBlueRect = new BounceController();
		BlueRect.setController(ControlBlueRect);
		addObject(BlueRect);
		
		RectObject GreenRect  = new RectObject("Danger2", this, 200, 200, -150, -50, 30, 30, Color.green);
		BounceController ControlGreenRect = new BounceController();
		GreenRect.setController(ControlGreenRect);
		addObject(GreenRect);
		
		CircleObject OrangeCirc  = new CircleObject("Danger3", this, 100, 60, 50, 50, 20, Color.orange);
		personalcontroller ControlOrangeCirc = new personalcontroller();
		OrangeCirc.setController(ControlOrangeCirc);
		addObject(OrangeCirc);
	}

}
