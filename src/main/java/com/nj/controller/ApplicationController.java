package com.nj.controller;

import com.nj.data.ItemRepository;
import com.nj.model.Item;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ApplicationController {

    private static ItemRepository itemRepository;

    @GetMapping("/getAllProducts")
    public List<Item> getAllProducts(){
        return itemRepository.findAll();
    }
}
