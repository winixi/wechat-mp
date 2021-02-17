package sh.evc.sdk.wechat.mp.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import sh.evc.sdk.wechat.mp.domain.user.OpenIdList;
import sh.evc.sdk.wechat.mp.response.JsonResponse;

/**
 * 关注用户列表接口返回信息.
 *
 * @author winixi
 */
public class FollowerGetResponse extends JsonResponse {

  /**
   * 关注该公众账号的总用户数
   */
  private Integer total;

  /**
   * 拉取的OPENID个数，最大值为10000
   */
  private Integer count;

  /**
   * 拉取列表的最后一个用户的OPENID
   */
  @JsonProperty("nextOpenid")
  private String nextOpenId;

  /**
   * 列表数据，OPENID的列表
   */
  private OpenIdList data;

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getNextOpenId() {
    return nextOpenId;
  }

  public void setNextOpenId(String nextOpenId) {
    this.nextOpenId = nextOpenId;
  }

  public OpenIdList getData() {
    return data;
  }

  public void setData(OpenIdList data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "FollowResponse{" +
            "total=" + total +
            ", count=" + count +
            ", nextOpenId='" + nextOpenId + '\'' +
            ", data=" + data +
            "} " + super.toString();
  }
}
