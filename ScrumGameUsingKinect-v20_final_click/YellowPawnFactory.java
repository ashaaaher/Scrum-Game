
/**
 * Write a description of class YellowPawnFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YellowPawnFactory extends PawnCreator
{
   public PawnFactory getPawn()
   {
       return new YellowPawn();
    }
}
