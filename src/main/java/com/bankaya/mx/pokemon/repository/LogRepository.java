package com.bankaya.mx.pokemon.repository;

import com.bankaya.mx.pokemon.bean.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {
}
