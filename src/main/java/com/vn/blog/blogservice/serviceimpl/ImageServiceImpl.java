package com.vn.blog.blogservice.serviceimpl;

import com.vn.blog.blogservice.converter.DtoConvertUtils;
import com.vn.blog.blogservice.dto.Image;
import com.vn.blog.blogservice.exceptions.ImageNotFoundException;
import com.vn.blog.blogservice.models.ImageEntity;
import com.vn.blog.blogservice.repository.ImageRepo;
import com.vn.blog.blogservice.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    ImageRepo imageRepo;
    @Override
    public Image findById(Long id) {
        if(id == null){
            throw new ImageNotFoundException("Invalid id please try again");
        }
        return DtoConvertUtils.convertImageEntityToDTO(Objects.requireNonNull(imageRepo.findById(id).orElse(null)));
    }
}
