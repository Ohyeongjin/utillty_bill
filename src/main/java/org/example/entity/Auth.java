package org.example.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.dto.AuthDTO;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "auth")
@Data			// Getter Setter
@Builder		// DTO -> Entity화
@AllArgsConstructor	// 모든 컬럼 생성자 생성
@NoArgsConstructor	// 기본 생성자
public class Auth {

    @Id
    @Column(name = "pk",nullable = false,unique = true)
    private Long pk; // pk

    //    @Column(name = "id", nullable = false, unique = true)
    @Column(name = "id" ,nullable = false, unique = true)
    private String id; // id

    //    @Column(name = "role_name", nullable = false, unique = true)
    @Column(name = "password",nullable = false)
    private String password; // 비밀번호

    //    @Column(name = "active_yn", nullable = false)
    @Column(name = "name",nullable = false)
    private String name; // 이름

    @Column(name = "birthday",nullable = false)
    private LocalDate birthday;  // 생년월일

    @Column(name = "date",nullable = false)
    private LocalDateTime date;  // 생성날짜

    @Column(name = "phoneNum",nullable = false)
    private  String phoneNum; // 핸드폰 번호

    @Transient
    public AuthDTO responses(){
      return new AuthDTO(
                getPk(),
                getId(),
                getPassword(),
                getName(),
                getBirthday(),
                getDate(),
                getPhoneNum()
        );
    }


}
