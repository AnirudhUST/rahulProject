package com.Aspire.Company_Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeData {
    private Long id;
    private String name;
    private Long managerId;
    private String stream;
    private String designation;
    private int yearsOfExperience;
}
