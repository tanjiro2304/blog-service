package com.vn.blog.blogservice.repository;


import com.vn.blog.blogservice.models.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<ImageEntity, Long> {
}

