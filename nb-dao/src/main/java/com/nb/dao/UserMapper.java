package com.nb.dao;

import org.springframework.stereotype.Repository;

import com.nb.model.RoleUser;

@Repository
public interface UserMapper {
	

    RoleUser selectLogin(String cd_usrl);

}