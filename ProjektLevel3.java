package playground;

public class ProjektLevel3 extends spaceinvadersProject.playground.SpaceInvadersLevel
{
	@Override
	public String getName()
	{
		return "Level3";
	}
	@Override
	protected int calcNrEnemies() 
	{
		return 10;
	}
	
	@Override
	protected double calcEnemySpeedX() 
	{
		return 800;
	}
	
	@Override
	protected double calcEnemySpeedY() 
	{
		return 140;
	}
	
	@Override
	protected String getStartupMessage()
	{
		return "Level 3!!!";
	}
}
