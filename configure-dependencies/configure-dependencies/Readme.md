Các bước chạy dự án
    -- Không chạy dự án, chỉ đọc hiểu file pom.xml
Kiến thức nhận được từ dự án
    1. Xác định được các thành phần của file cấu hình
    2. Rõ được các mục đính của từng thành phần trong cấu hình 
    3. Spring Boot có một BOM (Bill of Materials) được định nghĩa trong spring-boot-starter-parent
    4. Với các dependencies thuộc spring boot (spring-boot-starter-data-jpa,spring-boot-starter-web,..) ta 
        không cần khai báo version vì spring-boot-starter-parent sẽ tự động tìm và sử dụng phiên bản của 
        dependency phù hợp với phiên bản spring boot đang sử dụng
    5. Với các thư viện không thuộc hệ sinh thái pring boot như org.apache.poi cần phải thêm version cụ thể 
        hoặc phù hợp vì nó không nằm trong hệ sinh thái của spring boot