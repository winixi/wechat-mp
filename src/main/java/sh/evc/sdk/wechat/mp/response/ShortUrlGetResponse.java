package sh.evc.sdk.wechat.mp.response;

/**
 * 短链接
 *
 * @author winixi
 * @date 2021/2/16 1:55 PM
 */
public class ShortUrlGetResponse extends JsonResponse {

  /**
   * 短地址
   */
  private String shortUrl;

  public String getShortUrl() {
    return shortUrl;
  }

  public void setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
  }

  @Override
  public String toString() {
    return "ShortUrlGetResponse{" +
            "shortUrl='" + shortUrl + '\'' +
            "} " + super.toString();
  }
}
