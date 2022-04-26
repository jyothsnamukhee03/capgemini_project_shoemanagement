package com.example.ShoeManagementSystem.repository;
import com.example.ShoeManagementSystem.bean.Shoe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeRepository extends CrudRepository<Shoe,Long> {
    Shoe findByShoType(String ShoType);

}