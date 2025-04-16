package Lesson_8;

import java.util.*;

public class WordCounter {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "apple", "orange", "kiwi", "apple", "pear", "banana", "orange", "apple"};

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.print("\nUnique words: ");
        System.out.println(wordCounts.keySet());

        PhoneDirectory phoneBook = new PhoneDirectory();
        phoneBook.add("Smith", "123-456-7890");
        phoneBook.add("Jones", "987-654-3210");
        phoneBook.add("Smith", "555-1212");
        phoneBook.add("Doe", "111-222-3333");

        System.out.println("\nPhone numbers for Smith:");
        List<String> smithNumbers = phoneBook.get("Smith");
        if (smithNumbers != null) {
            for (String number : smithNumbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("Not found.");
        }

        System.out.println("\nPhone numbers for Doe:");
        List<String> doeNumbers = phoneBook.get("Doe");
        if (doeNumbers != null) {
            for (String number : doeNumbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("Not found.");
        }

        System.out.println("\nPhone numbers for Davis:"); // Testing with a name that doesn't exist
        List<String> davisNumbers = phoneBook.get("Davis");
        if (davisNumbers != null) {
            for (String number : davisNumbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("Not found.");
        }
    }
}

class PhoneDirectory {
    private final Map<String, List<String>> directory;

    public PhoneDirectory() {
        this.directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, null); //return null instead of an empty list
    }
}
