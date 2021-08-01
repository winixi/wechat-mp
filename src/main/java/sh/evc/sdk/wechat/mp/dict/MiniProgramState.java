package sh.evc.sdk.wechat.mp.dict;

/**
 * 版本类型
 *
 * @author winixi
 * @date 2021/2/9 4:00 PM
 */
public enum MiniProgramState {

  /**
   * 开发版
   */
  DEVELOP("develop"),

  /**
   * 体验版
   */
  TRIAL("trial"),

  /**
   * 正式版
   */
  RELEASE("release");

  private String value;

  MiniProgramState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
