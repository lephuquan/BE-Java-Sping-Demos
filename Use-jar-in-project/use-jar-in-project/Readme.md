1. Các bước dựng dự án
   1. Tạo dự án ở https://start.spring.io/index.html với dự án Jar
   2. Thêm spring-boot-starter-web dependency vào pom.xml
   3. tạo các packages
   3. Tạo và code class service -> tạo và code class controller
2. Các bước chạy dự án
   1. Chạy trong CMD dự án với: mvn clean package (cần có cài đặt môi trường java và maven trước)
   2. Chạy trong CMD dự án với: java -jar target/use-jar-in-project-0.0.1-SNAPSHOT.jar
   3. Mở trình duyệt và truy cập cURL: http://localhost:8080/hello?name=SpringBoot
   4. Note: có thể dùng nút clean và package của Lifecycle của maven để thay thế mvn clean package, 
      tuy nhiên cần kiểm tra plugin (pring-boot-maven-plugin) ở pom.xml
3. Kiến thức nhận được từ dự án
   1. Xác định được các thành phần và cách tạo file jar và chạy trong dự án
   2. Ứng dụng đóng gói bằng jar là độc lập mà không cần triển khai trên server(tomcat) như war
   3. Không cần config để phù hợp với server
   4. Run bằng main Application là sử dụng tài nguyên của thư mục dự án, 
   run bằng jar là đóng gói ứng dụng và chạy ứng dụng đã đóng gói