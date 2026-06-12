package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }

    public List<Blog> findAll(){
        return blogRepository.findAll();
    }

    public void register (BlogForm form){
        blogRepository.save(new Blog(null, form.getTitle(),form.getNotes()));
    }

    public Optional<Blog> findById(Long id){
        return blogRepository.findById(id);
    }
}
