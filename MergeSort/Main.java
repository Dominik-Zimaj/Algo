package MergeSort;

public class Main {
    public static void main(String[] args) {

        int[] list = {64,56,7655,21,4,8,1,3,744,3333,52};
        printArray(list);

        mergeSort(list);

        printArray(list);
    }

    public static void mergeSort(int[] a) {
        int[] helpa = new int[a.length];
        doMergeSort(a, 0, a.length - 1, helpa);

    }

    public static void doMergeSort(int[] a, int left, int right, int[] helpa) {
        if (right - left > 0) {
            int middle = (left + right) / 2;
            doMergeSort(a, left, middle, helpa);
            doMergeSort(a, middle + 1 , right, helpa);
            mergeParts(a, left, middle, right, helpa);
        }
    }

    public static void mergeParts(int[] a, int left, int middle, int right, int[] helpa) {
        for(int i = left; i <= right; i++) {
            helpa[i] = a[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;
        while (i <= middle && j <= right) {
            if (helpa[i] <= helpa[j]) {
                a[k] = helpa[i];
                i++;
            } else {
                a[k] = helpa[j];
                j++;
            }
            k++;
        } while (i <= middle) {
            a[k] = helpa[i];
            i++;
            k++;
        } while (j <= right) {
            a[k] = helpa[j];
            j++;
            k++;
        } 
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
