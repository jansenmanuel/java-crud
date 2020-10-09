package com.belajar.javacrud.controller;

import com.belajar.javacrud.entity.Siswa;
import com.belajar.javacrud.service.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SiswaController {
    @Autowired
    private SiswaService siswaService;

    @PostMapping("/addSiswa")
    public Siswa addSiswa(@RequestBody Siswa siswa){
        return siswaService.saveSiswa(siswa);
    }

    @PostMapping("/addSiswas")
    public List<Siswa> addSiswas(@RequestBody List<Siswa> siswas){
        return siswaService.saveSiswas(siswas);
    }

    @GetMapping("/siswa")
    public List<Siswa> findAllSiswa(){
        return siswaService.getSiswas();
    }

    @GetMapping("/siswaById/{id}")
    public Siswa findSiswaById(@PathVariable  int id){
        return siswaService.getSiswaById(id);
    }

    @PutMapping("/updateSiswa/{id}")
    public Siswa updateSiswa(@RequestBody Siswa siswa){
        return siswaService.saveSiswa(siswa);
    }

    @DeleteMapping("/deleteSiswa/{id}")
    public String deleteSiswa(@PathVariable int id){
        return siswaService.deleteSiswa(id);
    }

}
