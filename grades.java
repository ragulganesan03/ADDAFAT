import java.util.Arrays;

public class grades {
    public static void main(String[] args) {
        // Predefined input
        int[] marks = { 85, 72, 91, 68, 77 };

        System.out.println("Predefined Marks:");
        printArray(marks);

        // Sorting the marks in descending order
        Arrays.sort(marks);
        reverseArray(marks);

        System.out.println("Sorted Marks:");
        printArray(marks);

        // Assigning grades
        assignGrades(marks);

        // Printing grades
        System.out.println("Grades:");
        printGrades(marks);
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int mark : arr) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Utility method to reverse array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Utility method to assign grades
    public static void assignGrades(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 80) {
                System.out.println("Grade A - Marks: " + marks[i]);
            } else if (marks[i] >= 70) {
                System.out.println("Grade B - Marks: " + marks[i]);
            } else if (marks[i] >= 60) {
                System.out.println("Grade C - Marks: " + marks[i]);
            } else if (marks[i] >= 50) {
                System.out.println("Grade D - Marks: " + marks[i]);
            } else {
                System.out.println("Grade F - Marks: " + marks[i]);
            }
        }
    }

    // Utility method to print grades
    public static void printGrades(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 80) {
                System.out.println("Grade A - Marks: " + marks[i]);
            } else if (marks[i] >= 70) {
                System.out.println("Grade B - Marks: " + marks[i]);
            } else if (marks[i] >= 60) {
                System.out.println("Grade C - Marks: " + marks[i]);
            } else if (marks[i] >= 50) {
                System.out.println("Grade D - Marks: " + marks[i]);
            } else {
                System.out.println("Grade F - Marks: " + marks[i]);
            }
        }
    }
}
