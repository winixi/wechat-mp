package sh.evc.sdk.wechat.mp.request;

import sh.evc.sdk.wechat.mp.dict.CustomerSendMsgType;
import sh.evc.sdk.wechat.mp.dict.RequestMethod;
import sh.evc.sdk.wechat.mp.domain.customer.Image;
import sh.evc.sdk.wechat.mp.domain.customer.Link;
import sh.evc.sdk.wechat.mp.domain.customer.MiniProgramPage;
import sh.evc.sdk.wechat.mp.domain.customer.Text;
import sh.evc.sdk.wechat.mp.response.CustomerMsgSendResponse;
import sh.evc.sdk.wechat.mp.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 客服消息发送
 *
 * @author winixi
 * @date 2021/2/10 5:55 PM
 */
public class CustomerMsgSendRequest extends ApiRequest<CustomerMsgSendResponse> {

  /**
   * 接口调用凭证
   */
  private String accessToken;

  /**
   * 用户的 OpenID
   */
  private String toUser;

  /**
   * 消息类型
   */
  private CustomerSendMsgType msgType;

  /**
   * 文本消息，msgtype="text" 时必填
   */
  private Text text;

  /**
   * 图文链接，msgtype="link" 时必填
   */
  private Link link;

  /**
   * 图片消息，msgtype="image" 时必填
   */
  private Image image;

  /**
   * 小程序卡片，msgtype="miniprogrampage" 时必填
   */
  private MiniProgramPage miniProgramPage;

  /**
   * text
   *
   * @param accessToken
   * @param toUser
   * @param text
   */
  public CustomerMsgSendRequest(String accessToken, String toUser, Text text) {
    this.msgType = CustomerSendMsgType.TEXT;
    this.accessToken = accessToken;
    this.toUser = toUser;
    this.text = text;
  }

  /**
   * link
   *
   * @param accessToken
   * @param toUser
   * @param link
   */
  public CustomerMsgSendRequest(String accessToken, String toUser, Link link) {
    this.msgType = CustomerSendMsgType.LINK;
    this.accessToken = accessToken;
    this.toUser = toUser;
    this.link = link;
  }

  /**
   * image
   *
   * @param accessToken
   * @param toUser
   * @param image
   */
  public CustomerMsgSendRequest(String accessToken, String toUser, Image image) {
    this.msgType = CustomerSendMsgType.IMAGE;
    this.accessToken = accessToken;
    this.toUser = toUser;
    this.image = image;
  }

  /**
   * miniProgramPage
   *
   * @param accessToken
   * @param toUser
   * @param miniProgramPage
   */
  public CustomerMsgSendRequest(String accessToken, String toUser, MiniProgramPage miniProgramPage) {
    this.msgType = CustomerSendMsgType.MINI_APP_PAGE;
    this.accessToken = accessToken;
    this.toUser = toUser;
    this.miniProgramPage = miniProgramPage;
  }

  @Override
  public ParamsMap getEntityParams() {
    ParamsMap params = new ParamsMap();
    params.add("touser", toUser);
    params.add("msgtype", msgType.getValue());
    params.add("text", text);
    params.add("image", image);
    params.add("link", link);
    params.add("miniprogrampage", miniProgramPage);
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
    return "/cgi-bin/message/custom/send";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.POST;
  }

  @Override
  public Class<CustomerMsgSendResponse> getResponseClass() {
    return CustomerMsgSendResponse.class;
  }
}
