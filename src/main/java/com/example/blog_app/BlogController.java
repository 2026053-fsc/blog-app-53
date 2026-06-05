package com.example.blog_app;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BlogController {
   public class BlogController {
   private final BlogRepository blogRepository;

   public BlogRepository(BlogRepository blogRepository){
    this.blogRepository = blogRepository;
   }

   @GetMapping("/blogs")
   public String blogs(Model model){
    model.addAttribute("blogs",blogsRepository.fimdAll());
    return "blogs";
   }
   }
    
}
 // @GetMapping("/blogs")
    // public String blog() {
    //     return "blogs";
    // }