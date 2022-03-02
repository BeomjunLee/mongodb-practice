package com.mongo.practice.mongo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongo.practice.mongo.entity.Member;
import com.mongo.practice.mongo.repository.MemberRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class MongoApplication {

	@Autowired
	private MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Member member = Member.builder()
			.username("test2")
			.password("1234")
			.build();

		memberRepository.insert(member);

		log.info("[테스트 insert] " + member);
	}
}
