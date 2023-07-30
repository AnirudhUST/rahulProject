package com.Aspire.Company_Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountData {
    private String accountName;
    private String accountManager;
    private List<String> streams;
    private CompanyData company;
    private List<EmployeeData> employees;
}
