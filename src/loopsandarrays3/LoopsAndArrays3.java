/*
 * Evan Robertson
 * October 25th 2018
 * Finds the average of marks listed
 */

package loopsandarrays3;

/**
 *
 * @author evrob0095
 */
public class LoopsAndArrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declare Array with marks
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
        //Variables
        double total=0;
        double average;
        
        //Output the marks usinga loop to go through each mark
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        //Use a loop to calculate total
        for (int i = 0; i<=8; i= i + 1)
        {
            total = total + marks[i];
        }
        
        //Find average 
        average = total/9;
        
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        //Output average
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
