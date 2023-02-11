package com.vn.blog.blogservice.serviceimpl;

import com.vn.blog.blogservice.converter.DtoConvertUtils;
import com.vn.blog.blogservice.dto.BlogPost;
import com.vn.blog.blogservice.exceptions.BlogNotFoundException;
import com.vn.blog.blogservice.repository.BlogPostRepo;
import com.vn.blog.blogservice.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;

@Service
public class BlogPostServiceImpl implements BlogPostService {
    @Autowired
    private BlogPostRepo blogPostRepo;



    @Override
    public BlogPost findById(Long id) throws SQLException, IOException {
        if(id==null){
            throw new BlogNotFoundException("Blog Id not valid Please try Again...");
        }
        return DtoConvertUtils.convertBlogPostEntityToDTO(blogPostRepo.findById(id).get());
    }

}
