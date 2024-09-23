package com.example.demo.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Member {
	private String username;		// 10글자
	private String password;		// 60글자  암호화를 거치면서 해쉬코드로 무조건 60자(1자여도 60자, 20자여도 60자로 고정됨)
	private String email;			// 30글자
}
