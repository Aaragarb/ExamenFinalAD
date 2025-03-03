package org.example.examenfinalad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TiendaController {
    @Autowired ItemService itemService;

    //Obtener todos los items
    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    //Obtener detalle de un item
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    //Listar items por categoria
    @GetMapping("/items/{category}")
    public List<Item> getItemsByCategory(@PathVariable String category) {
        return itemService.getItemsByCategory(category);
    }

    //Borrar un item
    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }

    //Agregar un nuevo item
    @PostMapping("/itemsadd")
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }
}