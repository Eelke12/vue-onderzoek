package com.example.testvue.item;

import com.example.testvue.item.model.Item;
import com.example.testvue.item.model.RequestItem;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @PostMapping
    public List<Item> saveItem(@RequestBody RequestItem requestItem) {
        return itemService.saveItem(requestItem);
    }
}
