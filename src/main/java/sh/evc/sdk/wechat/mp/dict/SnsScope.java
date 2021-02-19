package sh.evc.sdk.wechat.mp.dict;

/**
 * 获取用户数据范围
 *
 * @author winixi
 * @date 2021/2/16 1:47 PM
 */
public enum SnsScope {

  /**
   * 用户详细信息
   */
  USER_INFO("snsapi_userinfo"),

  /**
   * 用户基本信息
   */
  BASE("snsapi_base");

  private String value;

  SnsScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static SnsScope getByValue(String value) {
    for (SnsScope scope : SnsScope.values()) {
      if (scope.getValue().equals(value)) {
        return scope;
      }
    }
    return null;
  }
}
