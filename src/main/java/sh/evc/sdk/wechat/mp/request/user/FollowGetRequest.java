package sh.evc.sdk.wechat.mp.request.user;

import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.request.ApiRequest;
import sh.evc.sdk.wechat.mp.response.user.FollowGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 关注用户列表
 *
 * @author winixi
 * @date 2021/2/17 12:33 PM
 */
public class FollowGetRequest extends ApiRequest<FollowGetResponse> {

  /**
   * 访问令牌
   */
  private String accessToken;

  /**
   * 下一个openId
   */
  private String nextOpenId;

  /**
   * 构造
   *
   * @param accessToken
   * @param nextOpenId
   */
  public FollowGetRequest(String accessToken, String nextOpenId) {
    this.accessToken = accessToken;
    this.nextOpenId = nextOpenId;
  }

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("access_token", accessToken);
    params.put("next_openid", nextOpenId);
    return params;
  }

  @Override
  public String getUri() {
    return "/cgi-bin/user/get";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.GET;
  }

  @Override
  public Class<FollowGetResponse> getResponseClass() {
    return FollowGetResponse.class;
  }
}
