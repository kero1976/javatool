package downloader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * これはUTF-8です。
 * @author kero
 *
 */
public class Sample1 {

    private static Logger log = LoggerFactory.getLogger(Sample1.class);

    public int add(int a, int b) {
        log.debug("START:a={}, b={}", a, b);
        return a + b;
    }

    public int double2(int a) {
        return a *2;
    }
}
