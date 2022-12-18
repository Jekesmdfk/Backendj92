package com.example.demoeva4.Service;

import com.example.demoeva4.Bean.clienteDiegoBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteDiegoRepository extends CrudRepository<clienteDiegoBean, Integer> {
}
