package downloader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gargoylesoftware.htmlunit.WebClient;

public class WebDownloadTest {

    @Mock
    WebClient webClient;

    @BeforeEach
    private void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetXml() {
        WebDownload sts = new WebDownload(webClient);
        sts.getXml("a");
    }
}
