package WebCrawler.src;
//Also finds Emails!
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

    public static void main(String[] args) {
        // Scanner to get user input
        Scanner input = new Scanner(System.in);
        // Prompt user to enter a URL
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        input.close();
        // Start crawling to the given URL
        crawler(url);
    }

    // Method to perform web crawling
    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        // Add starting URL to the list of pending URLs
        listOfPendingURLs.add(startingURL);

        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);

            // If the URL has not been traversed, we are going to add it to the list of traversed URLs
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl " + urlString);

                // Get all sub URLs and emails from the current URL
                ArrayList<String> subURLs = getSubURLs(urlString);

                for (String s : subURLs) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }
    }

    // Method to get all sub URLs and emails from the given URL
    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            input.close();
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("https:", current);

                // Find and add all URLs in the line
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("https:", endIndex);
                    } else {
                        current = -1;
                    }
                }

                // Find and add all emails in the line
                emails.addAll(getEmails(line));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        // Print out the emails found on the page
        if (!emails.isEmpty()) {
            System.out.println("Emails found on " + urlString + ":");
            for (String email : emails) {
                System.out.println(email);
            }
        }

        // Return the list of sub URLs
        return list;
  
    }

    // Method to find emails in a given string
    public static ArrayList<String> getEmails(String text) {
        ArrayList<String> emails = new ArrayList<>();
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }
}
