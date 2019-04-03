package com.accidentes.sistemaaccidentes.service;

import com.accidentes.sistemaaccidentes.model.TipoGasto;
import com.accidentes.sistemaaccidentes.repositories.GenericRepository;
import com.accidentes.sistemaaccidentes.repositories.TipoGastoRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoGastoServiceImpl extends GenericServiceImpl<TipoGasto> implements TipoGastoService {

    private final TipoGastoRepository repository;

    public TipoGastoServiceImpl(TipoGastoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<TipoGasto> getRepository() {
        return repository;
    }
}
