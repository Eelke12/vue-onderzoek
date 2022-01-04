package com.example.testvue.item;

import com.example.testvue.item.model.Item;
import com.example.testvue.item.model.RequestItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items;

    public ItemService() {
        this.items = new ArrayList<>();
        items.add(new Item(1L, "testitem", "test@gmail.com", "testUsername"));
        items.add(new Item(2L, "testitem2", "test@gmail.com", "testUsername"));
        items.add(new Item(3L, "testitem3", "test@gmail.com", "testUsername"));
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Item> saveItem(RequestItem requestItem) {
        Item item = new Item(
            4L,
            requestItem.getName(),
            requestItem.getEmail(),
            requestItem.getUsername()
        );

        items.add(item);
        return items;
    }
}
