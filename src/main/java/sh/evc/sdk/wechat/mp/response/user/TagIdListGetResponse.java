package sh.evc.sdk.wechat.mp.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import sh.evc.sdk.wechat.mp.response.JsonResponse;

import java.util.List;

/**
 * 标签ID列表.
 *
 * @author winixi
 */
public class TagIdListGetResponse extends JsonResponse {

  @JsonProperty("tagidList")
  private List<String> tagIdList;

  public List<String> getTagIdList() {
    return tagIdList;
  }

  public void setTagIdList(List<String> tagIdList) {
    this.tagIdList = tagIdList;
  }

  @Override
  public String toString() {
    return "TagIdListResponse{" +
            "tagIdList=" + tagIdList +
            "} " + super.toString();
  }
}
