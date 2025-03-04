package com.lephuquan.dev.demo_attributes_in_entities.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileMediaDTO {

    private Long id; // ID của file (nếu cần để chỉnh sửa)
    private String fileName; // Tên file
    private String filePath; // Đường dẫn lưu trữ (nếu cần gửi lại cho client)
    private String fileType; // Loại file (image, video, audio, etc.)
    private Long fileSize; // Kích thước file (bytes)
    private String mimeType; // MIME Type (VD: image/jpeg)
    private String contentType; // Loại nội dung (thumbnail, etc.)
    private Long mainAttributesContainerId; // ID của MainAttributesContainer liên kết
}