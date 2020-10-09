package com.belajar.javacrud.repository;

import com.belajar.javacrud.entity.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiswaRepository extends JpaRepository<Siswa, Integer> {
}
