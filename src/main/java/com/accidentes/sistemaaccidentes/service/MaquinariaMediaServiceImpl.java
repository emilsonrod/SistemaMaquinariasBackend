package com.accidentes.sistemaaccidentes.service;

import com.accidentes.sistemaaccidentes.model.MaquinariaMedia;
import com.accidentes.sistemaaccidentes.repositories.GenericRepository;
import com.accidentes.sistemaaccidentes.repositories.MaquinariaMediaRepository;
import org.springframework.stereotype.Service;

@Service
public class MaquinariaMediaServiceImpl extends GenericServiceImpl<MaquinariaMedia> implements MaquinariaMediaService {

    private final MaquinariaMediaRepository repository;

    public MaquinariaMediaServiceImpl(MaquinariaMediaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<MaquinariaMedia> getRepository() {
        return repository;
    }
}
