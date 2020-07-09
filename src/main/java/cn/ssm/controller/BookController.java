package cn.ssm.controller;

import cn.ssm.pojo.Book;
import cn.ssm.service.impl.IBookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BookController {
    @Resource(name = "simpleBookService")
    IBookService bookService;
    @RequestMapping("/queryBook/{bookId}")
    @ResponseBody
    public Book queryBookById(@PathVariable Long bookId){
        Book book = bookService.queryById(bookId);
        return book;
    }

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }
}
