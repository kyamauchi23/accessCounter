package com.ffg.accessCounter.service;

import com.ffg.accessCounter.repository.CountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountServiceImpl implements CountService{

    @Autowired
    CountRepository countRepository;


    @Override
    public int returnAccessCounter(int id) {
        int count = countRepository.findByAccessCounter(id);
        return count;
    }

    @Override
    @Transactional
    public void addAccessCounter(int id){
        countRepository.updateAccessCounter(id);
    }
}
