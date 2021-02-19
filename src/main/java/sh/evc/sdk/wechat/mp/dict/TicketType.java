package sh.evc.sdk.wechat.mp.dict;

/**
 * 临时票据类型
 *
 * @author winixi
 * @date 2021/2/17 12:15 PM
 */
public enum TicketType {

  /**
   * 网页
   */
  JSAPI("jsapi"),

  /**
   * 小程序
   */
  WX_CARD("wx_card");

  private String value;

  TicketType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "TicketType{" +
            "value='" + value + '\'' +
            "} " + super.toString();
  }
}
