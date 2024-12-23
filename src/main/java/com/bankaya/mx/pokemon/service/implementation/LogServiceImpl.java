package com.bankaya.mx.pokemon.service.implementation;

import com.bankaya.mx.pokemon.bean.Log;
import com.bankaya.mx.pokemon.repository.LogRepository;
import com.bankaya.mx.pokemon.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogRepository logRepository;

    public void save (final Log log) {
        this.logRepository.save(log);
    }
}
