/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytestng;

/**
 *
 * @author tkhes
 */
public class BankMs {

    private String bank;
    private String branch;
    private String email;
    private int id;
    private int phone;

    @Override
    public String toString() {
        return "BankMs{" + "bank=" + bank + ", branch=" + branch + ", email=" + email + ", id=" + id + ", phone=" + phone + '}';
    }

    public BankMs(String bank, String branch, String email, int id, int phone) {
        this.bank = bank;
        this.branch = branch;
        this.email = email;
        this.id = id;
        this.phone = phone;
    }

    
    
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
}
