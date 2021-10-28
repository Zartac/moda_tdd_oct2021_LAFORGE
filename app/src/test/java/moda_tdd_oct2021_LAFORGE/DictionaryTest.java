package moda_tdd_oct2021_LAFORGE;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DictionaryTest {
    Dictionary dict = new Dictionary("Example");
    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }
}
