package com.laioffer.twitch.item;


import com.laioffer.twitch.model.TypeGroupedItemList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {


    private final com.laioffer.twitch.item.ItemService itemService;


    public ItemController(com.laioffer.twitch.item.ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping("/search")
    public TypeGroupedItemList search(@RequestParam("game_id") String gameId) {
        return itemService.getItems(gameId);
    }
}

