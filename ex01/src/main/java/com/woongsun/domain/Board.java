package com.woongsun.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component @ToString @Getter @Setter
public class Board {
	private Long bno;
	private String title;
}
