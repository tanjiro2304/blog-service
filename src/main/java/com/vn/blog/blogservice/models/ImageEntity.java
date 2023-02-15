package com.vn.blog.blogservice.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BLOG_IMAGES_MAIN_PAGE")
public class ImageEntity {
    @Id
    @Column(name="ID")
    Long imageId;

    @Column(name="IMAGE")
    byte[] image;
}
