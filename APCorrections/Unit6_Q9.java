
/**
 * Write a description of class Unit6_Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6_Q9
{
    public class Toy
{
private int yearFirstSold;
public int getYearFirstSold()
{
return yearFirstSold;
}
/* There may be instance variables, constructors, and other methods not shown. */
}
   
/* for (Toy k : toyArray)
{
System.out.println(k.getYearFirstSold());
}
*/
//This code appears in another class other than toy. Looking for same output


/* for (int k = 0; k < toyArray.length; k++)
{
System.out.println(getYearFirstSold(k));
}
*/

/* for (int k = 0; k < toyArray.length; k++)
{
System.out.println(k.getYearFirstSold());
}
*/

/* for (int k = 0; k < toyArray.length; k++)
{
System.out.println(toyArray[k].getYearFirstSold());
}
*/

//Only 3rd segment gets same output. Uses the loop control variable k 
//as an index into toyArray and the expression toyArray[k] as the required 
//Toy object reference for the getYearFirstSold method call.
}

