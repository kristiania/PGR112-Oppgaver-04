package assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;
import assignment.testing.framework.BaseAssignment;

import static org.junit.jupiter.api.Assertions.*;
import static assignment.testing.framework.Utilities.*;

import java.lang.reflect.AccessFlag;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Assignment Oppgave #1")
    @Order(1)
    @Test()
    public void oppgave01() {
        // Code that tests the assignment goes here
        testClass("assignment.Program", () -> {


            var program = classCreateInstance();

            classInstanceInvokeMethod(program, "runProgram");
            var progInfo = "Programmet starter ...";
            assertStandardOutputEquals(progInfo, progInfo.length());
        });
    }

    @DisplayName("Assignment Oppgave #2")
    @Order(1)
    @Test()
    public void oppgave02() {
         Computer.main();
        var progInfo = "Programmet starter ...";
         assertStandardOutputEquals(progInfo, progInfo.length());
    }


    @DisplayName("Assignment Oppgave #3.2 til 3.4")
    @Order(1)
    @Test()
    public void oppgave03() {

        Terminal ter = new Terminal();
        ArrayList<String> options = new ArrayList<>();
        ter.setOptions(options);
        ter.addOption("This");
        ter.addOption("is");
        ter.addOption("my");
        ter.addOption("first");
        ter.addOption("test");

        //TODO: test display
        ArrayList<String> testList = new ArrayList<>(Arrays.asList("This", "is", "my", "first", "test"));
        assertArrayEquals(testList.toArray(), ter.getOptions().toArray());

        ter.clearOptions();
        testList = new ArrayList<>();
        assertArrayEquals(testList.toArray(), ter.getOptions().toArray());


    }

    @DisplayName("Assignment Oppgave #4.2-")
    @Order(1)
    @Test()
    public void oppgave04() {
           String myWord = "nerd";
           Word word = new Word(myWord);
           assertEquals(myWord, word.getWord());
           word.addSynonym("cool");
           word.addSynonym("digg");
           word.addSynonym("algorithminator");
           ArrayList<String> testWord = new ArrayList<>(Arrays.asList("cool", "digg", "algorithminator"));
           assertArrayEquals(testWord.toArray(), word.getSynonyms().toArray());

    }

    @DisplayName("Assignment Oppgave #5")
    @Order(1)
    @Test()
    public void oppgave05() {
        //omit for now

    }

}
