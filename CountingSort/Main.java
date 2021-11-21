package CountingSort;

public class Main {

    static int[] list = {4,6,5,21,4,4,4,3,4,2,10};
    public static void main(String[] args) {
        //find max
        int max = 0;
        for (int i : list) {
            if (i>max) {
                max = i;
            }
        }
        
        //make helper array with size of found max
        int[] helpa = new int[max+1];
        for (int i : helpa) {
            helpa[i] = 0;
        }

        //find amount of each number and write into helper array
        for (int i=0; i<list.length; i++) {
            helpa[list[i]]++;
        }

        for (int i = 1; i<max+1; i++) {
            helpa[i] = helpa[i] + helpa[i-1];
        }

        //write into original array
        int j=0;
        for (int i = 0; i<max+1; i++) {
            while(j < helpa[i]) {
                list[j++] = i;
            }
        }

        for (int i : list)
        System.out.println(i);
    }
}