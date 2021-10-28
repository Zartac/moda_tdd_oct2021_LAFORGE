package moda_tdd_oct2021_LAFORGE;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DictionaryTest {
    Dictionary dict = new Dictionary("Example");
    Dictionary waiter = new Dictionary();
    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }
    @Test
    public void testDictionaryNotEmpty(){
        assertThat(dict.isEmpty(), equalTo(false));
    }
    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        dict.addTranslation("pour","for");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
        assertThat(dict.getTranslation("pour"), not(equalTo("against")));
    }
}
