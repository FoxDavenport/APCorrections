
/**
 * Write a description of class Unit7_Q13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7_Q13
{
    public static int sequentialSearch(ArrayList<Integer> elements, int target)
{
for (int j = 0; j < elements.size(); j++)     // Line 3
{
if (elements.get(j) == target)
{
return j;
}
}
return -1;
}

//If replace Line 3 with 
//for (int j = (elements.size() - 1); j >= 0; j--)
//What will happen?
//The answer is that the modified method will return the index of the last
//appearance of the target value in the list or -1 if target value not in list
//Reason is that changing method makes it search list right to left and not left to right

}
