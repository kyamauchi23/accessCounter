package com.ffg.accesscounter.service;

import com.ffg.accesscounter.repository.CountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountServiceImpl implements CountService{

    private final CountRepository countRepository;

    public CountServiceImpl(CountRepository countRepository){
        this.countRepository=countRepository;
    }

    @Override
    public int returnAccessCounter(Integer id) {
        return countRepository.findByAccessCounter(id);
    }

    @Override
    @Transactional
    public void addAccessCounter(Integer id){
        countRepository.updateAccessCounter(id);
    }
}
