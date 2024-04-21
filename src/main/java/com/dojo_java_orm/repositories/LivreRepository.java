package com.dojo_java_orm.repositories;

import com.dojo_java_orm.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre,Long> {
}
