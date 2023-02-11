package com.vn.blog.blogservice.service;


import com.vn.blog.blogservice.dto.BlogPost;

import java.io.IOException;
import java.sql.SQLException;

public interface BlogPostService {
    BlogPost findById(Long id) throws SQLException, IOException;
}
