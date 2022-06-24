package com.woongsun.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woongsun.domain.BoardAttachVO;
import com.woongsun.domain.BoardVO;
import com.woongsun.domain.Criteria;
import com.woongsun.mapper.BoardAttachMapper;
import com.woongsun.mapper.BoardMapper;
import com.woongsun.mapper.ReplyMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service @AllArgsConstructor @Log4j
public class BoardServiceImpl implements BoardService{
	private BoardMapper boardMapper;
	private BoardAttachMapper boardAttachMapper;
	private ReplyMapper replyMapper;
	
	@Transactional
	public int register(BoardVO boardVO) {
		log.info("register("+boardVO+")");
		// boardVo.bno = null
		int result = boardMapper.insertSelectKey(boardVO);
		
		boardVO.getAttachs().forEach(attach -> {
			attach.setBno(boardVO.getBno());
			boardAttachMapper.insert(attach);
		});
		// boardVo.bno = not null
		return result;
	}

	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		return boardMapper.read(bno);
	}

	@Override
	@Transactional
	public boolean modify(BoardVO boardVO) {
		// TODO Auto-generated method stub
		// 게시글의 첨부파일 일괄삭제
		boardAttachMapper.deleteAll(boardVO.getBno());
		
		// 첨부파일 재등록
		boardVO.getAttachs().forEach(attach -> {
			attach.setBno(boardVO.getBno());
			boardAttachMapper.insert(attach);
		});
		
		return boardMapper.update(boardVO) > 0;
	}

	@Override
	@Transactional
	public boolean remove(Long bno) {
		replyMapper.deleteAll(bno);
		boardAttachMapper.deleteAll(bno);
		return boardMapper.delete(bno) > 0;
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.getListWithPaging(cri);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.getTotalCount(cri);
	}

	@Override
	public List<BoardAttachVO> getAttachs(Long bno) {
		// TODO Auto-generated method stub
		return boardAttachMapper.findBy(bno);
	}
	
	
	
	
}
