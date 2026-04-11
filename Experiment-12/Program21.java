import java.util.Arrays;
public class Program21 {
public static void main(String[] args) {
int[] numbers = {5, 2, 9, 1, 7};
System.out.println("Original Array: " + Arrays.toString(numbers));
Arrays.sort(numbers);
System.out.println("Sorted Array: " + Arrays.toString(numbers));
int index = Arrays.binarySearch(numbers, 7);
System.out.println("Element 7 found at index: " + index);
int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
System.out.println("Copied Array: " + Arrays.toString(copiedArray));
int[] filledArray = new int[5];
Arrays.fill(filledArray, 3);
System.out.println("Filled Array: " + Arrays.toString(filledArray));
boolean isEqual = Arrays.equals(numbers, copiedArray);
System.out.println("Are original and copied arrays equal? " + isEqual);
System.out.print("Elements using for-each loop: ");
for (int num : numbers) {
System.out.print(num + " ");
}
System.out.println();
int[][] matrix = {
{1, 2},
{3, 4}
};
System.out.println("2D Array:");
for (int i = 0; i < matrix.length; i++) {
System.out.println(Arrays.toString(matrix[i]));
}
}
}