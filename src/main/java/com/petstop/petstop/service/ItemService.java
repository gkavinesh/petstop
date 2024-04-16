package com.petstop.petstop.service;

import lombok.RequiredArgsConstructor;
import com.petstop.petstop.entity.Item;
import com.petstop.petstop.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Item postItem(Item item){
        return itemRepository.save(item);
    }

}
