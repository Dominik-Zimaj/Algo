package CountingSort;

public class Main {

    static int[] list = {4,6,5,21,4,4,4,3,4,2,10};
    public static void main(String[] args) {
        int[] result = countingSort(list, 21);

        for (int i : result)
        System.out.println(i);
    }

    public static int[] countingSort(int[] a, int range) {
        
        //make helper array with size of found max
        int[] helpa = new int[range+1];
        for (int i : helpa) {
            helpa[i] = 0;
        }

        //find amount of each number and write into helper array
        for (int i=0; i<a.length; i++) {
            helpa[list[i]]++;
        }

        for (int i = 1; i<range+1; i++) {
            helpa[i] = helpa[i] + helpa[i-1];
        }

        //write into original array
        int j=0;
        for (int i = 0; i<range+1; i++) {
            while(j < helpa[i]) {
                a[j++] = i;
            }
        }
        
        return a;
    }
}