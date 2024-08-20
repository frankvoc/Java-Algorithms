package BubbleSorting.src;

public class BubbleStrings {
    //sort Strings and time how long
    String[] data = {"cat", "Apple", "apple", "George", "NEIT"};

    public String[] sort(String[] data) {
        long start, stop, elapsed;
        start = System.currentTimeMillis();

        //convert all strings to lowercase looping
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].toLowerCase();
        }

        int len = data.length; //size of array

        for (int pass = 1; pass < len; pass++) {
            System.out.println("Pass = " + pass);
            for (int compares = 0; compares < len - pass; compares++) {
                System.out.println(compares);
                if (data[compares].compareTo(data[compares + 1]) > 0) {
                    //Swap
                    String temp = data[compares];
                    data[compares] = data[compares + 1];
                    data[compares + 1] = temp;
                }
            }
        }

        stop = System.currentTimeMillis();
        elapsed = stop - start;
        System.out.println("Elapsed: " + elapsed);

        return data;
    }

    public static void main(String[] args) {
        BubbleStrings bubble = new BubbleStrings();
        String[] sortedData = bubble.sort(bubble.data);
        for (String str : sortedData) {
            System.out.print(str + " ");
        }
    }
}
