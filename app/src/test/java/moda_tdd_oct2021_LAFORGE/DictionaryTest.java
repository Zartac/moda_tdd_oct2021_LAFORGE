package moda_tdd_oct2021_LAFORGE;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DictionaryTest {

    Dictionary dict;

    @BeforeEach
    public void initialize () {
        dict = new Dictionary("Example");
        dict.addTranslation("contre", "against");
        dict.addTranslation("pour","for");
        dict.addTranslation("pour","non");
    }
    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }
    @Test
    public void testDictionaryNotEmpty(){
        assertThat(dict.isEmpty(), equalTo(false));
    }
    @Test
    public void testOneTranslation() {
        assertThat(dict.getTranslation("contre"), containsInAnyOrder("against"));
    }
    @Test
    public void testMultipleTransalation(){
        assertThat(dict.getTranslation("pour"), containsInAnyOrder("for", "non"));
    }
    @Test
    public void testTranslationInverse(){
        assertThat(dict.translationInverse("for"), equalTo("pour"));
        assertThat(dict.translationInverse("non"), equalTo("pour"));
    }
    @AfterAll
    static void vider(){
        System.gc();
    }
}
