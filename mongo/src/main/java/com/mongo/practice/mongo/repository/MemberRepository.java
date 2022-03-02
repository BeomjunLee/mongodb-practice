package com.mongo.practice.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.practice.mongo.entity.Member;

public interface MemberRepository extends MongoRepository<Member, String> {

	List<Member> findByUsernameAndPassword(String username, String password);

	void deleteByUsernameAndPassword(String username, String password);
}
