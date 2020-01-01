package ca.weizhi.fencyAPI.dao;

import ca.weizhi.fencyAPI.model.Store;

import java.util.List;
import java.util.UUID;

public interface StoreDao {
    int insertStore(UUID id,Store store);

    default int addStore(Store store){
        UUID id= UUID.randomUUID();

        return insertStore(id,store);

    }

    List<Store> selectAllStore();
}
