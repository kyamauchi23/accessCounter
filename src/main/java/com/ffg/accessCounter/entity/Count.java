package com.ffg.accessCounter.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Count {

    @Id
    private Integer id;

    private int count;
}
