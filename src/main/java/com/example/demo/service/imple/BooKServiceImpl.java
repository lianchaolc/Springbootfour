//package com.example.demo.service.imple;
//
//import com.example.demo.bean.BookUser;
//import com.example.demo.mapper.BookMapper;
//import com.example.demo.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

//@Service
//public class BooKServiceImpl implements BookService {
//    @Autowired
//    private BookMapper userRepository;
//    @Override
//    public Page<BookUser> getUserList(int pageNum, int pageSize) {
//        Sort sort = new Sort(Sort.Direction.DESC, "id");
//        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
//        Page<BookUser> users = userRepository.findAll(pageable);
//
//        return users;
//    }

//    @Override
//    public Book findUserById(long id) {
//        return userRepository.findById(id);
//    }
//
//    @Override
//    public void save(Book user) {
//        userRepository.save(user);
//    }
//
//    @Override
//    public void edit(Book user) {
//        userRepository.save(user);
//    }
//
//    @Override
//    public void delete(long id) {
//        userRepository.deleteById(id);
//    }
//}
