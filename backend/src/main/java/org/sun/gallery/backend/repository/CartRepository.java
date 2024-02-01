package org.sun.gallery.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.sun.gallery.backend.entity.Cart;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findByMemberId(int memberId);

    Cart findByMemberIdAndItemId(int memberId, int itemId);


}
