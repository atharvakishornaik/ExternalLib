package playground;

public class ProjektLevel1 extends spaceinvadersProject.playground.SpaceInvadersLevel
{
	@Override
	public String getName()
	{
		return "Level1";
	}
	
	@Override
	protected int calcNrEnemies() 
	{
		return 1;
	}
	
	@Override
	protected double calcEnemySpeedX() 
	{
		return 160;
	}
	
	@Override
	protected double calcEnemySpeedY() 
	{
		return 80;
	}
	
	@Override
	protected String getStartupMessage()
	{
		return "Level 1!!!";
	}
}
