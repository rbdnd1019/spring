package com.woongsun.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.event.TransactionalEventListener;

import com.woongsun.domain.CriteriaReply;
import com.woongsun.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired @Setter
	private ReplyMapper mapper;
	
	@Test
	public void testExist() {
		assertNotNull(mapper);
		log.info(mapper);
	}
//	363822
//	363821
//	363801
//	363786
//	363785
	@Test
	public void testInsert() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(363822L);
		vo.setReply("댓글 내용");
		vo.setReplyer("작성자");
		
		mapper.insert(vo);
	}
	
	@Test
	public void testCreate() {
		Long[] bnoArr = {
				363822L,
				363821L,
				363801L,
				363786L,
				363785L
		};
		IntStream.rangeClosed(1, 100).forEach(r->{
			ReplyVO vo = new ReplyVO();
			vo.setBno(bnoArr[r%5]);
			vo.setReply("댓글 내용" + r);
			vo.setReplyer("작성자" + r);
			mapper.insert(vo);
		});
	}
	
	@Test
	public void testRead() {
		ReplyVO replyVO = mapper.read(5L);
		log.info(replyVO);
	}
	
	@Test
	public void testDelete(){
		mapper.delete(2L);
	}
	
	@Test
	public void testUpdate(){
		ReplyVO replyVO = mapper.read(1L);
		replyVO.setReply("수정된 내용");
		
		mapper.update(replyVO);
	}
	
	@Test
	public void testList() {
		CriteriaReply cri = new CriteriaReply();
		cri.setLastRno(23L);
		mapper.getListWithPaging(363822L, new CriteriaReply());
	}
}
