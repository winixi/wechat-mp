package sh.evc.sdk.wechat.mp.request;

import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.response.TokenGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.Map;

/**
 * token get
 *
 * @author winixi
 * @date 2021/2/16 1:44 PM
 */
public class TokenGetRequest extends ApiRequest<TokenGetResponse> {

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
  public Class<TokenGetResponse> getResponseClass() {
    return null;
  }
}
