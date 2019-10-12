package com.name.repository;

import org.springframework.data.repository.CrudRepository;

import com.name.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
