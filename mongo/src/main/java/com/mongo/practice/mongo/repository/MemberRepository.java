package com.mongo.practice.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.practice.mongo.entity.Member;

public interface MemberRepository extends MongoRepository<Member, String> {

	
}
