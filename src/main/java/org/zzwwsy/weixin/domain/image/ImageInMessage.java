package org.zzwwsy.weixin.domain.image;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.zzwwsy.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD) // JAXB从字段获取配置信息
@XmlRootElement(name = "xml") 			// JAXB读取XML时根元素名称
public class ImageInMessage extends InMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "PicUrl")
	@JsonProperty("PicUrl")
	private String picurl;
	
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String image_m_Id;

	
	public ImageInMessage() {
		super.setMsgType("image");
	}


	public String getUrl() {
		return picurl;
	}


	public void setUrl(String picurl) {
		this.picurl = picurl;
	}


	public String getMediaId() {
		return image_m_Id;
	}


	public void setMediaId(String image_m_Id) {
		this.image_m_Id = image_m_Id;
	}


	@Override
	public String toString() {
		return "ImageInMessage [picurl=" + picurl + ", image_m_Id=" + image_m_Id + ", getToUserName()="
				+ getToUserName() + ", getFromUsername()=" + getFromUsername() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
}
