package ca.weizhi.fencyAPI.dao;

import ca.weizhi.fencyAPI.model.Store;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeStoreDataAccessService implements StoreDao{

    private static List<Store> DB=new ArrayList<>();

    @Override
    public int insertStore(UUID id, Store store) {

        DB.add(new Store(store.getName(),store.getAltitude(),store.getLongitude(),id));

        return 1;
    }

    @Override
    public List<Store> selectAllStore() {
        return DB;
    }
}
