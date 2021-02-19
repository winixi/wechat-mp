package sh.evc.sdk.wechat.mp.request;

import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.dict.TicketType;
import sh.evc.sdk.wechat.mp.response.TicketGetResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 页面ticket，用于jssdk
 *
 * @author winixi
 * @date 2021/2/16 1:43 PM
 */
public class TicketGetRequest extends ApiRequest<TicketGetResponse> {

  /**
   * 临时票据类型
   */
  private TicketType ticketType;

  /**
   * 访问令牌
   */
  private String accessToken;

  /**
   * 构造
   *
   * @param ticketType
   * @param accessToken
   */
  public TicketGetRequest(TicketType ticketType, String accessToken) {
    this.ticketType = ticketType;
    this.accessToken = accessToken;
  }

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("access_token", accessToken);
    params.put("type", ticketType.getValue());
    return params;
  }

  @Override
  public String getUri() {
    return "/cgi-bin/ticket/getticket";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.GET;
  }

  @Override
  public Class<TicketGetResponse> getResponseClass() {
    return TicketGetResponse.class;
  }
}
