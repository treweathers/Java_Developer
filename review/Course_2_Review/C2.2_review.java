package review.Course_2_Review;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;


//# Course 2.2: Sorting and Searching Algorithms in Java
class Solution {
    public static void main(String args[]) {
        //2.2 - unit 1/7 practice 2
        System.out.println("The number of digits in the 'diameter of Mars': " + countDigits(7623));
        //2.2 - unit 1/7 practice 4
        System.out.println(countStars2(4042)); // Will print the sum of digits of the star code 4042
        
        //2.2 - unit 2/7 practice 2
        int[] bookIDs = {101, 203, 307, 404, 513, 628, 734, 850, 961};
        int searchID = 367;
        int bookIndex = binarySearchForBook(bookIDs, 0, bookIDs.length - 1, searchID);
        if (bookIndex != -1)
            System.out.println("Book with ID " + searchID + " should be placed at the new index." + bookIndex);
        else
            System.out.println("Book with ID " + searchID + " should be placed at the new index.");
        //2.2 - unit 2/7 practice 4
        String[] library = {"Alice in Wonderland", "Moby Dick", "The Great Gatsby", "War and Peace"};
        String bookToFind = "The Great Gatsby"; // Book we want to find
        int result = findBook(library, 0, library.length - 1, bookToFind);
        System.out.println("The book '" + bookToFind + "' is at index: " + result);
        //2.2 - unit 2/7 practice 6
        int[] sortedCatalog = {101, 123, 137, 150, 165, 172, 189, 205, 220};
        int bookCode = 150;
        System.out.println("Book found at index: " + findBook(sortedCatalog, bookCode));
        
        //2.3 - unit 3/7 practice 1
        int arr[] = {-3, -2, 4, 6, 10, 8, 7, 1};
        int x = 7;
        int position = findPosition(arr, x);
        if (position == -1) {
            System.out.println("Element Not Present");
        } else {
            System.out.println("Element Present at Index " + position);
        }
        //2.2 - unit 3/7 practice 2
        int[] nums = new int[] {4, 3, 2, 1, 7, 6, 5};
        System.out.println(findMax(nums));  // Output: 7
        
        int[] nums2 = new int[] {3, 2, 1};
        System.out.println(findMax(nums2));  // Output: 3
        
        int[] nums3 = new int[] {6, 5, 4, 3, 2, 1, 7};
        System.out.println(findMax(nums3));  // Output: 7

        //2.2 - unit 4.7 practice 2
        int[] celestialMagnitudes = {5, 3, 0, -1, -2, 1};
        int pivotPosition = partitionCelestial(celestialMagnitudes, 0, celestialMagnitudes.length - 1);
        System.out.println(pivotPosition);
        // Now, celestialMagnitudes is partitioned, with pivot in the correct position.
        //2.2 - unit 4/7 practice 4
        // Main method to test the quickSort function (Complete, do not change)
        int[] spaceObjects = {109, 76, 45, 32, 88}; // Masses of celestial objects (in arbitrary units)
        quickSort(spaceObjects, 0, spaceObjects.length - 1); // Sorting celestial objects by their mass
        // The print statement is ready to verify your result.
        for (int mass : spaceObjects) {
            System.out.print(mass + ", ");
        }

        //2.2 - unit 5/7 practice 4
        int[] tracks = {11, 2, 5, 7, 8, 3, 6, 9, 10, 1};
        mergeSort(tracks, 0, tracks.length - 1);

        for (int songID : tracks) {
            System.out.print(songID + " ");
        }
        
        /*2.2 - unit 6/7  #### Practice #2
        Great progress, Space Voyager! Now, let's put your skills to the test. We need to sort the grocery inventory alphabetically. Write the line of code that sorts the inventory array and display the sorted inventory.*/
        String[] inventory = {"Bananas", "Cherries", "Apples", "Dates"};
        // TODO: Sort the `inventory` array in alphabetical order and print it out.
        Arrays.sort(inventory);
        System.out.println("Grocery Inventory: " + Arrays.toString(inventory));
        //2.2 - unit 6/7 practice 4
        ArrayList<Product> inventory2 = new ArrayList<>(
            Arrays.asList(
                new Product("Apple", 1.99),
                new Product("Milk", 2.99),
                new Product("Bread", 2.49)
            )
        );
        // Sort products in descending order by price.
        inventory2.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println(inventory2); 
        //2.2 - unit 6/7 practice 5
        ArrayList<GroceryItem> inventory3 = new ArrayList<>(
            Arrays.asList(
                new GroceryItem("Milk", 2.99, 4.5),
                new GroceryItem("Bread", 2.99, 4.7),
                new GroceryItem("Eggs", 3.49, 4.3)
            )
        );
        // TODO: Sort grocery items by price and then by rating
        inventory3.sort(Comparator.comparing(GroceryItem::getPrice).thenComparing(GroceryItem::getRating, Comparator.reverseOrder()));
        System.out.println(inventory);

        //2.2 - unit 7/7 practice 1
        int[] scores = {1, 7, 2, 4, 2, 1, 6};
        System.out.println(findKthLargest(scores, 3));  // It should print 4
        //2.2 - unit 7/7 practice 2
        CountInversions countInversions = new CountInversions();
        int[] numbers1 = {5, 4, 3, 2, 1};
        System.out.println(countInversions.countInversions(numbers1).inversions); // Expected output: 10
        int[] numbers2 = {-3, -2, -1, 0, 1};
        System.out.println(countInversions.countInversions(numbers2).inversions); // Expected output: 0
  }


    /* 2.2 - unit 1/7 #### Practice #2: Let's refine our digit counter to be more selective. Modify the existing countDigits function so that it tallies up only the even digits of a number. Use what you've learned about conditional checks and recursion to accomplish this stellar task.*/
    // Function to count the number of digits in a number using recursion
    static int countDigits(int num) {
        if(num == 0) {
            return 0;
        } else {
            if (num % 2 == 0) {
                return 1 + countDigits(num / 10) ;
            }
            // Recursive case: reduce the number by dividing by 10 and count the rest
            else {
                return countDigits(num / 10);
            }
        }
        }
    /* 2.2 - unit 1/7 #### Practice #4: You will need to help calculate the sum of all digits in a star code number. Replace the TODO with the recursive magic that will do the trick.
    */
    static int countStars2(int number) {
        if(number == 0) return 0; // Base case: if number is 0, stop recursion
        // TODO: Add the recursive logic to sum up the digits of 'number'
        else 
            return number % 10 + countStars2(number / 10);
    }


    /* 2.2 unit 2/7 ####Practice #2: Now, for a slight twist: adjust the binarySearchBook method so that it returns the index where the book should be inserted if it's not found. This will require a subtle change to the return value when the book ID is not present in the array. Don't forget to modify the print statement to reflect new logic.
     */
    static int binarySearchForBook(int[] bookIDs, int start, int end, int searchID) {
        if (start > end) return start; // Base case
        int mid = start + (end - start) / 2; // Find the midpoint
        if (bookIDs[mid] == searchID) return mid; // Target found
        if (bookIDs[mid] > searchID) // If the target is less than the midpoint
            return binarySearchForBook(bookIDs, start, mid - 1, searchID); // Search the left half
        return binarySearchForBook(bookIDs, mid + 1, end, searchID); // Search the right half
    }
    /* 2.2 - unit 2/7 ####  Practice #4: Now, let’s see if you can find our missing book in the library by implementing Binary Search. Fill in the blanks, and may your logic be ever clear!
     */
    static int findBook(String[] books, int start, int end, String target) {
        // TODO: Add base case condition to stop recursion
        if (start > end) return -1;
        
        int mid = start + (end - start) / 2;
        if (books[mid].equals(target)) return mid; // Book found
        
        // TODO: Compare mid book to target book using String.compareTo() method
        //;
        // TODO: Finish the recursive call for searching halves of the array
        if (books[mid].compareTo(target) > 0)
            return findBook(books, start, mid - 1, target);
        return findBook(books, mid + 1, end, target);
    }
    /* 2.2 - unit 2/7 #### Practice #6
    Add the two key parts of the iterative binary search by yourself. Write down the code to complete the core of the our algorithm!
    */
    static int findBook(int[] catalog, int bookCode) {
        int left = 0;
        int right = catalog.length - 1;
        
        while (left <= right) {
            // TODO: implement this
            int mid = left + (right - left) / 2;
            if (catalog[mid] == bookCode) return mid;
            if (catalog[mid] < bookCode) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Book not found
    }


    /* 2.2 - unit 3/7 #### Practice #1
    You have an array of unique numbers forming a 'bitonic sequence'. Now, that's a fancy term for a sequence that first increases, hits a peak, and then decreases. Just picture a cosmic roller coaster ride!
    Your mission? Create a function, findPosition, that returns the 'index' of a given number, 'x', from that array. If 'x' is in hyperspace and not in our sequence, return -1.
    Let's be precise: an input to findPosition is a number you want to locate, and the output is either the number's first occurrence position or -1 if the number does not exist. Now, go supe up your code engines, Voyager! You got this!
    */
     public static int findPosition(int arr[], int x) {
        // TODO: find peak
        int peakIndex = findPeak(arr);
        int searchResult = binarySearch(arr, 0, peakIndex, x, true);
        // TODO: search to the left of the peak
        if (searchResult != -1) {
            return searchResult;
        // TODO: search to the right of the peak
        } else {
            return binarySearch(arr, x, peakIndex + 
             + 1, arr.length - 1, false);
        }
    }

    static int findPeak(int arr[]) {
        int low = 0, high = arr.length - 1;
        // TODO: implement this
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int binarySearch(int arr[], int x, int low, int high, boolean ascending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (ascending) {
                if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                // TODO: implement the descending binary search logic
                if (ascending ? arr[mid] < x : arr[mid] > x) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    /* 2.2 - unit 3/7  #### Practice #2: You're navigating through a galaxy of integers, when suddenly your radar picks up a cyclically sorted array. This isn't ordinary sorting, oh no!
    It's sorted in decreasing order, but a pesky asteroid has bumped some numbers from the tail to the front. Your mission, should you choose to accept it, is to find the largest element in this array.
    */
    public static int findMax(int[] nums) {
        int left = 0, right = nums.length - 1;
        // implement iterative binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }


    /* 2.2 - unit 4/7 #### Practice #2
    Stellar job, Space Wanderer! Now, let's write the code to find the position where we'll label our 'pivot star' amid the galaxy of numbers. It's a small step in the Quick Sort cosmos!
     */
    static int partitionCelestial(int[] magnitudes, int start, int end) {
        int pivot = magnitudes[end];
        int i = start - 1;
        // TODO: Implement the partition loop
        for (int j = start; j < end; j++) {
          if (magnitudes[j] <= pivot) {
            i++;
            int temp = magnitudes[i];
            magnitudes[i] = magnitudes[j];
            magnitudes[j] = temp;
          }
        }
        int temp = magnitudes[i + 1];
        magnitudes[i + 1] = magnitudes[end];
        magnitudes[end] = temp;
        return i + 1;
    }

     /*2.2 - unit 4/7 Practice ####4
    You're doing great, Space Voyager! Now, let's see if you can implement Quick Sort on your own. Specifically, I need you to write the recursive part that deals with sorting the left and right partitions of our space objects. May your code be as swift as comets!
      */
    // Function to perform the Quick Sort
    static void quickSort(int[] spaceObjects, int start, int end) {
        if (start < end) {
            int pivot_index = partition(spaceObjects, start, end);
            // TODO: Implement recursive quickSort call to sort the elements to the left of the pivot
            quickSort(spaceObjects, start, pivot_index - 1);
            // TODO: Implement recursive quickSort call to sort the elements to the right of the pivot
            quickSort(spaceObjects, pivot_index + 1, end);
        }
    }

    // Helper function to partition the array (uses logic from the lesson)
    static int partition(int[] arr, int start, int end) {
        // This part is complete, no changes needed here.
        int pivot = arr[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return (i+1);
    }


    /* 2.2 - unit 5/7 #### Practice #4
    Great progress, Stellar Navigator! Now it's time to take another step forward. In our musical sorting universe, the merge function is like combining melodies in harmony. Can you complete the crucial part of mergeSort function?
    Add the missing code to sort the playlist into a perfect tune!
     */
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // TODO: find mid element
            int mid = (left + right) / 2;
            // TODO: call mergeSort recursively for the left part
            mergeSort(arr, left, mid);
            // TODO: call margeSort recursively for the right part
            mergeSort(arr, mid + 1, right);
            
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftPart = new int[n1];
        int[] rightPart = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftPart[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightPart[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftPart[i] <= rightPart[j]) {
                arr[k] = leftPart[i];
                i++;
            } else {
                arr[k] = rightPart[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftPart[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightPart[j];
            j++;
            k++;
        }
    }

/* 2.2 - unit 7/7 #### Practice #1
Alright, Space Voyager, voyage with me into another intriguing scenario: Imagine you are tuning in to the Space Olympics, and the event you're witnessing features different alien species. You're curious about the top performers. However, all you've got is a huge array of scores, and you want to figure out the k-th highest score. Each integer in this array represents an alien's score and k starts from 1. k = 1 represents the highest score and so forth.
Your mission, should you choose to accept it, is to write a piece of code that gets you this k-th highest score given any set of scores. Handle different values of k and explore various arrays of scores.
Your input will be an array of integers indicating scores and a number k. As for the output, the score corresponding to the k-th highest position is expected.
Now go ahead and show us your cosmic intelligence, Space Voyager!
*/
    public static int findKthLargest(int[] numbers, int k) {
        if(numbers == null || numbers.length < k)
            return Integer.MIN_VALUE;
        return kthLargest(numbers, 0, numbers.length - 1, k);
    }

    static int kthLargest(int[] arr, int start, int end, int k) {
        if (k > 0 && k <= end - start + 1) {
            //TODO: use partition to find pivot's position
            int pos = partition(arr, start, end);
            //TODO: if pivot is in correct position, return the answer
            if (pos - start == k - 1) {
                return arr[pos];
            }
            //TODO: call kthLargest recursively in case position is greater than k
            if (pos - start > k - 1) {
                return kthLargest(arr, start, pos - 1, k);
            }
            //TODO: call kthLargest recursively in case position is less than k
            return kthLargest(arr, pos + 1, end, k - pos + start - 1);
        }

        return Integer.MAX_VALUE;
    }

    static int partition2(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;

        for(int j = start + 1; j <= end; j++) {
            if(arr[j] >= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        return i;
    }
}

/* 2.2 - unit 6/7 #### Practice #4
Alright, Stellar Navigator! We've observed products sorted in ascending order by price. Your mission is to modify the Comparator logic in the starter code so that the inventory sorts in descending order by price. Remember, descending order means arranging from the highest to the lowest.
Let's enhance our inventory sorting skills!
*/
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public String toString() {
        return name + ": $" + price;
    }
}

/* 2.2 - unit 6/7 #### Practice #5
Excellent progress, Space Voyager! Your task now is to sort the grocery inventory by price in the ascending order. In case of a tie, sort by rating in the descending order. Write your own custom comparator using .comparing and .thenComparing functions to organize these space provisions from the lowest to the highest cost!
*/
// Grocery item class
class GroceryItem {
    String name;
    double price;
    double rating; // added field

    GroceryItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating; // added initialization
    }

    String getName() { return name; }
    double getPrice() { return price; }
    double getRating() { return rating; } // added getter

    @Override
    public String toString() {
        return name + ": $" + price + ", rating: " + rating;
    }
}



/* 2.2 - unit 7/7 #### Practice #2
Alright, Stellar Navigator, it's time for your next coding challenge!
In our space analogy, let's say we've got a bunch of asteroids, each with distinct masses. An inversion is like two asteroids where the bigger one appears before the smaller one in space. Let's relate that to numbers: if we have two indices, i and j, with i < j and numbers[i] > numbers[j], then this pair (numbers[i], numbers[j]) is an inversion (they're flipped out of order, just like our universe!). Your mission, should you choose to accept it, is to create countInversions method that takes in numbers as input (an array of distinct integers) and returns the overall number of inversions.
And remember, even in the vast universe, there's no room for duplicate asteroids, so numbers won't have any repeating elements. You'll always receive at least one element in numbers, and those integers might be negative, zero, or positive. Your method should return a single integer - the number of inversions. Now, blast off into the world of inversions, and let's see what you discover!
*/
class Result {
    public int[] sorted;
    public long inversions;

    public Result(int[] sorted, long inversions) {
        this.sorted = sorted;
        this.inversions = inversions;
    }
}

class CountInversions {
    public Result countInversions(int[] arr) {
        if (arr.length <= 1) {
            return new Result(arr, 0);
        }
        int middle = arr.length / 2;
        Result left = countInversions(Arrays.copyOfRange(arr, 0, middle));
        Result right = countInversions(Arrays.copyOfRange(arr, middle, arr.length));
        Result result = mergeAndCountInversions(left.sorted, right.sorted);
        // implement this
        return new Result(result.sorted, left.inversions + right.inversions + result.inversions);
    }

    private Result mergeAndCountInversions(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0;
        long inversions = 0;
        
        // implement this
        for(int k = 0; k < merged.length; k++) {
            if (i < left.length && (j >= right.length || left[i] <= right[j])) {
                merged[k] = left[i++];
            } else {
                merged[k] = right[j++];
                inversions += left.length - i;
            }
        }
        return new Result(merged, inversions);
    }
}
/* COURSE 2 PRACTICE PROBLEM
### 💻 Solution
Here is a complete Java solution that implements the logic for the "Stellar Signal Decryption" problem. This solution uses a custom `Comparator` to sort the stellar objects, which is a key concept covered in your review.
### ⚙️ Explanation

1.  **`StellarObject` Helper Class:** Instead of working with just integers, we create a simple class to hold both the original `magnitude` and its `difference` from the target. This simplifies the sorting logic significantly, as all the necessary information is encapsulated in one object.
2.  **Custom `Comparator`:** This is the most important part. The `compare` method defines our sorting rules:
      * First, it compares the `difference` values. `Integer.compare(o1.difference, o2.difference)` returns a negative value if `o1`'s difference is smaller, a positive value if it's larger, and zero if they are equal.
      * If the differences are the same (`diffComparison == 0`), it then uses the `magnitude` as a tie-breaker. This ensures that for a tie (like `4` and `16` both having a difference of `6`), the smaller magnitude (`4`) will come first in the sorted list.
3.  **Two-Step Sorting:** The solution first sorts the entire list of `StellarObject`s according to our custom rules. This groups the closest objects to the front. Then, it takes just the first `k` elements, which are guaranteed to be the closest. The final `Arrays.sort(result)` ensures the final output array is sorted by magnitude, as requested by the problem.

This approach demonstrates the power of using a custom sorting strategy to solve a problem that is not easily solved by a standard numeric sort.
*/
class StellarSignalDecoder {

    /**
     * A helper class to store the original magnitude and its difference from the target.
     * This makes sorting with a custom comparator much cleaner.
     */
    static class StellarObject {
        int magnitude;
        int difference;

        StellarObject(int magnitude, int target) {
            this.magnitude = magnitude;
            this.difference = Math.abs(magnitude - target);
        }
    }

    public static int[] findKClosest(int[] magnitudes, int k, int target) {
        // Step 1: Create a list of StellarObjects to store magnitudes and their differences.
        java.util.List<StellarObject> stellarObjects = new ArrayList<>();
        for (int magnitude : magnitudes) {
            stellarObjects.add(new StellarObject(magnitude, target));
        }

        // Step 2: Sort the list using a custom Comparator.
        // The Comparator first compares by difference (ascending) and then by magnitude (ascending) for ties.
        stellarObjects.sort(new Comparator<StellarObject>() {
            @Override
            public int compare(StellarObject o1, StellarObject o2) {
                // First, compare by the difference from the target.
                int diffComparison = Integer.compare(o1.difference, o2.difference);
                if (diffComparison != 0) {
                    return diffComparison;
                }
                // If differences are equal, compare by the magnitude itself.
                return Integer.compare(o1.magnitude, o2.magnitude);
            }
        });

        // Step 3: Extract the first k elements from the sorted list.
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = stellarObjects.get(i).magnitude;
        }

        // The problem asks for the final output array to be sorted by magnitude.
        // Since our custom sort already handles ties by sorting magnitudes,
        // and the smallest differences are at the beginning, the first k elements
        // will already be sorted by magnitude if a tie exists.
        // A final sort of the result array is good practice to guarantee the correct output order.
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] magnitudes = {10, 2, 14, 4, 12, 16};
        int k = 3;
        int target = 10;
        
        System.out.println("Input magnitudes: " + Arrays.toString(magnitudes));
        System.out.println("Target: " + target + ", k: " + k);
        
        int[] closestMagnitudes = findKClosest(magnitudes, k, target);
        
        System.out.println("Output (k closest magnitudes): " + Arrays.toString(closestMagnitudes));
        // Expected output: [10, 12, 14]
    }
}


 


 