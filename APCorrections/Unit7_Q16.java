
/**
 * Write a description of class Unit7_Q16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7_Q16
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
possibleIndex--;   // line 10
}
elements[possibleIndex] = temp;
}
}
int[] arr = {10, 8, 3, 4};
insertionSort(arr);
//Want to know how many times possibleIndex--; in line 10 will execute
//due to call to insertionSort;
//The answer is 5 times. While loop iterates every time array element shifted
//to the right because of an insertion. Statement in 10 execute once for every of this
//10 shift when 8 come. 8 and 10 shift when 3 come. 8 and 10 shift when 4 come.
//Total of 5 shifts, so answer is 5 
}
