package Binary.src;

public class Binary implements Sorting {
    public void sort(int[] array) {
        if (array == null || array.length < 2) {
            return; //array is already sorted or invalid
        }

        //Iterate through starting at element 1
        for (int i = 1; i < array.length; i++) {
            //Store the current element to be inserted
            int current = array[i];
            int left = 0;
            int right = i;

            //Binary search to find the correct position
            while (left < right) {
                int mid = (left + right) / 2;
                if (current >= array[mid]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            //Shift elements to the right to make space for the current element
            System.arraycopy(array, left, array, left + 1, i - left);

            //Insert the current element at the correct position
            array[left] = current;
        }
    }
}

