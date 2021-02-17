package sh.evc.sdk.wechat.mp;

import org.junit.Test;
import sh.evc.sdk.wechat.mp.dict.TicketType;
import sh.evc.sdk.wechat.mp.request.TicketGetRequest;
import sh.evc.sdk.wechat.mp.request.TokenGetRequest;
import sh.evc.sdk.wechat.mp.request.user.FollowGetRequest;
import sh.evc.sdk.wechat.mp.request.user.UserInfoGetRequest;
import sh.evc.sdk.wechat.mp.response.TicketGetResponse;
import sh.evc.sdk.wechat.mp.response.TokenGetResponse;
import sh.evc.sdk.wechat.mp.response.user.FollowGetResponse;
import sh.evc.sdk.wechat.mp.response.user.UserInfoGetResponse;
import sh.evc.sdk.wechat.mp.util.JsonFormat;

/**
 * 测试
 *
 * @author winixi
 * @date 2021/2/12 3:20 PM
 */
public class MpClientTest extends BaseTest {

  /**
   * 2021-2-17 12:13
   */
  private String accessToken = "42_jMphbDs_ZIY1mx1clMJG2pw1ESnffptuvosHck5GeEBgW6WZmB2TYZiYTcYded0wCx8BZjYbWR-1L0XRDW_V4qg16PCct9gig-pN-oNzJATc7ou8sc0gqGqFLjMdutSmxEAskIw_CBhX6D52ZAPcAAAVWL";

  /**
   * 2021-2-17 12:22
   */
  private String ticket = "kgt8ON7yVITDhtdwci0qeSF8Dc3DikBtHOhw2t2zsioW1T-LVyqE1TavRQBNh0owO8lSy11xxxP_hzooN125vg";

  /**
   * 访问令牌
   */
  @Test
  public void token() {
    TokenGetRequest request = new TokenGetRequest(config.getAppId(), config.getAppSecret());
    TokenGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }

  /**
   * 临时票据
   */
  @Test
  public void ticket() {
    TicketGetRequest request = new TicketGetRequest(TicketType.JSAPI, accessToken);
    TicketGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }

  /**
   * 粉丝列表
   */
  @Test
  public void follow() {
    FollowGetRequest request = new FollowGetRequest(accessToken, "");
    FollowGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }

  /**
   * 单用户信息
   */
  @Test
  public void userInfo() {
    String openId = "oqKgTwXCsO9gVHvsPt3WVPkmUhJo";
    UserInfoGetRequest request = new UserInfoGetRequest(openId, accessToken);
    UserInfoGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }

  /**
   * 批量获取用户信息
   */
  @Test
  public void userList() {
    String[] openIds = new String[]{
            "oqKgTwSiU1dqqSzzfmgyhc7x7qqY",
            "oqKgTwTUQJ2-0H-5W8Xiu0gwrP0M",
            "oqKgTwaYLHjjpjEkAynOVhNTi-sQ",
            "oqKgTwcRkSy5sKyBPruYa4LJVuew",
            "oqKgTwe_aIFZALtGx9Ic-Q1lvP7E",
            "oqKgTwYs8fqLT1zUQ7bI8F5jnZOU",
            "oqKgTwSlreT8f-80eAmsLtmk1pps",
            "oqKgTwXCsO9gVHvsPt3WVPkmUhJo",
            "oqKgTwWNLneeaPHE_XQKdS6-xzT4",
            "oqKgTwfRJCvpB0nHU5_4earseI4I",
            "oqKgTwX2vpK3ur3rdF7FCf8s_cv4",
            "oqKgTwf6BCR1dvavbWiRymDPyOVU"};

  }

}
