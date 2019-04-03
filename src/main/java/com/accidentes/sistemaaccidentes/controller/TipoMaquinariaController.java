package com.accidentes.sistemaaccidentes.controller;

import com.accidentes.sistemaaccidentes.dto.TipoMaquinariaDto;
import com.accidentes.sistemaaccidentes.model.TipoMaquinaria;
import com.accidentes.sistemaaccidentes.service.GenericService;
import com.accidentes.sistemaaccidentes.service.TipoMaquinariaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Produces(MediaType.APPLICATION_JSON)
public class TipoMaquinariaController extends GenericController<TipoMaquinaria, TipoMaquinariaDto> {

    private TipoMaquinariaService service;

    public TipoMaquinariaController(TipoMaquinariaService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GetMapping("/tipos")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<TipoMaquinariaDto> getAll() {
        return super.getAll();
    }

    @PostMapping("/saveTipo")
    @ResponseBody
    public TipoMaquinariaDto save(@RequestBody TipoMaquinaria tipoMaquinaria)
    {
        return super.save(tipoMaquinaria);
    }

    @PostMapping("/editTipo")
    @ResponseBody
    public TipoMaquinaria edit(@RequestBody TipoMaquinaria tipoMaquinaria)
    {
        return toModel(super.save(tipoMaquinaria));
    }

    @PostMapping("/deleteTipo")
    @ResponseBody
    public void delete(@RequestBody TipoMaquinaria tipoMaquinaria)
    {
        super.deleteElement(tipoMaquinaria.getId());
    }
}
