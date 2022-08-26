package com.bookstore.demo.Controller;

import com.bookstore.demo.Services.UserService;
import com.bookstore.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

//initial commit

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/postUser")
    public ResponseEntity<?> register(@RequestBody User user){
        userService.registerAUser(user);
        return ResponseEntity.ok().body(user);
    }

    @PutMapping("/ınsertUser/{id}")
    public ResponseEntity<?> update(@PathVariable("id") User id, @RequestBody User user) {
        User userUpdate = userService.registerAUser(id);
        return ResponseEntity.ok().body(userUpdate);

    }
    @GetMapping("/getUser")
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<?> delete(@PathVariable()long id) {
        userService.delete(id);
        return ResponseEntity.ok().body("İşlem Tamamlandı.");

    }

}
