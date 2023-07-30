package com.shiunchiu.dynamodbdemo.controller;

import com.shiunchiu.dynamodbdemo.model.User;
import com.shiunchiu.dynamodbdemo.repository.UserRepository;
import java.util.Date;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class WebController {

  private final UserRepository userRepository;

  @PostMapping("/users")
  public ResponseEntity<User> createUser(@RequestBody User user) {
    user.setCreateAt(new Date());
    User newUser = userRepository.save(user);

    return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
  }


  @GetMapping("/users/{userId}")
  public ResponseEntity<Optional<User>> getUserById(@PathVariable String userId) {
    Optional<User> user = userRepository.findById(userId);

    return ResponseEntity.status(HttpStatus.OK).body(user);
  }

}
