package downloader;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class WebDownload {

    private static Logger log = LoggerFactory.getLogger(WebDownload.class);
    private WebClient webClient;

    public WebDownload(WebClient webClient) {
        this.webClient = webClient;
    }

    /**
     * 指定したURLのXMLデータを取得する.
     * @param url URL
     * @return 指定したURLのデータをXML形式の文字列で返す.S
     */
    public String getXml(String url) {
        log.debug("START:url={}", url);
        try {
            HtmlPage page = webClient.getPage(url);
            String result = page.asXml();
            log.debug("SUCCESS:result_size={}", result.length());
            return result;
        } catch (FailingHttpStatusCodeException | IOException e) {
            log.debug("FAIL:getPage Error.", e);
            log.error("FAIL:getPage Error.");
            return null;
        }
    }
}
