package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Transnacional;

public interface TransnacionalRepository extends JpaRepository<Transnacional, Integer> {

}
