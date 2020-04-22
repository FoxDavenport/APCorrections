
/**
 * Write a description of class Unit7_Q15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7_Q15
{
    public int seqSearch(int[] arr, int target)
{
for (int j = 0; j < arr.length; j++)
{
if (arr[j] == target)
{
return j;
}
}
return -1;
}

public int seqSearch2(int[] arr, int target)
{
for (int j : arr)
{
if (j == target)
{
return j;
}
}
return -1;
}
//want to know the difference between the two code segments by changing code
//The answer is that the modification in the 2nd will cause the value of target 
//to be returned instead of the index of target in cases where target appears in arr.
//Reason is that the enhanced for loop stores values of each array element in j.
//Each element compared to target. If equal to target then j returned 
}
