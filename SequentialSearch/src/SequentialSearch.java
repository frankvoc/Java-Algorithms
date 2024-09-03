public class SequentialSearch {
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
    public static void main(String[] args) {
        SequentialSearch search = new SequentialSearch();
        int rowItWasFound = search.sequential("K9");
        if (rowItWasFound != -1) {
            System.out.println(search.displayRecords(rowItWasFound));
        } else {
            System.out.println("Record not found.");
        }
    }
}
