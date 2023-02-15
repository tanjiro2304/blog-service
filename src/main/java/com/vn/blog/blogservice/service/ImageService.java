package com.vn.blog.blogservice.service;

import com.vn.blog.blogservice.dto.Image;
import com.vn.blog.blogservice.models.ImageEntity;

public interface ImageService {
    Image findById(Long id);
}
