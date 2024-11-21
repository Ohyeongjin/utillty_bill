/*
package org.example.entity;


import jakarta.persistence.*;
import lombok.*;
import org.example.dto.AuthDTO;
import org.example.dto.UserDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


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
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk; // pk

    @Column(nullable = false, unique = true)
    private String id; // id

    //    @Column(name = "role_name", nullable = false, unique = true)
    @Column(nullable = false)
    private String password; // 비밀번호

    //    @Column(name = "active_yn", nullable = false)
    @Column(nullable = false)
    private String name; // 이름

    @Column(nullable = false)
    private  String phone; // 핸드폰 번호

    @Column(name= "role")
    @Convert(converter = StrategyCreator.class)
    private List<String> roles = new ArrayList<>();

    @CreationTimestamp
    @Column(name = "date_time")
    private LocalDateTime dateTime;  // 생성날짜

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

  */
/*  @Transient
    public UserDTO responses(){
        return new UserDTO(
                getPk(),
                getId(),
                getPassword(),
                getName(),

        );
    }*//*


}
*/
