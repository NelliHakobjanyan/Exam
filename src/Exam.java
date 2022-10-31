public class Exam {

    //  Find the biggest number between four numbers
    public int findMax(int a, int b, int c, int d) {
        int max;
        int max1 = a > b ? a : b;
        int max2 = c > d ? c : d;
        max = max1 > max2 ? max1 : max2;
        return max;
    }

    // Write a Java program to find smalest element of a given array
    public static int minValueOfArray(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    // Write a method that will count how many members of an array are greater than the first member
    public static int countOfGreaterMembers(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[0]) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Exam exam = new Exam();
        int array[] = {3, 3, 3, 4, 5, 2};

        //  Find the biggest number between four numbers
        int max = exam.findMax(0, 100, 6, 6);
        System.out.println("the max is: " + max);

        //Write a Java program to find smallest element of a given array
        int[] minValue = new int[]{minValueOfArray(array)};
        System.out.println("the min value in array is: " + minValueOfArray(minValue));

        // Write a method that will count how many members of an array are greater than the first member
        int count = countOfGreaterMembers(new int[]{1, 7, 6, 4});
        System.out.println("test " + count);
    }
}

