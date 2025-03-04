package com.lephuquan.dev.demo_attributes_in_entities.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_file_media")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Tên file hoặc media
    @Column(nullable = false)
    private String fileName;

    // Đường dẫn lưu trữ file trong hệ thống
    @Column(nullable = false)
    private String filePath;

    // Loại file (image, video, audio, document, zip, etc.)
    @Column(nullable = false)
    private String fileType;

    // Kích thước file (tính theo byte)
    @Column(nullable = false)
    private Long fileSize;

    // MIME Type (VD: image/jpeg, video/mp4)
    @Column(nullable = false)
    private String mimeType;


    // Loại nội dung (VD: thumbnail, main content, etc.)
    @Column
    private String contentType;

    @ManyToOne
    private MainAttributesContainer mainAttributesContainer;

}