
/**
 * Write a description of class Unit6_Q13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6_Q13
{
    int maximum = /* missing initial value */;
for (int k = 1; k < values.length; k++)
{
if (values[k] > maximum)
{
maximum = values[k];
}
}
System.out.println(maximum);

//want to print max value of an array. need to set int max. which one will make it work?
//values[0]
//This is the correct answer. Compares each integer in the array after the first
//to max. If integer>max found, then max assigned to that integer. By making
//the max values[0], first element is max to begin with. Any integer bigger will
//be compared to max and code will work. 
}
