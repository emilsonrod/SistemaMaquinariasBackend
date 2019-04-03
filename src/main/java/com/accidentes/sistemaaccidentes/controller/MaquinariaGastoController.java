package com.accidentes.sistemaaccidentes.controller;

import com.accidentes.sistemaaccidentes.dto.MaquinariaGastoDto;
import com.accidentes.sistemaaccidentes.model.MaquinariaGasto;
import com.accidentes.sistemaaccidentes.service.GenericService;
import com.accidentes.sistemaaccidentes.service.MaquinariaGastoService;
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
public class MaquinariaGastoController extends GenericController<MaquinariaGasto, MaquinariaGastoDto> {

    private MaquinariaGastoService service;

    public MaquinariaGastoController(MaquinariaGastoService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GetMapping("/maquinariaGastos")
    @ResponseBody
    public List<MaquinariaGastoDto> getAll() {
        return super.getAll();
    }

    @PostMapping("/saveMaquinariaGasto")
    @ResponseBody
    public MaquinariaGastoDto save(@RequestBody MaquinariaGasto maquinariaGasto)
    {
        return super.save(maquinariaGasto);
    }

    @PostMapping("/editMaquinariaGasto")
    @ResponseBody
    public MaquinariaGasto edit(@RequestBody MaquinariaGasto maquinariaGasto)
    {
        return toModel(super.save(maquinariaGasto));
    }

    @PostMapping("/deleteMaquinariaGasto")
    @ResponseBody
    public void delete(@RequestBody MaquinariaGasto maquinariaGasto)
    {
        super.deleteElement(maquinariaGasto.getId());
    }
}
