package sh.evc.sdk.wechat.mp.domain.user;

/**
 * 用户标签信息.
 *
 * @author winixi
 */
public class Tag {

  /**
   * 标签id，由微信分配
   */
  private Integer id;

  /**
   * 标签名，UTF8编码
   */
  private String name;

  /**
   * 此标签下粉丝数
   */
  private Integer count;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "Tag{"
            + "id=" + id
            + ", nickName='" + name + '\''
            + ", count=" + count
            + '}';
  }
}
