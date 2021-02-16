package sh.evc.sdk.wechat.mp.request;

import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.response.TicketGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.Map;

/**
 * ticket get
 *
 * @author winixi
 * @date 2021/2/16 1:43 PM
 */
public class TicketGetRequest extends ApiRequest<TicketGetResponse> {

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
  public Class<TicketGetResponse> getResponseClass() {
    return null;
  }
}
