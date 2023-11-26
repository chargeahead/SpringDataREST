package com.example.demo.repositories;

import com.example.demo.model.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsInterface  extends CrudRepository<Items,Integer> {
}
