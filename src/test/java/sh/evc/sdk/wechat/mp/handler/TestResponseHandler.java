package sh.evc.sdk.wechat.mp.handler;

import sh.evc.sdk.wechat.mp.response.ApiResponse;

/**
 * test response handler
 *
 * @author winixi
 * @date 2021/1/8 1:52 PM
 */
public class TestResponseHandler implements ResponseHandler {

  @Override
  public void append(ApiResponse response) {
    System.out.println(response.toString());
  }
}
