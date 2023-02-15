package com.vn.blog.blogservice.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    private Long id;

    private byte[] image;
}
