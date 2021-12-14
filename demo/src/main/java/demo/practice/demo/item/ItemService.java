package demo.practice.demo.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    
    @Autowired
    ItemRepository itemRepository;

    //GET all Items
    public List<ItemEntity> getAllItems() {
        return itemRepository.findAll();
    }

    //POST one Item
    public ItemEntity saveSingleItem(ItemEntity itemEntity) {
        itemRepository.save(itemEntity);
        return itemEntity;
    }
}
