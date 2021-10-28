package moda_tdd_oct2021_LAFORGE;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DictionaryTest {

    @Before
    public void initialize () {
        Dictionary dict = new Dictionary("Example");
    }
    Dictionary dict = new Dictionary("Example");
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
        dict.addTranslation("contre", "against");
        dict.addTranslation("pour","for");
        dict.addTranslation("pour","non");
        assertThat(dict.getTranslation("contre"), containsInAnyOrder("against"));
        assertThat(dict.getTranslation("pour"), containsInAnyOrder("for", "non"));
        assertThat(dict.translationInverse("for"), equalTo("pour"));
        assertThat(dict.translationInverse("non"), equalTo("pour"));
    }
}
