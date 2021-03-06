package com.example.popla.gorkhavidyutpowerpay.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "COMPLAINT__DETAILS".
 */
@Entity
public class Complaint_Details {

    @Id(autoincrement = true)
    private Long Complaint_Id;
    private String K_No;
    private String Login_by;
    private String Submit_Date;
    private String comp_Msg;
    private String Status;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Complaint_Details() {
    }

    public Complaint_Details(Long Complaint_Id) {
        this.Complaint_Id = Complaint_Id;
    }

    @Generated
    public Complaint_Details(Long Complaint_Id, String K_No, String Login_by, String Submit_Date, String comp_Msg, String Status) {
        this.Complaint_Id = Complaint_Id;
        this.K_No = K_No;
        this.Login_by = Login_by;
        this.Submit_Date = Submit_Date;
        this.comp_Msg = comp_Msg;
        this.Status = Status;
    }

    public Long getComplaint_Id() {
        return Complaint_Id;
    }

    public void setComplaint_Id(Long Complaint_Id) {
        this.Complaint_Id = Complaint_Id;
    }

    public String getK_No() {
        return K_No;
    }

    public void setK_No(String K_No) {
        this.K_No = K_No;
    }

    public String getLogin_by() {
        return Login_by;
    }

    public void setLogin_by(String Login_by) {
        this.Login_by = Login_by;
    }

    public String getSubmit_Date() {
        return Submit_Date;
    }

    public void setSubmit_Date(String Submit_Date) {
        this.Submit_Date = Submit_Date;
    }

    public String getComp_Msg() {
        return comp_Msg;
    }

    public void setComp_Msg(String comp_Msg) {
        this.comp_Msg = comp_Msg;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
