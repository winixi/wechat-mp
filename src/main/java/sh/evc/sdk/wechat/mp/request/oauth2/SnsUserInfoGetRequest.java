package sh.evc.sdk.wechat.mp.request.oauth2;

import sh.evc.sdk.wechat.mp.dict.Lang;
import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.request.ApiRequest;
import sh.evc.sdk.wechat.mp.response.user.UserInfoGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 用授权的方式获取用户信息
 *
 * @author winixi
 * @date 2021/2/19 10:43 AM
 */
public class SnsUserInfoGetRequest extends ApiRequest<UserInfoGetResponse> {

  /**
   * 页面授权令牌
   */
  private String accessToken;

  /**
   * 唯一id
   */
  private String openId;

  /**
   * 语言
   */
  private Lang lang = Lang.zh_CN;

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("access_token", accessToken);
    params.put("openid", openId);
    params.put("lang", lang.name());
    return params;
  }

  @Override
  public String getUri() {
    return "/sns/getUserInfo";
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
