package sh.evc.sdk.wechat.mp.response;

/**
 * ticket
 *
 * @author winixi
 * @date 2021/2/16 1:43 PM
 */
public class TicketGetResponse extends JsonResponse {

  /**
   * ticket
   */
  private String ticket;

  /**
   * 有效期默认7200秒，需要服务器缓存
   */
  private Integer expiresIn;

  public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  @Override
  public String toString() {
    return "TicketGetResponse{" +
            "ticket='" + ticket + '\'' +
            ", expiresIn=" + expiresIn +
            "} " + super.toString();
  }
}
