package sh.evc.sdk.wechat.mp.dict;

/**
 * 授权返回
 *
 * @author winixi
 * @date 2021/2/19 10:04 AM
 */
public enum AuthResponse {

  /**
   * 代码
   */
  CODE("code");

  private String value;

  AuthResponse(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
