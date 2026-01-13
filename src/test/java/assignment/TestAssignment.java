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
import java.util.Collections;
import java.util.List;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Assignment Oppgave #2")
    @Order(1)
    @Test()
    public void oppgave02() {
        // Code that tests the assignment goes here
        testClass("assignment.MyFirstBook", () -> {
            testClass("assignment.MyFirstBook", () -> {
                provideHintIfAssertionFails(
                       "Finner ikke alle feltene. Har du skrevet og deklarert dem riktig?"
                        ,
                        () -> {
                            assertTrue(fieldExists("title"));
                            assertTrue(fieldExists("author"));
                            assertTrue(fieldExists("numberOfPages"));
                        }
                );

        });
    });
    }

    @DisplayName("Assignment Oppgave #3")
    @Order(1)
    @Test()
    public void oppgave03() {
        // Code that tests the assignment goes here
        testClass("assignment.MyFirstBook", () -> {

            var title = "Dune";
            var author = "Frank Herbert";
            int numberOfPages = 896;
            var book = classCreateInstance(title,author,numberOfPages);

            // TODO test constructed object



        });
    }
    @DisplayName("Assignment Oppgave #4")
    @Order(1)
    @Test()
    public void oppgave04() {
        // Code that tests the assignment goes here
        testClass("assignment.MyFirstBook", () -> {

            var title = "Dune";
            var author = "Frank Herbert";
            int numberOfPages = 896;
            var book = classCreateInstance(title,author,numberOfPages);

            classInstanceInvokeMethod(book, "printInfo");
            var bookInfo = "Tittel: " + title + ", Forfatter: " + author + ", Antall sider: " + numberOfPages;
            assertStandardOutputEquals(bookInfo);
        });
    }
    @DisplayName("Assignment Oppgave #6")
    @Order(1)
    @Test()
    public void oppgave06() {
        // Code that tests the assignment goes here
        // TODO: hvordan tester at feld er private..
        testField("assignment","Book","title", () -> {


            assertTrue(fieldIsPrivate());
            assertTrue(fieldIsPublic());
        });

        testClass("assignment.Book", () -> {

            var title = "Dune";
            var author = "Frank Herbert";
            int numberOfPages = 896;
            var books = classCreateInstance(title,author,numberOfPages);


            testField(title, () -> {

                assertTrue(fieldIsPrivate());
            });
            testField("author", () -> {
                assertTrue(fieldIsPrivate());
            });
            testField("numberOfPages", () -> {
                assertTrue(fieldIsPrivate());
            });

            assertTrue(methodExists("getTitle"));
            assertTrue(methodExists("getAuthor"));
            assertTrue(methodExists("getNumberOfPages"));

            
            assertTrue(methodExists("setTitle", String.class));
            assertTrue(methodExists("setNumberOfPages", int.class));
            assertTrue(methodExists("setAuthor", String.class));

        });

        testClassMethod("assignment","Book", "getTitle", () -> {
            assertFalse(methodIsStatic());

            assertTrue(methodHasModifiers(AccessFlag.PUBLIC));

            assertTrue(methodReturns(String.class));
        });

        testClassMethod("assignment","Book", "getAuthor", () -> {
            assertFalse(methodIsStatic());

            assertTrue(methodHasModifiers(AccessFlag.PUBLIC));

            assertTrue(methodReturns(String.class));
        });

        testClassMethod("assignment","Book", "getNumberOfPages", () -> {
            assertFalse(methodIsStatic());

            assertTrue(methodHasModifiers(AccessFlag.PUBLIC));

            assertTrue(methodReturns(int.class));
        });
    }
    @DisplayName("Assignment Oppgave #7")
    @Order(1)
    @Test()
    public void oppgave07() {
        // Code that tests the assignment goes here
        testClass("assignment.Genre", () -> {
            assertTrue(fieldExists("CRIME"));
            assertTrue(fieldExists("ACTION"));
            assertTrue(fieldExists("FANTASY"));
            assertTrue(fieldExists("CLASSIC"));
            assertTrue(fieldExists("OTHER"));

        });

    }
    @DisplayName("Assignment Oppgave #8")
    @Order(1)
    @Test()
    public void oppgave08() {
        // Code that tests the assignment goes here
        testClass("assignment.Book", () -> {

            assertTrue(methodExists("getGenre"));
            
            //assertTrue(methodExists("setGenre", Genre.class));
            //TODO: finner ut hvordan teste private felt
            testField("Genres", () -> {
                assertTrue(fieldIsPrivate());
            });
        });
    }
}
