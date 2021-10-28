package moda_tdd_oct2021_LAFORGE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class LineReader implements ILineReader {
    private BufferedReader reader;
    public LineReader(Reader in) {
        reader = new BufferedReader(in);
    }
    @Override
    public String readline() throws IOException {
        return reader.readLine();
    }
}
