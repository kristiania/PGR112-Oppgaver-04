package solution;

import java.util.ArrayList;

public class Program
{
    public void runProgram() {
        IO.println("Programmet starter ...");

        ArrayList<Word> words = new ArrayList<>();

        Word happy = new Word("happy");
        happy.addSynonym("joyful");

        Word smart = new Word("smart");
        smart.addSynonym("intelligent");
        smart.addSynonym("wise");

        words.add(happy);
        words.add(smart);

        for (Word word : words) {
            IO.println("Word:");
            IO.println("- " + word.getWord());

            IO.println("Synonyms:");
            for (String synonym : word.getSynonyms()) {
                IO.println("- " + synonym);
            }
        }
    }
}
