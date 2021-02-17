package sh.evc.sdk.wechat.mp.domain.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import sh.evc.sdk.wechat.mp.dict.Lang;

/**
 * 用户openid
 *
 * @author winixi
 * @date 2021/2/17 1:46 PM
 */
public class UserOpenId {

  /**
   * openid
   */
  @JsonProperty("openid")
  private String openId;

  /**
   * 语言
   */
  private Lang lang;

  public UserOpenId(String openId, Lang lang) {
    this.openId = openId;
    this.lang = lang;
  }

  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public Lang getLang() {
    return lang;
  }

  public void setLang(Lang lang) {
    this.lang = lang;
  }

  @Override
  public String toString() {
    return "UserOpenId{" +
            "openId='" + openId + '\'' +
            ", lang=" + lang +
            '}';
  }
}
