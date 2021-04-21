package com.gt.hruser.resources;

import com.gt.hruser.entities.User;
import com.gt.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<User> findByid(@PathVariable Long id){
        User obj = userRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
