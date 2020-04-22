
/**
 * Write a description of class Unit7_Q14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7_Q14
{
    public static int search(int[] arr, int target)
{
int result = -1;
for (int j = 0; j < arr.length; j++)
{
if (arr[j] == target)
{
result = j;  // Line 8
}
}
return result;
}
//What happens when replace line 8 with
//result= arr[j];
//The answer is that the modified method will return target if target appears
//in arr and will return -1 otherwise. This is because j is an index into the
//array. arr[j] is an element of the array. When this equals target, returns target
}
