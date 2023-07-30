package com.shiunchiu.dynamodbdemo.repository;

import com.shiunchiu.dynamodbdemo.model.User;
import java.util.Optional;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;


@EnableScan
public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findById(String id);

}
