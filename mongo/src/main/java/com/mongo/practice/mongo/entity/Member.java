package com.mongo.practice.mongo.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Document
@Getter
@Builder
@ToString
public class Member {

	//	private ObjectId memberId;
	@Id
	private Long memberId;
	private String username;
	private String password;
}
