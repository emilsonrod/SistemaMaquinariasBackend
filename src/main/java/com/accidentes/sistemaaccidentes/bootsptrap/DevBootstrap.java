package com.accidentes.sistemaaccidentes.bootsptrap;

import com.accidentes.sistemaaccidentes.model.TipoMaquinaria;
import com.accidentes.sistemaaccidentes.repositories.TipoMaquinariaRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private TipoMaquinariaRepository repository;

    public DevBootstrap(TipoMaquinariaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData()
    {
        TipoMaquinaria tipo1 = new TipoMaquinaria();
        tipo1.setNombreTipoMaquinaria("Grua");
        tipo1.setDescripcionTipoMaquinaria("transporte pesado");
        tipo1.setEstado("AC");
        repository.save(tipo1);

        TipoMaquinaria tipo2 = new TipoMaquinaria();
        tipo2.setNombreTipoMaquinaria("Retroexcavadora");
        tipo2.setDescripcionTipoMaquinaria("transporte pesado");
        tipo2.setEstado("AC");
        repository.save(tipo2);

        TipoMaquinaria tipo3 = new TipoMaquinaria();
        tipo3.setNombreTipoMaquinaria("Tractor");
        tipo3.setDescripcionTipoMaquinaria("transporte pesado");
        tipo3.setEstado("AC");
        repository.save(tipo3);

        TipoMaquinaria tipo4 = new TipoMaquinaria();
        tipo4.setNombreTipoMaquinaria("Motocultor");
        tipo4.setDescripcionTipoMaquinaria("transporte pesado");
        tipo4.setEstado("AC");
        repository.save(tipo4);
    }
}
