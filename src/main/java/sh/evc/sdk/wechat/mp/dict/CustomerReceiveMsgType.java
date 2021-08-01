package sh.evc.sdk.wechat.mp.dict;

/**
 * 接收消息类型
 *
 * @author winixi@qq.com
 * @date 2021/7/26 11:06 PM
 */
public enum CustomerReceiveMsgType {

	/**
	 * 文本
	 */
	TEXT("text"),

	/**
	 * 图片
	 */
	IMAGE("image"),

	/**
	 * 小程序卡片
	 */
	MINI_APP_PAGE("miniprogrampage"),

	/**
	 * 事件
	 */
	EVENT("event");

	private String value;

	CustomerReceiveMsgType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * 根据值查找
	 *
	 * @param value
	 * @return
	 */
	public static CustomerReceiveMsgType getType(String value) {
		for (CustomerReceiveMsgType type : CustomerReceiveMsgType.values()) {
			if (type.getValue().equals(value)) return type;
		}
		return null;
	}
}
