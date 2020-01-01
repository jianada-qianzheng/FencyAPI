package ca.weizhi.fencyAPI.api;

import ca.weizhi.fencyAPI.model.Store;
import ca.weizhi.fencyAPI.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/store")
@RestController
public class StoreController {
    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService){
        this.storeService=storeService;

    }

    @PostMapping
    public void addStore(@RequestBody Store store){
        storeService.addStore(store);

    }

    @GetMapping
    public List<Store> getAllStore(){

        return storeService.getAllStore();

    }

}
