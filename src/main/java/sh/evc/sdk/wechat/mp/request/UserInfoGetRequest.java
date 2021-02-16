package sh.evc.sdk.wechat.mp.request;

import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.response.UserInfoGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.Map;

/**
 * 用户信息
 *
 * @author winixi
 * @date 2021/2/16 1:54 PM
 */
public class UserInfoGetRequest extends ApiRequest<UserInfoGetResponse> {

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
    return null;
  }

  @Override
  public RequestMethod getMethod() {
    return null;
  }

  @Override
  public Class<UserInfoGetResponse> getResponseClass() {
    return null;
  }
}
