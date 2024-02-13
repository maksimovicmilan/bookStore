package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookRepository bRepo;
    public ResponseMessage save(Book b) {
        try {
            bRepo.save(b);
            ResponseMessage responseMessage = new ResponseMessage();
            return  responseMessage;
        }catch (Exception e){
            throw new RuntimeException(e.fillInStackTrace());
        }
    }
    public List<Book> getAllBooks(){
        try{
            bRepo.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.fillInStackTrace());
        }
        return (List<Book>) ResponseEntity.accepted();
    }

    public Book getBookById(int id) {
        return bRepo.findById(id).get();
    }
    public void test(){
        Book book = new Book();
    }
    public void deleteById(int id) {
        bRepo.deleteById(id);
    }

}
