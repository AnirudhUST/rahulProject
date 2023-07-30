package com.Aspire.Company_Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeList {
    private Long id;
    private String name;
    private String stream;
    private String designation;
    private String accountName;
    private String accountManager;

}
