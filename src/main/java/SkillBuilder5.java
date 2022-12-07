/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        //TODO: replace this line with your code.
        double sum = 0.0;
        double[] average = new double[data.length];
        for(int index=0; index < data.length; index++){
            sum += data[index];
            average[index] = sum / (index+1);
        }

        return average;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        //TODO: replace this line with your code.
        int result = 0;
        for(int index=0; index<anArray.length; index++){
            if(searchValue == anArray[index]){
                result = index;
                break;
            }else{
                result = -1;
            }
        }
        return result;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        //TODO: replace this line with your code.
        int result = 0;
        for(int index=0; index<anArray.length; index++){
            if(s == anArray[index]){
                result = index;
                break;
            }else{
                result = -1;
            }
        }
        return result;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        // add your code here

       String[] sRemoved = new String[anArray.length-1];
       int indexOfSRemoved = 0;
       int a = indexOfSRemoved;

        for(int index=0; index<anArray.length; index++){
            if(s != anArray[index]){
                sRemoved[indexOfSRemoved++] = anArray[index];
                a++;
            }
        }
        int indexOfNullRemoved = 0;
        String[] nullRemoved = new String[a];
        for(int index=0; index<sRemoved.length; index++){
            if(sRemoved[index] != null){
                nullRemoved[indexOfNullRemoved++] = sRemoved[index];
            }
        }
        return nullRemoved;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {

        // add your code here

        int indexFromLeft = 0;
        int indexFromRight = anArray.length-1;
        while(indexFromLeft < indexFromRight){
            int reversed = anArray[indexFromLeft];
            anArray[indexFromLeft] = anArray[indexFromRight];
            anArray[indexFromRight] = reversed;
            indexFromLeft++;
            indexFromRight--;

        }
    }
}
