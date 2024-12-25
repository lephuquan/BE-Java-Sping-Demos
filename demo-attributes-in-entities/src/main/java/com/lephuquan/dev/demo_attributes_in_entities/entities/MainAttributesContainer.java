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
    private Long id;

    // String: Văn bản
    private String text;

    // Integer: Số nguyên
    private Integer integerValue;

    // Long: Số nguyên lớn
    private Long longValue;

    // Boolean: Giá trị đúng/sai
    private Boolean booleanValue;

    // Enum: Danh sách các giá trị cố định // Enum for Status
    @Enumerated(EnumType.STRING)
    private EStatus status;

    // List/Array: Danh sách các giá trị (VD: danh sách file)
    @ElementCollection
    private List<String> fileList;

    // Set: Tập hợp các giá trị không trùng lặp
    @ElementCollection
    private Set<String> uniqueItems;

    // Date: Ngày
    private LocalDate dateValue;

    // Time: Thời gian
    private LocalTime timeValue;

    // LocalDateTime: Ngày giờ cục bộ
    private LocalDateTime localDateTimeValue;

    // Duration: Khoảng thời gian giữa hai mốc
    private Duration durationValue;

    // TimeZone: Dữ liệu múi giờ
    private ZoneId timeZone;

    // Single File: Tệp đơn
    private String singleFile;

    // List of Files: Danh sách tệp
    @ElementCollection
    private List<String> listOfFiles;

    // File Base64: File mã hóa Base64
    private String fileBase64;

    // Thumbnails: Ảnh thu nhỏ từ video hoặc ảnh
    @ElementCollection
    private List<String> thumbnails;

    // Zip Files: Nén và giải nén file
    private String zipFile;

    // Temporary Files: File tạm thời
    private String tempFile;

    // List Of Image: Ảnh
    @ElementCollection
    private List<String> listOfImages;

    // List Of Video: Video
    @ElementCollection
    private List<String> listOfVideos;

    // List Of Audio: Âm thanh
    @ElementCollection
    private List<String> listOfAudios;

    // UUID: Mã định danh duy nhất
    private UUID uniqueId;

    // Slug: Định danh dạng văn bản (URL-friendly)
    private String slug;

    // Shard Key: Dùng cho phân mảnh dữ liệu
    private String shardKey;

    // Encrypted Field: Trường được mã hóa
    private String encryptedField;

    // Hashed Field: Trường băm
    private String hashedField;

    // Token: Mã token (JWT, API key)
    private String token;

    // Currency Field: Trường lưu tiền tệ
    private Double amount;
    private String currency;

    // Formula Field: Trường tính toán tự động
    @Transient
    private Double calculatedValue;

    // Geo-location: Kinh độ, vĩ độ
    private Double latitude;
    private Double longitude;

    // Address Field: Địa chỉ với các trường riêng
    private String country;
    private String city;
    private String postalCode;

    // JSON Field: Lưu JSON trong cột cơ sở dữ liệu
    @Lob
    private String jsonField;

    // XML Field: Lưu XML trong cột cơ sở dữ liệu
    @Lob
    private String xmlField;

    // Regular Expressions: Trường kiểm tra định dạng với regex
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid email format")
    private String emailRegex;

    // Binary/Blob Data: Dữ liệu nhị phân trong database
    @Lob
    private byte[] binaryData;

    // Map: Dữ liệu dạng key-value
    @ElementCollection
    private Map<String, String> settings;

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
