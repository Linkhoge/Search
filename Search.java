public class Search {

    // linear search
   public static int linearSearch(int[] array, int target)
    {

        // loop through each element in the array from index 0 to the last index
        for (int i = 0; i < array.length; i++)
        {
            // if the array index is = to the target
            if (array[i] == target)
            {
                System.out.println("Found at index " + i);
                return i;
            }
        }
        // if element not found return -1 or not found
        System.out.println("Element not found");
        return -1;
    }

    public static int binarySearch(int[] array, int target)
    {
        int low = 0; // start
        int high = array.length - 1; // end
        int mid; // middle

        while (low <= high)
        {
            mid = (low + high) / 2; // calc middle
            // if (array[mid] < target) ??


            if (array[mid] == target) // isnt needed can just return mid but insures the search func works and finds the target in the array
            {
                return mid; // target found
                // sys.o.println("Target found at index: " + mid);
            } 

            else if (array[mid] < target) {
                low = mid + 1; // search right side
            }

            else
            {
                high = mid - 1; // search left side
            }
            }
            
            // not found
            // sys.o.println("Target not found.");
            return -1;
}
}