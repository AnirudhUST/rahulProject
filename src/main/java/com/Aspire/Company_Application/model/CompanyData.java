package com.Aspire.Company_Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyData {
    private String company;
    private CEOdata ceoDetails;
    private List<AccountData> accountDetails;
}
