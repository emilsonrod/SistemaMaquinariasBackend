package com.accidentes.sistemaaccidentes.controller;

import com.accidentes.sistemaaccidentes.dto.MaquinariaDto;
import com.accidentes.sistemaaccidentes.model.Maquinaria;
import com.accidentes.sistemaaccidentes.service.GenericService;
import com.accidentes.sistemaaccidentes.service.MaquinariaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Produces(MediaType.APPLICATION_JSON)
public class MaquinariaController extends GenericController<Maquinaria, MaquinariaDto> {

    private MaquinariaService service;

    public MaquinariaController(MaquinariaService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GetMapping("/maquinarias")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MaquinariaDto> getAll() {
        List<MaquinariaDto> result = super.getAll();
        return result;
    }

    @PostMapping("/maquinariasByTipo")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MaquinariaDto> getAllByTipo(@RequestBody int idTipo) {
        List<MaquinariaDto> result = toDto(this.service.findAllByTipo(idTipo));
        return result;
    }

    @PostMapping("/maquinariasByMarca")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MaquinariaDto> getAllByMarca(@RequestBody String marca) {
        List<MaquinariaDto> result = toDto(this.service.findAllByMarca(marca));
        return result;
    }

    @PostMapping("/maquinariasByModelo")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MaquinariaDto> getAllByModelo(@RequestBody String modelo) {
        List<MaquinariaDto> result = toDto(this.service.findAllByModelo(modelo));
        return result;
    }

    @PostMapping("/maquinariasByCapacidad")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MaquinariaDto> getAllByCapacidad(@RequestBody String capacidad) {
        List<MaquinariaDto> result = toDto(this.service.findAllByCapacidad(capacidad));
        return result;
    }

    @PostMapping("/maquinariasByPrecio")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MaquinariaDto> getAllByTipo(@RequestBody Double precio) {
        List<MaquinariaDto> result = toDto(this.service.findAllByPrecio(precio));
        return result;
    }

    @PostMapping("/saveMaquinaria")
    @ResponseBody
    @Override
    @CrossOrigin(origins = "http://localhost:4200")
    public MaquinariaDto save(@RequestBody Maquinaria maquinaria)
    {
        return super.save(maquinaria);
    }

    @PostMapping("/editMaquinaria")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public Maquinaria edit(@RequestBody Maquinaria maquinaria)
    {
        return toModel(super.save(maquinaria));
    }

    @PostMapping("/deleteMaquinaria")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public void delete(@RequestBody Maquinaria maquinaria)
    {
        super.deleteElement(maquinaria.getId());
    }

    @PostMapping("/getMaquinaria")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public MaquinariaDto findMaquinaria(@RequestBody long idMaquinaria)
    {
        return super.getById(idMaquinaria);
    }
}
