package com.woongsun.mapper;

import com.woongsun.domain.AuthVO;
import com.woongsun.domain.MemberVo;

public interface MemberMapper {
	
	MemberVo read(String userid);
	
	int insertMember(MemberVo vo);
	
	int insertAuth(AuthVO vo);
}
