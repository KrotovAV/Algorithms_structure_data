public class Piramid_sort_my {

    private static int left(int i) {
        return (2 * i + 1);
    }

    private static int right(int i) {
        return (2 * i + 2);
    }

    private static void change(int[] sortArr, int i, int j) {
        int change = sortArr[i];
        sortArr[i] = sortArr[j];
        sortArr[j] = change;
    }

    private static void piramidify(int[] sortArr, int i, int size) {
        int left = left(i);
        int right = right(i);
        int largest = i;

        if (left < size && sortArr[left] > sortArr[i]) largest = left;
        if (right < size && sortArr[right] > sortArr[largest]) largest = right;

        if (largest != i) {
            change(sortArr, i, largest);
            piramidify(sortArr, largest, size);
        }
    }

    public static int pop(int[] sortArr, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = sortArr[0];
        sortArr[0] = sortArr[size-1];
        piramidify(sortArr, 0, size - 1);
        return top;
    }

    public static void printArr(int[] sortArr) {
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + ",");
        }
        System.out.println();
    }

    public static int[] piramidSort(int[] sortArr) {
        //строим приоритетную очередь и инициализируем ее заданным массивом
        int n = sortArr.length;

        int i = (n - 2) / 2;
        while (i >= 0) {
            piramidify(sortArr, i--, n);
        }

        while (n > 0) {
            sortArr[n - 1] = pop(sortArr, n);
            n--;
        }
        return sortArr;
    }

    public static void main(String args[]) {

        // int[] sortArr = {12, 6, 4, 1, 15, 10};
        // int[] sortArr = {22, 65, 44, 21, 15, 2};
        int[] arr = {2, 9, 12, 5, 7, 3, 1, 8, 4, 6, 10, 11, 13};
        printArr(arr);

        int[] sortArr = piramidSort(arr);

        printArr(sortArr);
    }
}
