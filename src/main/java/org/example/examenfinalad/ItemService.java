package org.example.examenfinalad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    //Agregar un nuevo item
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    //eliminar un item
    public void deleteItem(Long id) {
        itemRepository.deleteById(String.valueOf(id));
    }

    //obtener detalle de un item
    public Item getItemById(Long id) {
        return itemRepository.findById(String.valueOf(id)).orElse(null);
    }

    //listar items por categoria
    public List<Item> getItemsByCategory(String category) {
        return itemRepository.findByCategory(category);
    }

}
