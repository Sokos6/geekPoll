package com.geekPoll.repository;

import org.springframework.data.repository.CrudRepository;

import com.geekPoll.domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {

}
