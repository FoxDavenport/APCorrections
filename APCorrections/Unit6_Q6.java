
/**
 * Write a description of class Unit6_Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6_Q6
{
    public static void main(String[]args){
        String [] fruits = {"apples", "bananas", "cherries", "dates"};
        
        for (int i = 0; i <= fruits.length; i++)
{
System.out.println(fruits[i]);
}

for (int i = 0; i <= fruits.length - 1; i++)
{
System.out.println(fruits[i]);
}

for (int i = 1; i <= fruits.length; i++)
{
System.out.println(fruits[i - 1]);
}
}
}
//Only the first segment gets an ArrayIndexOutOfBoundsException as code 
//iterates from 0 to 4. Last entry is a 3