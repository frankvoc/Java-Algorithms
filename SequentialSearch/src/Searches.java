public class Searches {
    String[][] data = {
        {"K0", "Abby Linc", "18", "al@ch.org"},
        {"K1", "John Doe", "23", "jd@abc.org"},
        {"K2", "Janet Bosco", "39", "jd@ids.com"},
        {"K3", "Charles RIver", "64", "cr@neit.edi"},
        {"K4", "Barak Obama", "50", "bd@ch.org"},
        {"K5", "Sarah Palin", "44", "sp@ch.org"},
        {"K6", "John McCain", "72", "k6@ch.org"},
        {"K7", "George Bush", "54", "gb@ch.org"},
        {"K8", "Al Gore", "56", "ag@ch.org"},
        {"K9", "Dick Chaney", "60", "dc@ch.org"},
    };
    public int sequential(String keyToSearch){
        long start, stop, elapsed;
        start = System.nanoTime();
        System.out.println("Searching for: " + keyToSearch + " using sequential search");
        int i;
        for (i=0;i<data.length;i++){
            System.out.println("Read " + i + ", key: " + data[i][0]);
            if (keyToSearch.equalsIgnoreCase(data[i][0])){
                break;
            }
        }
        if (i>=data.length){
            i = -1;
            System.out.println("Key " + keyToSearch + " is not found");
        }else {
            System.out.println("Key " + keyToSearch + " is found at "+ i);
            System.out.println(" after " + (i+1) + " reads.");
        }
        stop = System.nanoTime();
        elapsed = stop - start;
        System.out.println("Elapsed time: "+ elapsed);
        return i;
    }
    public int binary(String keyToSearch) {
        long start, stop, elapsed;
        start = System.nanoTime();
        System.out.println("Searching for " + keyToSearch + " using binary method.");
        int len = data.length;
        int left = 0;
        int right = len - 1;
        int tries = 0;
        int foundAtIndex = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Read " + mid + ", key= " + data[mid][0]);
            tries++;
            
            if (keyToSearch.equalsIgnoreCase(data[mid][0])) {
                foundAtIndex = mid;
                break;
            } else if (keyToSearch.compareToIgnoreCase(data[mid][0]) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (foundAtIndex == -1) {
            System.out.println("Key " + keyToSearch + " is not found.");
        } else {
            System.out.println("Key " + keyToSearch + " is found at index " + foundAtIndex);
            System.out.println(" after " + tries + " reads.");
        }
        
        stop = System.nanoTime();
        elapsed = stop - start;
        System.out.println("Elapsed time: " + elapsed + " nano seconds");
        
        return foundAtIndex;
    }
    public int hashRoutine(String keyToSearch){
        long start, stop, elapsed;
        start = System.nanoTime();
        int len = keyToSearch.length();
        int sum = 0;
        for (int i = 0; i<len;i++){
            int decVal = keyToSearch.charAt(i);
            sum = sum + decVal;
        }
        stop = System.nanoTime();
        elapsed = stop - start;
        System.out.println("Elapsed time: "+ elapsed);
        return sum;
    }
    String[][] datahashed = new String[150][4];

    public int hash(String keyToSearch){
        int readCount = 0;
        System.out.println("Searching for "+ keyToSearch + " using hash");
        int foundAtIndex = hashRoutine(keyToSearch);
        for (int i = 0; i < datahashed.length; i++) {
            readCount++;
        }
        System.out.println("Key: " + keyToSearch + " is found at index" + foundAtIndex);
        System.out.println(" after " + readCount + " reads");
        return foundAtIndex;
    }
    public String displayRecords(int index){
        return "Record: " 
            + data[index][0]
            + ", "
            + data[index][1]
            +", "
            +data[index][2]
            +", "
            +data[index][3];
    }
    public String displayHashedRecords(int index){
        return "Record: " 
        + datahashed[index][0]
        + ", "
        + datahashed[index][1]
        +", "
        +datahashed[index][2]
        +", "
        +datahashed[index][3];
    }
    public static void main(String[] args) {
        Searches search = new Searches();
        for(int i=0;i<search.data.length; i++){
            int generatedHashIndex = search.hashRoutine(search.data[i][0]);
            search.datahashed[generatedHashIndex][0] = search.data[i][0];
            search.datahashed[generatedHashIndex][1] = search.data[i][1];
            search.datahashed[generatedHashIndex][2] = search.data[i][2];
            search.datahashed[generatedHashIndex][3] = search.data[i][3];
        }
        int rowItWasFound = search.hash("K9");
        if (rowItWasFound != -1) {
            System.out.println(search.displayHashedRecords(rowItWasFound));
        } else {
            System.out.println("Record not found.");
        }
    }
}
