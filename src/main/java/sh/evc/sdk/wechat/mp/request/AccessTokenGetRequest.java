package sh.evc.sdk.wechat.mp.request;

import sh.evc.sdk.wechat.mp.dict.GrantType;
import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.response.AccessTokenGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * token get
 *
 * @author winixi
 * @date 2021/2/16 1:44 PM
 */
public class AccessTokenGetRequest extends ApiRequest<AccessTokenGetResponse> {

  /**
   * 授权方式
   */
  private GrantType grantType = GrantType.CLIENT_CREDENTIAL;

  /**
   * appId
   */
  private String appId;

  /**
   * secret
   */
  private String secret;

  /**
   * 构造
   *
   * @param appId
   * @param secret
   */
  public AccessTokenGetRequest(String appId, String secret) {
    this.appId = appId;
    this.secret = secret;
  }

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("grant_type", grantType.getValue());
    params.put("appid", appId);
    params.put("secret", secret);
    return params;
  }

  @Override
  public String getUri() {
    return "/cgi-bin/token";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.GET;
  }

  @Override
  public Class<AccessTokenGetResponse> getResponseClass() {
    return AccessTokenGetResponse.class;
  }
}
