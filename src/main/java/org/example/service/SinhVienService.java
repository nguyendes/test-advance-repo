package org.example.service;

import org.example.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private final List<SinhVien> sinhViens= new ArrayList<>();

    public SinhVien findSinhVienByCode(String ma){
        return sinhViens.stream().filter(sinhVien -> sinhVien.getMaSV().equalsIgnoreCase(ma)).findFirst().orElse(null);
    }
}
