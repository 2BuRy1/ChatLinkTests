package ru.montana.spring.testoffrontandback.controllers;


import jakarta.servlet.http.HttpServletRequest;
import ru.montana.spring.testoffrontandback.models.Piktovec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.montana.spring.testoffrontandback.service.ShowPict;



@RestController
@RequestMapping("/auth")
public class FirstControler {

    @Autowired
    ShowPict showPict;

    @GetMapping("/login")
    public ResponseEntity<String> login(HttpServletRequest request) {
        Piktovec piktovec = new Piktovec(request.getParameter("username"), request.getParameter("password"));
        System.out.println(piktovec);

        return ResponseEntity.ok(piktovec.toString());
    }


}
