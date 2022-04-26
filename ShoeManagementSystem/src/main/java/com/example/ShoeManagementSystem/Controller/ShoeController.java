
package com.example.ShoeManagementSystem.Controller;

import com.example.ShoeManagementSystem.Service.ShoeService;
import com.example.ShoeManagementSystem.bean.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoeController {

    @Autowired
    ShoeService shoeService;

    @PostMapping("/addShoe")
    Shoe addSho(@RequestBody Shoe shoe) {
        return shoeService.addShoe(shoe);
    }

    @GetMapping("/getAllShoe")
    List<Shoe> getAllSho() {
        return shoeService.getShoes();
    }

    @GetMapping("/getShoeByType/{shoType}")
    Shoe getShoeByType(@PathVariable("shoType") String shoType ) {
        return shoeService.getByShoType(shoType);
    }

    @GetMapping("/getByShoNo/{shoId}")
    Shoe getByShoNo(@PathVariable("shoId") long shoId) {
        return shoeService.getShoeId(shoId);
    }

    @PutMapping("/updateShoe")
    Shoe updateShoe(@RequestBody Shoe shoe) {
        return shoeService.updateSho(shoe);
    }

    @DeleteMapping("/deleteShoe")
    void deleteShoe(@RequestBody Shoe shoe) {
        shoeService.deleteSho(shoe);
    }

    @DeleteMapping("/deleteShoe/{shoNo}")
    void deleteShoById(@PathVariable("shoNo") long shoNo) {
        shoeService.deleteByShoNo(shoNo);
    }

}