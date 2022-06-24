package com.woongsun.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.woongsun.domain.BoardVO;
import com.woongsun.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Setter @Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testExist() {
		assertNotNull(boardMapper);
	}
	
	@Test
	public void testGetList() {
		List<BoardVO> result =  boardMapper.getList();
		assertNotNull(result);
		result.forEach(log::info);
	}

	@Test
	public void testGetListWithPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
//		cri.setType("TW");
//		cri.setKeyword("12");
		log.info(cri);
		
		List<BoardVO> result =  boardMapper.getListWithPaging(cri);
		assertNotNull(result);
		result.forEach(log::info);
	}

	@Test
	public void testRead() {
		BoardVO result =  boardMapper.read(5L);
		assertNotNull(result);
		log.info(result);
	}
	
	@Test
	public void testInsert() {
		
		// init
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("mapper test title");
		boardVO.setContent("mapper test content");
		boardVO.setWriter("user00");
		log.info(boardVO);
		
		// expect
		int exp = 1;
		
		// result 
		int result = boardMapper.insert(boardVO);
		
		assertEquals("게시글 추가", exp, result);
		log.info(boardVO);
	}
	
	@Test
	public void testInsertSelectKey() {
		
		// init
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("mapper test title selectKey");
		boardVO.setContent("mapper test content selectKey");
		boardVO.setWriter("user00");
		log.info(boardVO);
		
		// expect
		int exp = 1;
		
		// result 
		int result = boardMapper.insertSelectKey(boardVO);
		
		assertEquals("게시글 추가", exp, result);
		log.info(boardVO);
	}

	@Test
	public void testUpdate() {
		
		// init
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("test update");
		boardVO.setContent("test update");
		boardVO.setBno(3L);
		log.info(boardVO);
		
		// expect
		int exp = 1;
		
		// result 
		int result = boardMapper.update(boardVO);
		
		assertEquals("게시글 수정", exp, result);
		log.info(boardVO);
	}
	
	@Test
	public void testDelete() {
		
		// init
		Long bno = 3L;
		log.info(bno);
		
		// expect
		int exp = 1;
		
		// result 
		int result = boardMapper.delete(bno);
		
		assertEquals("게시글 삭제", exp, result);
	}
	
	@Test
	public void testGetTotalCount() {
		Criteria cri = new Criteria();
		cri.setPageNum(4);
		cri.setAmount(3);
		cri.setType("TW");
		cri.setKeyword("12");
		log.info(boardMapper.getTotalCount(cri));
	}
	
	@Test
	public void testGetListDynamicTest() {
		Criteria cri = new Criteria();
//		cri.setType("TC"); // 제목 , 내용
		log.info(Arrays.toString(cri.getTypeArr()));
		cri.setKeyword("테스트");
		boardMapper.getListDynamicTest(cri);
	}
	
	@Test
	public void testStringJoin() {
		String[] arr = {"1", "2", "3", "4"};
		log.info(String.join("", arr));
	}
}
