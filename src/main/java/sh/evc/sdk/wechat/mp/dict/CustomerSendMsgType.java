package sh.evc.sdk.wechat.mp.dict;

/**
 * 客服消息类型
 *
 * @author winixi
 * @date 2021/2/9 4:48 PM
 */
public enum CustomerSendMsgType {

	/**
	 * 文本
	 */
	TEXT("text"),

	/**
	 * 图片
	 */
	IMAGE("image"),

	/**
	 * 链接
	 */
	LINK("link"),

	/**
	 * 小程序卡片
	 */
	MINI_APP_PAGE("miniprogrampage");

	private String value;

	CustomerSendMsgType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
