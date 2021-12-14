package demo.practice.demo.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<ItemEntity> getAllItemDetails() {
        return itemService.getAllItems();   
    }

    @PostMapping
    public ItemEntity saveItem(@RequestBody ItemEntity itemEntity) {
        return itemService.saveSingleItem(itemEntity);
    }
}
