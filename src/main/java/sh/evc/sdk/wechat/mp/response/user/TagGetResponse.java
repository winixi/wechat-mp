package sh.evc.sdk.wechat.mp.response.user;


import sh.evc.sdk.wechat.mp.domain.user.Tag;
import sh.evc.sdk.wechat.mp.response.JsonResponse;

/**
 * 用户标签信息返回.
 *
 * @author winixi
 */
public class TagGetResponse extends JsonResponse {

  private Tag tag;

  public Tag getTag() {
    return tag;
  }

  public void setTag(Tag tag) {
    this.tag = tag;
  }

  @Override
  public String toString() {
    return "TagResponse{" +
            "tag=" + tag +
            "} " + super.toString();
  }
}
