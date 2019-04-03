package com.accidentes.sistemaaccidentes.repositories;

import com.accidentes.sistemaaccidentes.model.ModelBase;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("rawtypes")
public interface GenericRepository<T extends ModelBase> extends JpaRepository<T, Long>  {
}
