package sh.evc.sdk.wechat.mp.request.oauth2;

import sh.evc.sdk.wechat.mp.dict.GrantType;
import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.request.ApiRequest;
import sh.evc.sdk.wechat.mp.response.oauth2.SnsTokenGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 授权获取
 *
 * @author winixi
 * @date 2021/2/19 10:37 AM
 */
public class SnsTokenGetRequest extends ApiRequest<SnsTokenGetResponse> {

  /**
   * 公众号appId
   */
  private String appId;

  /**
   * 公众号secret
   */
  private String secret;

  /**
   * oauth2跳转获取的code
   */
  private String code;

  /**
   * 授权范围
   */
  private GrantType grantType = GrantType.AUTHORIZATION_CODE;

  /**
   * 构造
   *
   * @param appId
   * @param secret
   * @param code
   */
  public SnsTokenGetRequest(String appId, String secret, String code) {
    this.appId = appId;
    this.secret = secret;
    this.code = code;
  }

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("appid", appId);
    params.put("secret", secret);
    params.put("grant_type", grantType.getValue());
    return params;
  }

  @Override
  public String getUri() {
    return "/sns/oauth2/access_token";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.GET;
  }

  @Override
  public Class<SnsTokenGetResponse> getResponseClass() {
    return SnsTokenGetResponse.class;
  }
}
