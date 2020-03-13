package org.example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;


public class Department {
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    private  String deptName;
    private Date createdOn; // will use this at the end

    public void print()
     {
         System.out.println("Department name is "+this.deptName + "  "+this.createdOn );
     }
}
