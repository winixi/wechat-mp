package sh.evc.sdk.wechat.mp.request;

import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.response.ShortUrlGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.Map;

/**
 * 短链接
 *
 * @author winixi
 * @date 2021/2/16 1:55 PM
 */
public class ShortUrlGetRequest extends ApiRequest<ShortUrlGetResponse> {

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
  public Class<ShortUrlGetResponse> getResponseClass() {
    return null;
  }
}
