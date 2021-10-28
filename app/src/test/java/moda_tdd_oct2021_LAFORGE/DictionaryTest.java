package moda_tdd_oct2021_LAFORGE;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DictionaryTest {
    @Test
    public void testDictionaryName(Dictionary dict) {
        assertThat(dict.getName(), equalTo("Example"));
    }
}
