package com.likelion.hospital.controller;

import com.likelion.hospital.dao.HospitalDao;
import com.likelion.hospital.domain.hospital.HospitalResDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hospitals")
public class HospitalController {
    private HospitalDao hospitalDao;

    public HospitalController(HospitalDao hospitalDao) {
        this.hospitalDao = hospitalDao;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HospitalResDTO> findById(@PathVariable("id") int id) {
        return ResponseEntity.ok(HospitalResDTO.from(hospitalDao.findById(id)));
    }
}
