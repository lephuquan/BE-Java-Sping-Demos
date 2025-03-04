package com.lephuquan.dev.demo_attributes_in_entities.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/main-attributes")
public class MainAttributesController {

    // POST method to receive MainAttributesContainerDTO
    @PostMapping("/create")
    public ResponseEntity<?> createMainAttributesContainer(@RequestBody @Valid MainAttributesContainerDTO dto) {
        // Xử lý dto, lưu vào cơ sở dữ liệu hoặc thực hiện các thao tác khác
        System.out.println("Received MainAttributesContainerDTO: " + dto);

        // Trả về phản hồi thành công
        return ResponseEntity.ok("Successfully received and processed the MainAttributesContainerDTO");
    }

//    // PUT method to update MainAttributesContainerDTO
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> updateMainAttributesContainer(
//            @PathVariable Long id,
//            @RequestBody @Valid MainAttributesContainerDTO dto) {
//        // Xử lý cập nhật, lưu vào cơ sở dữ liệu hoặc thực hiện các thao tác khác
//        System.out.println("Updated MainAttributesContainerDTO with ID " + id + ": " + dto);
//
//        // Trả về phản hồi thành công
//        return ResponseEntity.ok("Successfully updated the MainAttributesContainerDTO with ID " + id);
//    }
//
//    // GET method to fetch MainAttributesContainerDTO
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getMainAttributesContainer(@PathVariable Long id) {
//        // Lấy dữ liệu từ cơ sở dữ liệu hoặc nguồn khác theo id
//        MainAttributesContainerDTO dto = new MainAttributesContainerDTO();  // Giả sử đây là dữ liệu lấy được
//        dto.setText("Sample text");
//
//        return ResponseEntity.ok(dto);
//    }
}
