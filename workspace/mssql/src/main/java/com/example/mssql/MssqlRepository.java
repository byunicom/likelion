package com.example.mssql;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MssqlRepository extends JpaRepository<Mssql, String> {
    List<Mssql> findByItemCd(String itemCd);
}
