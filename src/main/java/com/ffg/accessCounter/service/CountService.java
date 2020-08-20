package com.ffg.accessCounter.service;

import com.ffg.accessCounter.repository.CountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CountService {

    public int returnAccessCounter(int id);

    public void addAccessCounter(int id);
}
