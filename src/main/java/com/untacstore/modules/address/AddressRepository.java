package com.untacstore.modules.address;

import com.untacstore.modules.store.Store;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface AddressRepository extends JpaRepository<Address, Long> {
    @EntityGraph(attributePaths = {"store"})
    Address findByStore(Store store);
}
