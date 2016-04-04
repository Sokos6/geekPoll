package com.geekPoll.repository;

import org.springframework.data.repository.CrudRepository;
import com.geekPoll.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {

}
