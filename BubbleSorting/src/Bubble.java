package BubbleSorting.src;

//Bubble Sorting
public class Bubble {

    int[] data = {5, 2, 3, 8, 1};

    public int[] sort(int[] data) {
        int len = data.length; // size of array

        for (int pass = 1; pass < len; pass++) {
            System.out.println("Pass = " + pass);
            boolean swapped = false; // flag to detect any swap

            for (int compares = 0; compares < len - pass; compares++) {
                System.out.println(compares);
                if (data[compares] > data[compares + 1]) {
                    // Swap
                    int temp = data[compares];
                    data[compares] = data[compares + 1];
                    data[compares + 1] = temp;
                    swapped = true; // set flag to true since we made a swap
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }

        return data;
    }

    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        int[] sortedData = bubble.sort(bubble.data);
        for (int num : sortedData) {
            System.out.print(num + " ");
        }
    }
}
