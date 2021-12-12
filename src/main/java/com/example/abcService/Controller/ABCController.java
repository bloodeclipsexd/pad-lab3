package com.example.abcService.Controller;

import com.example.abcService.DAO.ABCDao;
import com.example.abcService.Entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController(value = "/users")
@RequestMapping("/users")
@Slf4j
public class ABCController {

    @Autowired
    public ABCDao dao;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") UUID id) {
        log.info("GET: /users/{}", id);
        return ResponseEntity.of(dao.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        log.info("GET: /users");
        return new ResponseEntity<>(dao.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User newUser) {
        log.info("POST: /users");
        newUser.setId(UUID.randomUUID());
        return new ResponseEntity<>(dao.save(newUser), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") UUID id) {
        log.info("DELETE: /users/{}", id);
        dao.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") UUID id, @RequestBody User user) {
        log.info("PUT: /users/{}", id);
        Optional<User> oldUser = dao.findById(id);
        if (oldUser.isEmpty())
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else {
            user.setId(id);
            dao.save(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }
}
