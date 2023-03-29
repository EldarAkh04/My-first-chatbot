import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse Input.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class InputReader
{
    private Scanner inputtext;
    private ArrayList<String> punctionMark;

    public InputReader()
    {
        inputtext = new Scanner(System.in);
        punctionMark = new ArrayList<>();
    }

    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = inputtext.nextLine().trim().toLowerCase();

        String[] wordArray = inputLine.split(" "); //split at spaces

        // add words from array into hashset
        HashSet<String> words = new HashSet<>();
        for(String word: wordArray){
            words.add(word);
        }
        return words;
    }

}
