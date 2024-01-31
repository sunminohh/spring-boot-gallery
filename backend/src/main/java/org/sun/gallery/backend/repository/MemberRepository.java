package org.sun.gallery.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sun.gallery.backend.entity.Item;
import org.sun.gallery.backend.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByEmailAndPassword(String email, String password);
}
