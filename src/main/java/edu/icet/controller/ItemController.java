package edu.icet.controller;

import edu.icet.model.dto.Item;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    final ItemService itemService;

    @GetMapping("itemInfo")
    public List<Item> getAll(){
        return itemService.getAll();

    }
}
