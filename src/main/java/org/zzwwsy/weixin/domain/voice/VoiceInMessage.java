package org.zzwwsy.weixin.domain.voice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.zzwwsy.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD) // JAXB从字段获取配置信息
@XmlRootElement(name = "xml") 			// JAXB读取XML时根元素名称
public class VoiceInMessage extends InMessage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String voice_m_Id;

	@XmlElement(name = "Format")
	@JsonProperty("Format")
	private String format;

	
	public VoiceInMessage() {
		super.setMsgType("voice");
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public String getVoice_m_Id() {
		return voice_m_Id;
	}


	public void setVoice_m_Id(String voice_m_Id) {
		this.voice_m_Id = voice_m_Id;
	}


	@Override
	public String toString() {
		return "VoiceInMessage [voice_m_Id=" + voice_m_Id + ", format=" + format + ", getToUserName()="
				+ getToUserName() + ", getFromUsername()=" + getFromUsername() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
}
