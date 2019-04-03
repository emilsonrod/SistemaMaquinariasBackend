package com.accidentes.sistemaaccidentes.controller;

import com.accidentes.sistemaaccidentes.dto.TipoGastoDto;
import com.accidentes.sistemaaccidentes.model.TipoGasto;
import com.accidentes.sistemaaccidentes.service.GenericService;
import com.accidentes.sistemaaccidentes.service.TipoGastoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Produces(MediaType.APPLICATION_JSON)
public class TipoGastoController extends GenericController<TipoGasto, TipoGastoDto> {

    private TipoGastoService service;

    public TipoGastoController(TipoGastoService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GetMapping("/TipoGastos")
    @ResponseBody
    public List<TipoGastoDto> getAll() {
        return super.getAll();
    }

    @PostMapping("/saveTipoGasto")
    @ResponseBody
    public TipoGastoDto save(@RequestBody TipoGasto tipoGasto)
    {
        return super.save(tipoGasto);
    }

    @PostMapping("/editTipoGasto")
    @ResponseBody
    public TipoGasto edit(@RequestBody TipoGasto tipoGasto)
    {
        return toModel(super.save(tipoGasto));
    }

    @PostMapping("/deleteTipoGasto")
    @ResponseBody
    public void delete(@RequestBody TipoGasto tipoGasto)
    {
        super.deleteElement(tipoGasto.getId());
    }
}
