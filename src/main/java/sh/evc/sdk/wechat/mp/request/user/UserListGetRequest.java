package sh.evc.sdk.wechat.mp.request.user;

import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.request.ApiRequest;
import sh.evc.sdk.wechat.mp.response.user.UserListGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.Map;

/**
 * 用户列表
 *
 * @author winixi
 * @date 2021/2/17 12:29 PM
 */
public class UserListGetRequest extends ApiRequest<UserListGetResponse> {

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    return null;
  }

  @Override
  public String getUri() {
    return "";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.GET;
  }

  @Override
  public Class<UserListGetResponse> getResponseClass() {
    return UserListGetResponse.class;
  }
}
