package sh.evc.sdk.wechat.mp.request.user;

import sh.evc.sdk.wechat.mp.dict.Lang;
import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.request.ApiRequest;
import sh.evc.sdk.wechat.mp.response.user.UserInfoGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户信息
 *
 * @author winixi
 * @date 2021/2/16 1:54 PM
 */
public class UserInfoGetRequest extends ApiRequest<UserInfoGetResponse> {

  /**
   * 唯一id
   */
  private String openId;

  /**
   * 访问令牌
   */
  private String accessToken;

  /**
   * 语言
   */
  private Lang lang = Lang.zh_CN;

  /**
   * 构造
   *
   * @param openId
   * @param accessToken
   */
  public UserInfoGetRequest(String openId, String accessToken) {
    this.openId = openId;
    this.accessToken = accessToken;
  }

  public void setLang(Lang lang) {
    this.lang = lang;
  }

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("access_token", accessToken);
    params.put("openid", openId);
    params.put("lang", lang.getName());
    return params;
  }

  @Override
  public String getUri() {
    return "/cgi-bin/user/info";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.GET;
  }

  @Override
  public Class<UserInfoGetResponse> getResponseClass() {
    return UserInfoGetResponse.class;
  }
}
