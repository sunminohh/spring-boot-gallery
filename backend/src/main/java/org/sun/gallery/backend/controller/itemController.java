package org.sun.gallery.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sun.gallery.backend.entity.Item;
import org.sun.gallery.backend.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class itemController {

    @Autowired
    ItemRepository  itemRepository;
    @GetMapping("/api/items")
    List<Item> getItems() {
        List<Item> items = itemRepository.findAll();

        return items;
    }
}
