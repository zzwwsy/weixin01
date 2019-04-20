package org.zzwwsy.weixin.domain.shortvideo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.zzwwsy.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD) // JAXB从字段获取配置信息
@XmlRootElement(name = "xml") 			// JAXB读取XML时根元素名称
public class ShortVideoInMessage extends InMessage {

	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String short_m_Id;
	
	@XmlElement(name = "ThumbMediaId")
	@JsonProperty("ThumbMediaId")
	private String short_tm_Id;
	
	public ShortVideoInMessage() {
		super.setMsgType("shortvideo");
	}

	public String getShort_m_Id() {
		return short_m_Id;
	}

	public void setShort_m_Id(String short_m_Id) {
		this.short_m_Id = short_m_Id;
	}

	public String getShort_tm_Id() {
		return short_tm_Id;
	}

	public void setShort_tm_Id(String short_tm_Id) {
		this.short_tm_Id = short_tm_Id;
	}

	@Override
	public String toString() {
		return "ShortVideoInMessage [short_m_Id=" + short_m_Id + ", short_tm_Id=" + short_tm_Id + ", getToUserName()="
				+ getToUserName() + ", getFromUsername()=" + getFromUsername() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + ", getClass()=" + getClass() + "]";
	}
	
}
