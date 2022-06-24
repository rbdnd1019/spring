package com.woongsun.service;

import java.util.List;

import com.woongsun.domain.CriteriaReply;
import com.woongsun.domain.ReplyVO;

public interface ReplyService {
	int register(ReplyVO vo);
	
	ReplyVO get(Long rno);
	
	int modify(ReplyVO vo);
	
	int remove(Long rno);
	
	List<ReplyVO> getList(Long bno, CriteriaReply cri);
}
