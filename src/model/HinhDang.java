/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GIGABYTE
 */
public class HinhDang {
    private int id;
    private String loai_hinh_dang;
    
    public Object[] toDataRow(){
        return new Object[]{this.id, this.loai_hinh_dang};
    }

    public HinhDang() {
    }

    public HinhDang(String loai_hinh_dang) {
        this.loai_hinh_dang = loai_hinh_dang;
    }
    

    public HinhDang(int id, String loai_hinh_dang) {
        this.id = id;
        this.loai_hinh_dang = loai_hinh_dang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoai_hinh_dang() {
        return loai_hinh_dang;
    }

    public void setLoai_hinh_dang(String loai_hinh_dang) {
        this.loai_hinh_dang = loai_hinh_dang;
    }
    
    
}
