package w7;
import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import playground.W7Level;


public class EigenesSpielW7 extends GameLoop 
{
	Playground currentLevel= null ;
	public Playground nextLevel(Playground currentLevel) 
	{
        return new W7Level();
    }
	
	public static void main(String[] args)
	{
        EigenesSpielW7 start = new EigenesSpielW7();
        start.runGame(args);
    }
}

