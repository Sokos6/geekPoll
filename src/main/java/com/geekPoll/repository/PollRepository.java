package com.geekPoll.repository;

import org.springframework.data.repository.CrudRepository;

import com.geekPoll.domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
