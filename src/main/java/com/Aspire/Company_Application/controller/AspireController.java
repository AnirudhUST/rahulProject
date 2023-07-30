package com.Aspire.Company_Application.controller;

import com.Aspire.Company_Application.model.EmployeeList;
import com.Aspire.Company_Application.service.AspireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/aspire")
public class AspireController {

    @Autowired
    private AspireService service;


    @GetMapping("/listofdevelopers")
    public ResponseEntity<List<EmployeeList>> findDeveloper() throws IOException {
        return ResponseEntity.ok(service.getDeveloper());
    }

    @GetMapping("/listofaccounts")
    public ResponseEntity<List<String>> findAccounts() throws IOException {
        return ResponseEntity.ok(service.getAccounts());
    }


}
