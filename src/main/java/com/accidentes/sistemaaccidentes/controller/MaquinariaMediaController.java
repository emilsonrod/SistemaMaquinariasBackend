package com.accidentes.sistemaaccidentes.controller;

import com.accidentes.sistemaaccidentes.dto.MaquinariaMediaDto;
import com.accidentes.sistemaaccidentes.model.MaquinariaMedia;
import com.accidentes.sistemaaccidentes.model.Media;
import com.accidentes.sistemaaccidentes.service.GenericService;
import com.accidentes.sistemaaccidentes.service.MaquinariaMediaService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Produces(MediaType.APPLICATION_JSON)
public class MaquinariaMediaController extends GenericController<MaquinariaMedia, MaquinariaMediaDto> {

    private MaquinariaMediaService service;

    public MaquinariaMediaController(MaquinariaMediaService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    @GetMapping("/maquinariaMedias")
    @ResponseBody
    public List<MaquinariaMediaDto> getAll() {
        return super.getAll();
    }

    @PostMapping("/saveMaquinariaMedia")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public MaquinariaMediaDto save(@RequestBody Media media)
    {
        MaquinariaMedia mediaForm = new MaquinariaMedia();
        try
        {
            //This will decode the String which is encoded by using Base64 class
            byte[] imageByte=Base64.decodeBase64(media.getImage());
            String image = Base64.encodeBase64String(imageByte);
            mediaForm.setImage(imageByte);
            mediaForm.setEstado(media.getEstado());
            mediaForm.setNombreMedia(media.getNombreMedia());
            mediaForm.setMaquinaria(media.getMaquinaria());
        }
        catch(Exception e)
        {

        }
        return super.save(mediaForm);
        //return  new MaquinariaMediaDto();
    }

    @PostMapping("/editMaquinariaMedia")
    @ResponseBody
    public MaquinariaMedia edit(@RequestBody MaquinariaMedia maquinariaMedia)
    {
        return toModel(super.save(maquinariaMedia));
    }

    @PostMapping("/deleteMaquinariaMedia")
    @ResponseBody
    public void delete(@RequestBody MaquinariaMedia maquinariaMedia)
    {
        super.deleteElement(maquinariaMedia.getId());
    }
}
