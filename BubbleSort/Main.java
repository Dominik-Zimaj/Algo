package BubbleSort;

public class Main {

    static int[] list = {64,56,7655,21,4,8,1,3,744,3333,52};
    public static void main(String[] args) {
        
        System.out.println("Sorted: ");    
        printArray();

        for(int i = list.length -1; i>0; i--) {
                
            for (int j=0; j<i; j++) {
                    switchElements(j, j+1);
            }
            printArray();
        }
        
        System.out.println("Sorted: ");    
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        
    }

    private static void switchElements(int indexA, int indexB) {
        
        if (list[indexA] < list[indexB]) {
            int help = list[indexA];
            list[indexA] = list[indexB];
            list[indexB] = help;
        }
    }

    private static void printArray() {   
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}