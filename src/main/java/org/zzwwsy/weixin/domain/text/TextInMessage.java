package org.zzwwsy.weixin.domain.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.zzwwsy.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD) // JAXB从字段获取配置信息
@XmlRootElement(name = "xml") 			// JAXB读取XML时根元素名称
public class TextInMessage extends InMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "Content")
	@JsonProperty("Contenet")
	private String content;
	
	public TextInMessage() {
		super.setMsgType("text");
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	//如果想要打印一些有含义的信息出来，必须要重写此方法，否则只能打印一个地址
	@Override
	public String toString() {
		return "TextInMessage [content=" + content + ", getToUserName()=" + getToUserName() + ", getFromUsername()="
				+ getFromUsername() + ", getCreateTime()=" + getCreateTime() + ", getMsgType()=" + getMsgType()
				+ ", getMsgId()=" + getMsgId() + "]";
	}
	
}
