import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
        //testing
    }
    @Test
    public void tryGettingLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void tryGettingLinks2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://nothing.com", "no-thing.html"), MarkdownParse.getLinks(contents));
    }
    /*@Test
    public void tryGettingLinks3() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("awesome.com", "awe-some.html"), MarkdownParse.getLinks(contents));
    }*/
}
