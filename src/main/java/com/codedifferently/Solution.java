// Declares the package where this class belongs
package com.codedifferently;

// Import necessary classes from Java's utility package
import java.util.ArrayList;  // for dynamic arrays/lists
import java.util.HashMap;    // for key-value mapping
import java.util.List;       // for list interface
import java.util.Map;        // for map interface

// Defines a public class named "Solution"
public class Solution {

    // Public method that returns an int and takes in a char (for the starting letter) and a string array (for the list of words)
    public int countWordsThatStartWithLetter(char letter, String[] words){

        // Checks if the provided word array is null; if so, returns 0 as there are no words to check
        if(words == null)
            return 0;

        // Initializes a map where the key is a character (representing the starting letter)
        // and the value is a list of strings (words that start with that letter)
        Map<Character, List<String>> sortedWords = new HashMap<>();

        // Iterates through each word in the provided word array
        for(String word:words){

            // Retrieves the first letter of the current word
            char firstLetter = word.charAt(0);

            // Checks if the map already contains this starting letter
            if(sortedWords.containsKey(firstLetter)){

                // If the starting letter exists in the map, we retrieve the current list of words for that letter
                List<String> currentBox = sortedWords.get(firstLetter);

                // We then add the current word to that list
                currentBox.add(word);

                // After adding, we update the map with the modified list for that starting letter
                sortedWords.put(firstLetter, currentBox);

            }else {

                // If the starting letter doesn't exist in the map, we create a new list
                List<String> brandNewBox = new ArrayList<>();

                // We then add the current word to that new list
                brandNewBox.add(word);

                // Now, we add the new starting letter and its corresponding list to the map
                sortedWords.put(firstLetter, brandNewBox);
            }
        }

        // After organizing the words, we retrieve the list of words that start with the given letter
        List<String> countedWords= sortedWords.get(letter);

        // If we found words that start with the given letter, we return the size (or count) of that list.
        // If no words are found, we return 0.
        return (countedWords != null)? countedWords.size(): 0;
    }
}
