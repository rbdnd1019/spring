package com.woongsun.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper=true)
@NoArgsConstructor
@Getter
@Setter
public class ReplyAttachVO extends AttachFileDTO{
	private Long rno;

	public ReplyAttachVO(String origin, String uuid, String path, boolean image, Long rno) {
		super(origin, uuid, path, image);
		this.rno = rno;
	}
	
	public ReplyAttachVO(AttachFileDTO dto, Long rno) {
		this(dto.getOrigin(), dto.getUuid(), dto.getPath(), dto.isImage(), rno);
	}
	
}
