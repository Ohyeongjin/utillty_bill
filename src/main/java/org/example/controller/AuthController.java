package org.example.controller;



import org.example.dto.AuthDTO;
import org.example.entity.Auth;
import org.example.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    // 회원권한
    @PostMapping("/auth")
    public ResponseEntity<Auth> registerAuth(@RequestBody AuthDTO authDTO) {
        Auth newUser = authService.set(authDTO);
        return ResponseEntity.ok(newUser);
    }
/*
    // user info
    @GetMapping("/users/{pk}")
    public ResponseEntity<AuthDTO> getUserByPk(@PathVariable Long pk) {

        Optional<Auth> user = authService.getUserByPk(pk);

        return user.map(u -> {
            AuthDTO authDTO = new AuthDTO(u.getPk(), u.getId(), u.getPassword(), u.getName(), u.getBirthday(), u.getDate(), u.getPhoneNum());
            return ResponseEntity.ok(authDTO);
        }).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));


    }

    // user update
    @PutMapping("/users/{pk}")
    public ResponseEntity<Auth> registerAuth(@PathVariable Long pk,@RequestBody Auth auth) {
       Optional<Auth> updateUser =  authService.updateUser(pk,auth);
       return  updateUser.map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());

    }

    // user delete
    @DeleteMapping("/users/{pk}")
    public ResponseEntity<Auth> deleteMember(@PathVariable Long pk) {
        authService.deleteUser(pk);
        return ResponseEntity.noContent().build();
    }*/

    //
/*    @PostMapping("/login")
    private ResponseEntity<String> doLogin(@RequestParam String id, @RequestParam String password){
         Auth user = loginService.getLoging(id,password);
        return ResponseEntity.ok("로그인 성공 id:" + id + "password"+ password );
    }*/
}
