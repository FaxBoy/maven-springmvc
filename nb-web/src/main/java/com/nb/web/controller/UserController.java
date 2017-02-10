package com.nb.web.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.nb.model.RoleUser;
import com.nb.service.base.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;


	@RequestMapping(value="/showuser.do", method = RequestMethod.POST)
	public String toIndex(HttpServletRequest request,Model model){
		RoleUser userLogin=new RoleUser();
		/*userLogin.setUsername(request.getParameter("username"));
		userLogin.setPassword(request.getParameter("password"));*/
		
		RoleUser user=new RoleUser();

		/*if(this.userService.getLoginUser(userLogin)){
          user=this.userService.getUserByusername(userLogin.getUsername());
          System.out.println(user.toString()+"get user success");
          model.addAttribute("user", user);
          
		}else{
			
			model.addAttribute("user can not in use");
			System.out.println("can not get user");
		}*/
	      	return "indexuser";
	}
	
	
	
	@RequestMapping(value="/register.do",method= RequestMethod.POST)
	public String registerIndex(HttpServletRequest request,Model model){
		
		//ModelAndView mav=new ModelAndView();

		/*User userRegister=new User();
		String username2=request.getParameter("username");
		String password2=request.getParameter("password");
		userRegister.setUsername(username2);
		userRegister.setPassword(password2);
		System.out.println(username2+"密码是"+password2);
		
		if(userRegister.getUsername()!=null){
			if (request.getParameter("age")==null) {
				userRegister.setAge(25);
			}else{
				userRegister.setAge(Integer.parseInt(request.getParameter("age")));
			}
			System.out.println(userRegister.getUsername()+" 显示注册的名字");
			
		}else{
			
			User user2 = new User();  
			user2.setUsername("pm");  
			user2.setPassword("pm");  
			user2.setAge(45);  			
			userRegister=user2;			
		}
		
		int id=this.userService.inster(userRegister);

        User user=this.userService.getUserById(id);
        
        System.out.println(user.toString()+"insert user success");
        
        model.addAttribute("user", user);*/
		
	    return "indexuser";
	}

	

	@RequestMapping(value = "/detail.do",method=RequestMethod.GET)  
	@ResponseBody
	public JSONObject toIndex(){
		JSONObject json = new JSONObject();
		json.put("pageNumber", 1);
		json.put("pageCount", 2);
		json.put("result", userService.selectLogin("2c92819e541857e10154186063210002"));
		System.out.println("hhh");
		return json;
	}
	
	
}
