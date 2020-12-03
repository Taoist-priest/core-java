package edu.nf.demo.controller;

import edu.nf.demo.entity.Users;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.ForwardView;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.RedirectView;
import org.nf.mvc.view.View;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangl
 * @date 2020/10/15
 */
public class UserController {

    @WebRequest("/add")
    public View add(Users user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
        //转发
        return new ForwardView("success.html");
    }

    @WebRequest("/add2")
    public View add2(String userName, String password, int age) {
        System.out.println(userName);
        System.out.println(password);
        System.out.println(age);
        //重定向
        return new RedirectView("success.html");
    }

    @WebRequest("/add3")
    public View add3(Users user) {
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
        //返回Json
        return new JsonView(user);
    }
}
