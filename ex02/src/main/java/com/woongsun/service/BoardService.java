package com.woongsun.service;

import java.util.List;

import com.woongsun.domain.BoardAttachVO;
import com.woongsun.domain.BoardVO;
import com.woongsun.domain.Criteria;

public interface BoardService {
	int register(BoardVO boardVO);
	
	BoardVO get(Long bno);
	
	boolean modify(BoardVO boardVO);
	
	boolean remove(Long bno);
	
	List<BoardVO> getList(Criteria cri);

	int getTotalCount(Criteria cri);
	
	List<BoardAttachVO> getAttachs(Long bno);
}
