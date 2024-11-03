// Student Name     : Ariel Fajimiyo
// Student Id Number: C00300811@setu.ie
// Date             : 29/10/24
// Purpose          : A test driver program for our linear and binary search methods
// https://www.geeksforgeeks.org/binary-search/ and https://blackboard.itcarlow.ie/bbcswebdav/pid-921424-dt-content-rid-5470313_1/xid-5470313_1
// https://blackboard.itcarlow.ie/bbcswebdav/pid-906651-dt-content-rid-5470312_1/xid-5470312_1
// (Searching Chapter 2 Powerpoint, Intro Chapter 1.5 Powerpoint)

public class Q1 {
    public static void main(String[] args) {
            int[] sortedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            int target = 13;

            // Call the linearSearch method
            int index = Search.linearSearch(sortedNumbers, target);
            
            //linearSearch(sortedNumbers, target);

            if (index != -1) // -1 is the default value if the target is not found
            {
                System.out.println("Target at index: " + index);
            }
            else
            {
                System.out.println("Target not found");
            }

           // Call the binarySearch method
           int index2 = Search.binarySearch(sortedNumbers, target);

            if (index2 != -1) // -1 is the default value if the target is not found
            {
                System.out.println("Target at index: " + index2);
            }
            else
            {
                System.out.println("Target not found");
            }
        }
    }
