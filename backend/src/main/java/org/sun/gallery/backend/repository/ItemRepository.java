package org.sun.gallery.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sun.gallery.backend.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
