package sh.evc.sdk.wechat.mp.response.user;

import sh.evc.sdk.wechat.mp.domain.user.UserInfo;
import sh.evc.sdk.wechat.mp.response.JsonResponse;

import java.util.List;

/**
 * 用户列表
 *
 * @author winixi
 */
public class UserInfoListGetResponse extends JsonResponse {

  /**
   * 用户信息
   */
  private List<UserInfo> userInfoInfoList;

  public List<UserInfo> getUserInfoList() {
    return userInfoInfoList;
  }

  public void setUserInfoList(List<UserInfo> userInfoInfoList) {
    this.userInfoInfoList = userInfoInfoList;
  }

  @Override
  public String toString() {
    return "UserListResponse{" +
            "userInfoList=" + userInfoInfoList +
            "} " + super.toString();
  }
}
