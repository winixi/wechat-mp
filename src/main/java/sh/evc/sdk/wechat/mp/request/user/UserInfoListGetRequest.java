package sh.evc.sdk.wechat.mp.request.user;

import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.domain.user.UserOpenId;
import sh.evc.sdk.wechat.mp.request.ApiRequest;
import sh.evc.sdk.wechat.mp.response.user.UserInfoListGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户列表
 *
 * @author winixi
 * @date 2021/2/17 12:29 PM
 */
public class UserInfoListGetRequest extends ApiRequest<UserInfoListGetResponse> {

  /**
   * 访问令牌
   */
  private String accessToken;

  /**
   * 用户openid列表
   */
  private List<UserOpenId> userOpenIdList;

  /**
   * 构造
   *
   * @param accessToken
   * @param userOpenIdList
   */
  public UserInfoListGetRequest(String accessToken, List<UserOpenId> userOpenIdList) {
    this.accessToken = accessToken;
    this.userOpenIdList = userOpenIdList;
  }

  @Override
  public ParamsMap getEntityParams() {
    ParamsMap params = new ParamsMap();
    params.add("user_list", userOpenIdList);
    return params;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("access_token", accessToken);
    return params;
  }

  @Override
  public String getUri() {
    return "/cgi-bin/user/info/batchget";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.POST;
  }

  @Override
  public Class<UserInfoListGetResponse> getResponseClass() {
    return UserInfoListGetResponse.class;
  }
}
