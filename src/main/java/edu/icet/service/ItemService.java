package edu.icet.service;

import edu.icet.model.dto.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    List<Item> items=new ArrayList<>();

    public List<Item> getAll() {
        items.add(new Item("I001","Apple",100.00,true,""));
        items.add(new Item("I002","Orange",120.50,false,""));
        items.add(new Item("I003","Banana",50.70,true,""));

        return items;
    }
}
