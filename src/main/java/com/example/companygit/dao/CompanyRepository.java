package com.example.companygit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<CompanyEntity,Long> {

    void deleteByName(String name);

    Optional<CompanyEntity> findCompanyEntityByName(String existingName);
}
