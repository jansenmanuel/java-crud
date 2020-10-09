package com.belajar.javacrud.service;

import com.belajar.javacrud.entity.Siswa;
import com.belajar.javacrud.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiswaService {
    @Autowired
    private SiswaRepository siswaRepository;

    public Siswa saveSiswa(Siswa siswa){
        return siswaRepository.save(siswa);
    }

    public List<Siswa> saveSiswas(List<Siswa> siswas){
        return siswaRepository.saveAll(siswas);
    }

    public List<Siswa> getSiswas(){
        return siswaRepository.findAll();
    }

    public Siswa getSiswaById(int id){
        return siswaRepository.findById(id).orElse(null);
    }

    public String deleteSiswa(int id){
        siswaRepository.deleteById(id);
        return "Data siswa berhasil dihapus";
    }
}
