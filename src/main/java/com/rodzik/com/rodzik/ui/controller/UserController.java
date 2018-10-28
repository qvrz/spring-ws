package com.rodzik.com.rodzik.ui.controller;

import com.rodzik.com.rodzik.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users") //http://localhost:8080/users
public class UserController {

    @GetMapping(path="/{userID}")
    public UserRest getUser(@PathVariable String userID)
    {
        UserRest returnValue=new UserRest();
        returnValue.setEmail("test@test.pl");
        returnValue.setFirstName("Tomasz");
        returnValue.setLastName("Rodzik");
        returnValue.setUserId("0");
        return returnValue;
    }
    @GetMapping()
    public String getUsers(@RequestParam(value="page", defaultValue = "1") int page,
                           @RequestParam(value="limit", defaultValue = "50") int limit,
                           @RequestParam(value="sort", defaultValue= "desc", required = false) String sort)
    {
        return "getUsers method called with page: " +page+ "and limit: " +limit;
    }
    @PostMapping
    public String createUser()
    {
        return "createUser method was called";
    }
    @PutMapping
    public String updateUser()
    {
        return "updateUser method was called";
    }
    @DeleteMapping
    public String deleteUser()
    {
        return "deleteUser method was called";
    }
}
