package com.example.demo.controller;

//import com.example.demo.bean.BookUser;
//import com.example.demo.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.Iterator;

//@RestController
//public class BookController {
//    @Resource
//    BookService userService;
//
//    @RequestMapping("/")
//    public String index() {
//        return "redirect:/list";
//    }
//
//    @RequestMapping("/list")
//    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "2") int pageSize) {
//        System.out.println("============================");
//        Page<BookUser> users=userService.getUserList(pageNum, pageSize);
//        System.out.println("总页数" + users.getTotalPages());
//        System.out.println("当前页是：" + pageNum);
//
//        System.out.println("分页数据：");
//        Iterator<BookUser> u = users.iterator();
//        while (u.hasNext()){
//
//            System.out.println(u.next().toString());
//        }
//
//        model.addAttribute("users", users);
//
//
//        return "user/list";
//    }
//
//    @RequestMapping("/toAdd")
//    public String toAdd() {
//        return "user/userAdd";
//    }
//
//    @RequestMapping("/add")
//    public String add(Book user) {
//        userService.save(user);
//        return "redirect:/list";
//    }
//
//    @RequestMapping("/toEdit")
//    public String toEdit(Model model,Long id) {
//        Book user=userService.findUserById(id);
//        model.addAttribute("user", user);
//        return "user/userEdit";
//    }
//
//    @RequestMapping("/edit")
//    public String edit(Book user) {
//        userService.edit(user);
//        return "redirect:/list";
//    }
//
//
//    @RequestMapping("/delete")
//    public String delete(Long id) {
//        userService.delete(id);
//        return "redirect:/list";
//    }
//}
