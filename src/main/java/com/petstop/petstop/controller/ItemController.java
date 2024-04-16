package com.petstop.petstop.controller;

import com.petstop.petstop.entity.Item;
import com.petstop.petstop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ItemController {

    private final  ItemService itemService;

    @PostMapping("/item")
    public Item postItem(@RequestBody Item item){
        return itemService.postItem(item);
    }



}
