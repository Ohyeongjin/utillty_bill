package org.example.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.dto.AuthDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "auth")
@Data			// Getter Setter
@Builder		// DTO -> Entity화
@AllArgsConstructor	// 모든 컬럼 생성자 생성
@NoArgsConstructor	// 기본 생성자
public class Auth {

    @Id
    @Column(name = "Lv",nullable = false,unique = true)
    private Long lv; // 권한 Lv

    @Column(name = "auth_name")
    private String authName; // 권한 code

    @Column(name = "role_name", nullable = false, unique = true)
    private String roleName; // 권한 이름

    @Column(name = "active_yn", nullable = false)
    private Boolean activeYn; // 가입 후 사용여부

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Transient
    public AuthDTO responses(){
      return new AuthDTO(
              getLv(),
              getAuthName(),
              getRoleName(),
              getActiveYn(),
              getCreatedAt(),
              getUpdatedAt()
        );
    }


}
