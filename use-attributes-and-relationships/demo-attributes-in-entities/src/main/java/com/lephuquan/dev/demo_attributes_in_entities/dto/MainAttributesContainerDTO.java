package com.lephuquan.dev.demo_attributes_in_entities.dto;
import com.lephuquan.dev.demo_attributes_in_entities.entities.enums.EStatus;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MainAttributesContainerDTO {

    // Basic attributes
    private String text;
    private Integer integerValue;
    private Long longValue;
    private Boolean booleanValue;

    // Collections
    private List<String> listVStrings;  // List of Strings
    private Set<String> uniqueItems;    // Set of unique items
    private Map<String, String> settings; // Key-value configuration

    // Time attributes
    private LocalDate dateValue;
    private LocalTime timeValue;
    private LocalDateTime localDateTimeValue;
    private String durationValue; // String to make duration easier to parse
    private String timeZone; // String to allow for flexibility in ZoneId

    // Slug and other generated fields (optional in requests)
    private String slug;
    private String shardKey;

    // Base64 or binary
    private String fileBase64;

    // Enum
    private EStatus status;

    // Validation with regex
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid email format")
    private String emailRegex;

    // UUID
    private UUID uniqueId;

    // Files: List of associated FileMediaDTO objects
    private List<FileMediaDTO> fileMedia;

    // Relationships (ID or data from related objects)
    private Long relatedId;
    private List<Long> childIds;
    private Set<Long> manyToManyIds;
    private Long parentId;
}