package com.Aspire.Company_Application.service;

import com.Aspire.Company_Application.model.AccountData;
import com.Aspire.Company_Application.model.CompanyData;
import com.Aspire.Company_Application.model.EmployeeData;
import com.Aspire.Company_Application.model.EmployeeList;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AspireService {
    @Autowired
    private  ObjectMapper objectMapper;
    public  List<EmployeeList> getDeveloper() throws IOException {
        CompanyData c = objectMapper.readValue(new File("src/main/Structure.json"), CompanyData.class);
        List<AccountData> acc = c.getAccountDetails();
        List<EmployeeData> e= null;
        List<EmployeeList> empdetls=new ArrayList<>();
        for(AccountData a:acc){
            e=a.getEmployees();
            for(EmployeeData e1:e){
                if(e1.getDesignation().equals("Developer")){

                    empdetls.add(new EmployeeList(e1.getId(),e1.getName(),e1.getStream(),e1.getDesignation(),a.getAccountName(),a.getAccountManager()));

                }

            }

        }
        return empdetls;
    }

    public List<String>getAccounts() throws IOException {
        CompanyData c = objectMapper.readValue(new File("src/main/Structure.json"), CompanyData.class);
        List<AccountData> acc = c.getAccountDetails();
        List<String> accname =new ArrayList<>();
        for (AccountData a:acc) {
            accname.add(new String(a.getAccountName()));
        }
        return accname;

    }
}
