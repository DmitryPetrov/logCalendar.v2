package com.name.repository;

import org.springframework.data.repository.CrudRepository;

import com.name.entity.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, Long>{

}
