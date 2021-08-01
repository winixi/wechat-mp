package sh.evc.sdk.wechat.mp;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.evc.sdk.wechat.mp.client.MpClient;
import sh.evc.sdk.wechat.mp.dict.ActionType;
import sh.evc.sdk.wechat.mp.dict.ActivityTargetState;
import sh.evc.sdk.wechat.mp.dict.Lang;
import sh.evc.sdk.wechat.mp.dict.TicketType;
import sh.evc.sdk.wechat.mp.domain.LineColor;
import sh.evc.sdk.wechat.mp.domain.activity.TemplateInfo;
import sh.evc.sdk.wechat.mp.domain.activity.TemplateParam;
import sh.evc.sdk.wechat.mp.domain.marketing.ActionParam;
import sh.evc.sdk.wechat.mp.domain.marketing.Trace;
import sh.evc.sdk.wechat.mp.domain.marketing.UserAction;
import sh.evc.sdk.wechat.mp.domain.user.UserOpenId;
import sh.evc.sdk.wechat.mp.handler.ResponseHandler;
import sh.evc.sdk.wechat.mp.handler.ResponseHandlerTest;
import sh.evc.sdk.wechat.mp.request.*;
import sh.evc.sdk.wechat.mp.request.user.FollowerGetRequest;
import sh.evc.sdk.wechat.mp.request.user.UserInfoGetRequest;
import sh.evc.sdk.wechat.mp.request.user.UserInfoListGetRequest;
import sh.evc.sdk.wechat.mp.response.*;
import sh.evc.sdk.wechat.mp.response.user.FollowerGetResponse;
import sh.evc.sdk.wechat.mp.response.user.UserInfoGetResponse;
import sh.evc.sdk.wechat.mp.response.user.UserInfoListGetResponse;
import sh.evc.sdk.wechat.mp.util.JsonFormat;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 测试
 *
 * @author winixi
 * @date 2021/2/12 3:20 PM
 */
public class MpClientTest {

	public final static Logger logger = LoggerFactory.getLogger(MpClientTest.class);
	public MpClient client;
	public String appId;
	public String appSecret;
	public String token;
	public String encodingAesKey;
	public ResponseHandler handler = new ResponseHandlerTest();

	@Before
	public void before() {
		InputStream in = this.getClass().getResourceAsStream("/config.properties");
		try {
			InputStreamReader inputStreamReader = new InputStreamReader(in, StandardCharsets.UTF_8);
			Properties props = new Properties();
			props.load(inputStreamReader);
			appId = props.getProperty("appId");
			appSecret = props.getProperty("appSecret");
			token = props.getProperty("token");
			encodingAesKey = props.getProperty("encodingAesKey");

		} catch (IOException e) {
			logger.error("读取配置错误", e);
		}
		client = new MpClient(handler);
	}

	/**
	 * 2021-2-17 13:57
	 */
	private String accessToken = "42_xkZjexYvWL5in2obTJjL5yH_DRrrJHdsv3jOjTSjRKrdQsN0Sh5TKsGeX2kO1au1Z8TEFzpCoOa1hjnnieoA3xruTcwMz89hrM9G7xICiOJrw7ooI_bpnCTB_x5xK7raz4U5FBP552apntLeDQQgAGALYY";

	/**
	 * 访问令牌
	 */
	@Test
	public void accessToken() {
		AccessTokenGetRequest request = new AccessTokenGetRequest(appId, appSecret);
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


	/**
	 * 测试信息安全验证
	 */
	@Test
	public void msgSecCheck() {
		String content = "特3456书yuuo莞6543李zxcz蒜7782法fgnv级";
		MsgSecCheckRequest request = new MsgSecCheckRequest(accessToken, content);
		MsgSecCheckResponse response = client.execute(request);
		JsonFormat.print(response);
	}

	/**
	 * 图片安全检查
	 */
	@Test
	public void imgSecCheck() {
		File file = new File(getClass().getClassLoader().getResource("vio.jpg").getFile());
		ImgSecCheckRequest request = new ImgSecCheckRequest(accessToken, file);
		ImgSecCheckResponse response = client.execute(request);
		JsonFormat.print(response);
	}

	/**
	 * 创建动态消息id
	 */
	@Test
	public void activityIdCreate() {
		String unionId = "";
		String openId = "";
		ActivityIdCreateRequest request = new ActivityIdCreateRequest(accessToken, unionId, openId);
		ActivityIdCreateResponse response = client.execute(request);
		JsonFormat.print(response);
	}

	/**
	 * 修改动态消息
	 */
	@Test
	public void activityUpdate() {
		String activityId = "";
		ActivityTargetState targetState = ActivityTargetState.WAITING;
		TemplateParam memberCount = new TemplateParam("member_count", "1");
		TemplateParam roomLimit = new TemplateParam("room_limit", "10");
		TemplateParam[] params = new TemplateParam[]{
						memberCount, roomLimit
		};
		TemplateInfo templateInfo = new TemplateInfo(params);
		ActivityUpdateRequest request = new ActivityUpdateRequest(accessToken, activityId, targetState, templateInfo);
		ActivityUpdateResponse response = client.execute(request);
		JsonFormat.print(response);
	}

	/**
	 * 用户广告动作
	 */
	@Test
	public void userActionAdd() {
		String userActionSetId = "123";
		String url = "http://baidu.com";
		int actionTime = (int) (System.currentTimeMillis() / 1000);
		String clickId = "123456";
		int paramValue = 1;
		UserAction userAction = new UserAction(userActionSetId, url, actionTime, ActionType.RESERVATION, new Trace(clickId), new ActionParam(paramValue));
		UserActionAddRequest request = new UserActionAddRequest(accessToken, new UserAction[]{userAction});
		UserActionAddResponse response = client.execute(request);
		JsonFormat.print(response);
	}

	@Test
	public void QrCodeUnlimitedGet() {
		String page = "player/fieldTimeJoin/info/info";
		int width = 430;
		boolean autoColor = false;
		LineColor lineColor = new LineColor("0", "0", "0");
		boolean isHyaline = false;
		String scene = "aaa";
		QrCodeUnlimitedGetRequest request = new QrCodeUnlimitedGetRequest(accessToken, scene, page, width, autoColor, lineColor, isHyaline);
		QrCodeUnlimitedGetResponse response = client.execute(request);
		JsonFormat.print(response);
	}
}
