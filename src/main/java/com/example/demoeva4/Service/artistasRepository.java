package com.example.demoeva4.Service;

import com.example.demoeva4.Bean.artistasBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface artistasRepository extends CrudRepository<artistasBean, Integer> {

}
