package com.lephuquan.dev.demo_attributes_in_entities.entities;

import com.lephuquan.dev.demo_attributes_in_entities.entities.enums.EStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.*;
import java.util.*;


@Entity
@Table(name = "tbl_main_attributes_container")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MainAttributesContainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Basic
    private Long id;
    private String text;
    private Integer integerValue;
    private Long longValue;
    private Boolean booleanValue;


    //Collections
    @ElementCollection
    private List<String> listVStrings;
    @ElementCollection
    private Set<String> uniqueItems;
    @ElementCollection
    private Map<String, String> settings;

    //Time
    private LocalDate dateValue;
    private LocalTime timeValue;
    private LocalDateTime localDateTimeValue;
    private Duration durationValue;
    private ZoneId timeZone;


    //Attributes need to process before saving
    private String slug;// Slug: Định danh dạng văn bản (URL-friendly)
    private String shardKey;// Shard Key: Dùng cho phân mảnh dữ liệu
    private String encryptedField;// Encrypted Field: Trường được mã hóa
    private String hashedField;// Hashed Field: Trường băm
    @Transient
    private Double calculatedValue;// Formula Field: Trường tính toán tự động


    //Các kiểu dữ liệu được lưu vào DB
    @Lob
    private String jsonField;// JSON Field: Lưu JSON trong cột cơ sở dữ liệu
    @Lob
    private String xmlField;// XML Field: Lưu XML trong cột cơ sở dữ liệu


    //Tệp với base64
    private String fileBase64;
    // Enum: Danh sách các giá trị cố định // Enum for Status
    @Enumerated(EnumType.STRING)
    private EStatus status;
    // Regular Expressions: Trường kiểm tra định dạng với regex
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid email format")
    private String emailRegex;
    // UUID: Mã định danh duy nhất
    private UUID uniqueId;
    // Binary/Blob Data: Dữ liệu nhị phân trong database
    @Lob
    private byte[] binaryData;


    // File attribute, thuộc tính cần bảng riêng để chứa ca thông tin quan trọng của 1 file media
    @OneToMany(mappedBy = "mainAttributesContainer", cascade = CascadeType.ALL)
    private List<FileMedia> fileMedia;

    // 1-1 Relationship: Quan hệ một-một
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Related related;

    // 1-N Relationship: Quan hệ một-nhiều
    @OneToMany(mappedBy = "mainAttributesContainer", cascade = CascadeType.ALL)
    private List<Child> child;

    // N-N Relationship: Quan hệ nhiều-nhiều
    @ManyToMany
    @JoinTable(
            name = "main_attributes_another",
            joinColumns = @JoinColumn(name = "main_attributes_id"),
            inverseJoinColumns = @JoinColumn(name = "another_id"))
    private Set<Another> manyToMany;

    // N-1 Relationship: Quan hệ nhiều-một
    @ManyToOne(cascade = CascadeType.ALL)
    private Parent parent;

}
