package com.nb.service.base.Impl;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nb.dao.UserMapper;
import com.nb.model.RoleUser;
import com.nb.service.base.service.UserService;

	@Service
	public class UserServiceImpl implements UserService { 
		
		@Resource
	    private UserMapper userDao; 
//	    
//	    public RoleUser getUserById(String id) {  
//	        // TODO Auto-generated method stub 
//	    	System.out.println(id+this.userDao.selectId(id).getCd_us());
//	    	
//	        return this.userDao.selectId(id);  
//	    }  
	  
		public RoleUser selectLogin(String username) {
			// TODO Auto-generated method stub
			return this.userDao.selectLogin(username);
		}
	    
	}  

