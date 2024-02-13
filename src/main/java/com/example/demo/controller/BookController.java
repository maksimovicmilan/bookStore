package com.example.demo.controller;



import com.example.demo.entity.Book;
import com.example.demo.entity.MyBookList;
import com.example.demo.service.BookService;
import com.example.demo.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

 //SOAP //RESTFUL API || REST
@RestController
public class BookController {
    @Autowired
    private BookService service;
    @Autowired
    private MyBookListService myBookService;
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @PostMapping("/save")
    public ResponseEntity<?> addBook(@RequestBody Book book) {
            service.save(book);
        return null;
    }
//    @GetMapping("/my_books")
//    public String getMyBooks(Model model) {
//        List<MyBookList> list=myBookService.getAllMyBooks();
//        model.addAttribute("book", list);
//        return "myBooks";
//    }

//    @GetMapping("/mylist/{id}")
//    public String getMyList(@PathVariable("id") int id) {
//        Book b = service.getBookById(id);
//        MyBookList mb = new MyBookList(/* b.getImage(),*/ b.getId(), b.getName(), b.getAuthor(), b.getPrice());
//        myBookService.saveMyBooks(mb);
//        return "redirect:/my_books";
//    }

//    @PutMapping("/editBook/{id}")
//    public String editBook(@PathVariable("id") int id, Model model) {
//        Book b = service.getBookById(id);
//        model.addAttribute("book",b);
//        return "bookEdit";
//    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity deleteBook(@PathVariable("id") int id) {
        service.deleteById(id);
        return (ResponseEntity) ResponseEntity.ok(); //ok 200 https status
    }

}

