package org.example.entity;


import jakarta.persistence.*;
import lombok.*;
import org.example.dto.UserSignupDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity(name = "users")
@Data			// Getter Setter
@Builder		// DTO -> Entity화
@AllArgsConstructor	// 모든 컬럼 생성자 생성
@NoArgsConstructor	// 기본 생성자
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk; // pk

    @Column(nullable = false, unique = true)
    private String userId; // id

    //    @Column(name = "role_name", nullable = false, unique = true)
    @Column(nullable = false)
    private String password; // 비밀번호

    //    @Column(name = "active_yn", nullable = false)
    @Column(nullable = false)
    private String name; // 이름

    @Column(nullable = false)
    private  String phone; // 핸드폰 번호


    @ManyToOne()
    @JoinColumn(name= "lv")
    private Auth lv;

    @ManyToOne()
    @JoinColumn(name= "role_name")
    private Auth roleName;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
