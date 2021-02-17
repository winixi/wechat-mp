package sh.evc.sdk.wechat.mp;

import org.junit.Test;
import sh.evc.sdk.wechat.mp.dict.Lang;
import sh.evc.sdk.wechat.mp.dict.TicketType;
import sh.evc.sdk.wechat.mp.domain.user.UserOpenId;
import sh.evc.sdk.wechat.mp.request.AccessTokenGetRequest;
import sh.evc.sdk.wechat.mp.request.TicketGetRequest;
import sh.evc.sdk.wechat.mp.request.user.FollowerGetRequest;
import sh.evc.sdk.wechat.mp.request.user.UserInfoGetRequest;
import sh.evc.sdk.wechat.mp.request.user.UserInfoListGetRequest;
import sh.evc.sdk.wechat.mp.response.AccessTokenGetResponse;
import sh.evc.sdk.wechat.mp.response.TicketGetResponse;
import sh.evc.sdk.wechat.mp.response.user.FollowerGetResponse;
import sh.evc.sdk.wechat.mp.response.user.UserInfoGetResponse;
import sh.evc.sdk.wechat.mp.response.user.UserInfoListGetResponse;
import sh.evc.sdk.wechat.mp.util.JsonFormat;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试
 *
 * @author winixi
 * @date 2021/2/12 3:20 PM
 */
public class MpClientTest extends BaseTest {

  /**
   * 2021-2-17 13:57
   */
  private String accessToken = "42_xkZjexYvWL5in2obTJjL5yH_DRrrJHdsv3jOjTSjRKrdQsN0Sh5TKsGeX2kO1au1Z8TEFzpCoOa1hjnnieoA3xruTcwMz89hrM9G7xICiOJrw7ooI_bpnCTB_x5xK7raz4U5FBP552apntLeDQQgAGALYY";

  /**
   * 访问令牌
   */
  @Test
  public void accessToken() {
    AccessTokenGetRequest request = new AccessTokenGetRequest(config.getAppId(), config.getAppSecret());
    AccessTokenGetResponse response = client.execute(request);
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
  public void follower() {
    FollowerGetRequest request = new FollowerGetRequest(accessToken, "");
    FollowerGetResponse response = client.execute(request);
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
  public void userInfoList() {
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
    List<UserOpenId> userOpenIdList = new ArrayList<>();
    for (String openId : openIds) {
      userOpenIdList.add(new UserOpenId(openId, Lang.zh_CN));
    }
    UserInfoListGetRequest request = new UserInfoListGetRequest(accessToken, userOpenIdList);
    UserInfoListGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }

}
