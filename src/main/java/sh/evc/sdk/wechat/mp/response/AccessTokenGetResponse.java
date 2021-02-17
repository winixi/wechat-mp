package sh.evc.sdk.wechat.mp.response;

/**
 * token
 *
 * @author winixi
 * @date 2021/2/16 1:44 PM
 */
public class AccessTokenGetResponse extends JsonResponse {

  /**
   * 访问令牌
   */
  private String accessToken;

  /**
   * 过期时间秒
   */
  private Integer expiresIn;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  @Override
  public String toString() {
    return "TokenGetResponse{" +
            "accessToken='" + accessToken + '\'' +
            ", expiresIn=" + expiresIn +
            "} " + super.toString();
  }
}
