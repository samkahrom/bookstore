package bookstore.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.haagahelia.course.domain.DepartmentRepository;
import fi.haagahelia.course.domain.Student;
import fi.haagahelia.course.domain.StudentRepository;

@Controller
public class BookController {
	@Autowired
	private StudentRepository repository; 

	@Autowired
	private DepartmentRepository drepository; 
	
	// 
    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(Book book) {	
        repository.save(book);
        return "redirect:booklist";
    }
  
	// RESTful service to 
    @RequestMapping(value="/delete", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("id") Long bookId, Model model) {
    	repository.delete(bookId);
    	return "redirect:booklist";
    }    

    @RequestMapping(value="/modify/{id}", method = RequestMethod.GET)
    public String modifyBook(@PathVariable("id") Long bookId, Model model) {	
    	Book book = repository.findOne (bookId);
    	model.addAttribute("book", book);
    	return "modifybook";
    }       
    

}
