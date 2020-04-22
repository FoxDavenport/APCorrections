
/**
 * Write a description of class Unit6_Q12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6_Q12
{
    /* missing loop header */
{
int temp = numArr[k];
numArr[k] = numArr[numArr.length - k - 1];
numArr[numArr.length - k - 1] = temp;
}

//want to reverse array. If it is [1,2,3] then want [3,2,1]
//need to find missing loop

//for (int k = 0; k < numArr.length / 2; k++)
//This is the correct answer. Iterate through array left to right
//Swaps element k's position from front to end. Stops when k reach middle of array
//Results in reverse order
}
