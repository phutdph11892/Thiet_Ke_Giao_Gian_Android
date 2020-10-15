package com.example.lap6sqlite.model;

public class Product {
    protected String maSP;
    protected String tenSP;
    protected String soLuongSP;

    public Product() {

    }

    public Product(String maSP, String tenSP, String soLuongSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuongSP = soLuongSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(String soLuongSP) {
        this.soLuongSP = soLuongSP;
    }
}
