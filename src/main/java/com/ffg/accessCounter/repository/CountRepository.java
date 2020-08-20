package com.ffg.accessCounter.repository;

import com.ffg.accessCounter.entity.Count;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountRepository extends CrudRepository<Count,Integer>{

    @Query("select count from count where id = id")
    int findByAccessCounter(Integer id);

    @Modifying
    @Query("update count set count = count + 1 where id = id")
    void updateAccessCounter(Integer id);
}
