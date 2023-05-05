package downloader;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gargoylesoftware.htmlunit.WebClient;

public class WebDownloadTest {

    @Mock
    WebClient webClient;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetXml() {
    	
        WebDownload sts = new WebDownload(webClient);
        String result = sts.getXml("a");
        assertThat(result).isEqualTo("AAA");
    }
}
