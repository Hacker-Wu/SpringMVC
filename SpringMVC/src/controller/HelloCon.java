package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@HEh
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import beans.User;


@Controller
public class HelloCon{
	
	/*protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("da");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello.jsp");
		return modelAndView;
	}*/
	/*@Autowired
	private User userName;
	private User password;
	public void setUserName(User userName) {
		this.userName = userName;
	}
	public void setPassword(User password) {
		this.password = password;
	}*/
	@RequestMapping("hello.do")
	public String login(User u){
		System.out.println(u.getUserName());
		System.out.println(u.getPassword());
		return "hello.jsp";
	}

}
