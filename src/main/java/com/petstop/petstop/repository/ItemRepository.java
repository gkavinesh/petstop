package com.petstop.petstop.repository;

import com.petstop.petstop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item,Long> {
}
