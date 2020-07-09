package cn.ssm.service.impl;

import cn.ssm.dao.BookDao;
import cn.ssm.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("simpleBookService")
public class SimpleBookService implements IBookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public Book queryById(Long bookId) {
        return bookDao.queryById(bookId);
    }
}
