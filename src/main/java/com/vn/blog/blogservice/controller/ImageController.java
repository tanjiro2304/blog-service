package com.vn.blog.blogservice.controller;

import com.vn.blog.blogservice.dto.Image;
import com.vn.blog.blogservice.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @Autowired
    ImageService imageService;

    @GetMapping("/findImageById/{id}")
    public byte[] findById(@PathVariable("id") Long id){
        return imageService.findById(id).getImage();
    }
}