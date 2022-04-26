package com.example.ShoeManagementSystem.Service;

import com.example.ShoeManagementSystem.bean.Shoe;
import com.example.ShoeManagementSystem.repository.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoeService {

    @Autowired(required = false)
    ShoeRepository shoeRepository;

    public Shoe addShoe(Shoe shoe) {
        return shoeRepository.save(shoe);
    }

    public List<Shoe> getShoes() {
        List<Shoe> shoeList = new ArrayList<>();
        shoeRepository.findAll().forEach(x -> shoeList.add(x));
        return shoeList;
    }

    public Shoe getShoeId(long id) {
        return shoeRepository.findById(id).get();
    }

    public Shoe getByShoType(String type) {
        return shoeRepository.findByShoType(type);
    }

    public Shoe updateSho(Shoe shoe) {
        return shoeRepository.save(shoe);
    }

    public void deleteSho(Shoe shoe) {
        shoeRepository.delete(shoe);
    }

    public void deleteByShoNo(long shoNo) {
        shoeRepository.deleteById(shoNo);
    }
}
