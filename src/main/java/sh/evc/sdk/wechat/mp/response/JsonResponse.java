package sh.evc.sdk.wechat.mp.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * json返回
 *
 * @author winixi
 * @date 2021/2/9 2:43 PM
 */
public class JsonResponse extends ApiResponse {

  /**
   * 错误码
   */
  @JsonProperty("errcode")
  private Integer errCode;

  /**
   * 错误消息
   */
  @JsonProperty("errmsg")
  private String errMsg;

  public Integer getErrCode() {
    return errCode;
  }

  public void setErrCode(Integer errCode) {
    this.errCode = errCode;
  }

  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }

  @Override
  public String toString() {
    return "JsonResponse{" +
            "errCode=" + errCode +
            ", errMsg='" + errMsg + '\'' +
            '}';
  }
}
