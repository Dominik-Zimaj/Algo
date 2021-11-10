package BinarySearch;

public class Main {

    // sorted list !
    static int[] list = {1,5,6,9,22,44,77,88,99,123,335,567,8888,877764};
    static int searchValue =  567;
    public static void main(String[] args) {
        int lowIndex = 0;
        int highIndex = list.length-1;
        int middleIndex = (lowIndex + highIndex) / 2;


        while (list[middleIndex] != searchValue) {
            
            if (searchValue > list[middleIndex]) {
                lowIndex = middleIndex;
                middleIndex = (lowIndex + highIndex) / 2;
                System.out.println("higher");
            } else if (searchValue < list[middleIndex]) {
                highIndex = middleIndex;
                middleIndex = (lowIndex + highIndex) / 2;
                System.out.println("Lower");
            } else if (list[middleIndex] == searchValue) {
                break;
            }
        }
        System.out.println("Value at Index: " + middleIndex);
    }
}