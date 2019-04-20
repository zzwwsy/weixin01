package org.zzwwsy.weixin.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.zzwwsy.weixin.domain.InMessage;
import org.zzwwsy.weixin.domain.bigvideo.BigVideoInMessage;
import org.zzwwsy.weixin.domain.image.ImageInMessage;
import org.zzwwsy.weixin.domain.link.LinkInMessage;
import org.zzwwsy.weixin.domain.location.LocationInMessage;
import org.zzwwsy.weixin.domain.shortvideo.ShortVideoInMessage;
import org.zzwwsy.weixin.domain.text.TextInMessage;
import org.zzwwsy.weixin.domain.voice.VoiceInMessage;

public class MessageTypeMapper {

	private static Map<String, Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();

	// 通过一个Map记录了消息类型和类的关系
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);
		typeMap.put("vioce", VoiceInMessage.class);
		typeMap.put("bigvideo", BigVideoInMessage.class);
		typeMap.put("shortvideo", ShortVideoInMessage.class);
		typeMap.put("location",LocationInMessage.class);
		typeMap.put("link", LinkInMessage.class);

//		typeMap.put("event", TextInMessage.class);
	}

	// 通过消息类型获取对应的类
	@SuppressWarnings("unchecked")
	public static <T extends InMessage> Class<T> getClass(String type) {
		return (Class<T>) typeMap.get(type);
	}

}
