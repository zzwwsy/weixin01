package org.zzwwsy.weixin.domain.bigvideo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.zzwwsy.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD) // JAXB从字段获取配置信息
@XmlRootElement(name = "xml") 			// JAXB读取XML时根元素名称
public class BigVideoInMessage extends InMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String big_m_Id;
	
	@XmlElement(name = "ThumbMediaId")
	@JsonProperty("ThumbMediaId")
	private String big_tm_Id;
	
	public BigVideoInMessage() {
		super.setMsgType("shortvideo");
	}

	public String getBig_m_Id() {
		return big_m_Id;
	}

	public void setBig_m_Id(String big_m_Id) {
		this.big_m_Id = big_m_Id;
	}

	public String getBig_tm_Id() {
		return big_tm_Id;
	}

	public void setBig_tm_Id(String big_tm_Id) {
		this.big_tm_Id = big_tm_Id;
	}

	@Override
	public String toString() {
		return "BigVideoInMessage [big_m_Id=" + big_m_Id + ", big_tm_Id=" + big_tm_Id + ", getToUserName()="
				+ getToUserName() + ", getFromUsername()=" + getFromUsername() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
}
