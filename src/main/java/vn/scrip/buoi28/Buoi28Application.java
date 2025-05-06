//Học viên hoàn thiện các tính năng của user sau khi login:
//
//Header:
//
//Hiển thị tên (avatar) của user. Khi click vào sẽ có các menu như:
//Trang quản trị (với user có role ADMIN)

//Hồ sơ cá nhân
//Phim yêu thích
//Review:
//
//Backend:
//Sửa các user fix bằng việc lấy thông tin của user đang đăng nhập
//Front end:
//Nếu user chưa login -> Hiển thị message: Vui lòng đăng nhập để viết bình luận
//Nếu user đã login -> Hiển thị nút để viết bình luận, đồng thời hiển thị action: sửa, xóa với các bình luận của user

//Phim yêu thích:
//
//Làm tương tự như review
package vn.scrip.buoi28;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Buoi28Application {

	public static void main(String[] args) {
		SpringApplication.run(Buoi28Application.class, args);
	}

}







