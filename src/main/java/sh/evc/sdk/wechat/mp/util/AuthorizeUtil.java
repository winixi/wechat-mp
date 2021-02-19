package sh.evc.sdk.wechat.mp.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.evc.sdk.wechat.mp.Const;
import sh.evc.sdk.wechat.mp.dict.SnsScope;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * 授权
 *
 * @author winixi
 * @date 2021/2/19 10:07 AM
 */
public class AuthorizeUtil {

  private final static Logger logger = LoggerFactory.getLogger(AuthorizeUtil.class);

  /**
   * 获取授权URL。
   * 第一步：用户同意授权，获取code;如果用户同意授权，页面附带code,state跳转至redirect_uri
   *
   * @param appId       公众号的唯一标识
   * @param redirectUri 授权后重定向的回调链接地址
   * @param scope       应用授权作用域:
   *                    snsapi_base;不弹出授权页面，直接跳转，只能获取用户openid.
   *                    snsapi_userinfo;弹出授权页面，可通过openid拿到昵称、性别、所在地.
   *                    并且，即使在未关注的情况下，只要用户授权，也能获取其信息.
   * @param state       重定向后会带上state参数，开发者可以填写a-zA-Z0-9的参数值，最多128字节
   *                    服务方的appid，在申请创建公众号服务成功后，可在公众号服务详情页找到
   * @return 授权URL
   */
  public static String getOauth2Url(String appId, String redirectUri, SnsScope scope, String state) {
    StringBuilder sb = new StringBuilder();
    sb.append(Const.OPEN_URL + "/connect/oauth2/authorize?")
            .append("appid=").append(appId)
            .append("&redirect_uri=").append(encode(redirectUri))
            .append("&response_type=code")
            .append("&scope=").append(scope.getValue())
            .append("&state=").append(state);
    sb.append("#wechat_redirect");
    return sb.toString();
  }

  /**
   * utf8编码
   *
   * @param str
   * @return
   */
  private static String encode(String str) {
    try {
      str = URLEncoder.encode(str, StandardCharsets.UTF_8.displayName());
    } catch (UnsupportedEncodingException e) {
      logger.error(ErrorUtil.getStackTraceAsString(e));
    }
    return str;
  }
}
