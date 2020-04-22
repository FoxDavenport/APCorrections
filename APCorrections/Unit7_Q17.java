
/**
 * Write a description of class Unit7_Q17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7_Q17
{
    public static void insertionSort(int[] elements)
{
for (int j = 1; j < elements.length; j++)
{
int temp = elements[j];
int possibleIndex = j;
while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
{
elements[possibleIndex] = elements[possibleIndex - 1];
possibleIndex--;
}
elements[possibleIndex] = temp;   // line 12
}
}
int[] nums = {8, 7, 5, 4, 2, 1};
insertionSort(nums);

//want to know how many times line 12 is executed due to insertionSort;
//Answer is 5 times. Line 12 executes when element inserted. 
//Number of insertions is 6-1, so 5
}
