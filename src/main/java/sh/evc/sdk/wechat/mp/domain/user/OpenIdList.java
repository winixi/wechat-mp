package sh.evc.sdk.wechat.mp.domain.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * OpenId列表.
 *
 * @author winixi
 */
public class OpenIdList {

  /**
   * openid数组
   */
  @JsonProperty("openid")
  private List<String> openId;

  public List<String> getOpenId() {
    return openId;
  }

  public void setOpenId(List<String> openId) {
    this.openId = openId;
  }

  @Override
  public String toString() {
    return "OpenIdList{" +
            "openId=" + openId +
            '}';
  }
}
