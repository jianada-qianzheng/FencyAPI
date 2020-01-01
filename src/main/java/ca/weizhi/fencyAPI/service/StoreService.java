package ca.weizhi.fencyAPI.service;

import ca.weizhi.fencyAPI.dao.StoreDao;
import ca.weizhi.fencyAPI.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final StoreDao storeDao;

    @Autowired
    public StoreService(@Qualifier("fakeDao") StoreDao storeDao){
        this.storeDao=storeDao;

    }

    public int addStore(Store store){
        return storeDao.addStore(store);

    }

    public List<Store> getAllStore(){
        return storeDao.selectAllStore();
    }

}
