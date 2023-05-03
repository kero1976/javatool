package downloader;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @BeforeEach
    void setup() {
        System.out.println("前処理");
    }

    @AfterEach
    void clean() {
        System.out.println("後処理");
    }

    @Test
    void testAdd() {
        Sample1 sample = new Sample1();
        int result = sample.add(1, 2);
        assertEquals(result, 3);

    }
}
