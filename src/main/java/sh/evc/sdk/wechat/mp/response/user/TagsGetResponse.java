package sh.evc.sdk.wechat.mp.response.user;


import sh.evc.sdk.wechat.mp.domain.user.Tag;
import sh.evc.sdk.wechat.mp.response.JsonResponse;

import java.util.List;

/**
 * 用户标签信息列表返回.
 *
 * @author winixi
 */
public class TagsGetResponse extends JsonResponse {

  private List<Tag> tags;

  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  @Override
  public String toString() {
    return "TagsResponse{" +
            "tags=" + tags +
            "} " + super.toString();
  }
}
