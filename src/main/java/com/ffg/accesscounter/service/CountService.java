package com.ffg.accesscounter.service;

import org.springframework.stereotype.Service;

@Service
public interface CountService {

    public int returnAccessCounter(Integer id);

    public void addAccessCounter(Integer id);
}
