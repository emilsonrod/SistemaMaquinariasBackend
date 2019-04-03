package com.accidentes.sistemaaccidentes.service;

import com.accidentes.sistemaaccidentes.model.MaquinariaGasto;
import com.accidentes.sistemaaccidentes.repositories.GenericRepository;
import com.accidentes.sistemaaccidentes.repositories.MaquinariaGastoRepository;
import org.springframework.stereotype.Service;

@Service
public class MaquinariaGastoServiceImpl extends GenericServiceImpl<MaquinariaGasto> implements MaquinariaGastoService {

    private final MaquinariaGastoRepository repository;

    public MaquinariaGastoServiceImpl(MaquinariaGastoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<MaquinariaGasto> getRepository() {
        return repository;
    }
}
