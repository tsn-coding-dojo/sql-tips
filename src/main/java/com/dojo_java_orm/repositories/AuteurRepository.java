package com.dojo_java_orm.repositories;

import com.dojo_java_orm.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur,Long> {
}
