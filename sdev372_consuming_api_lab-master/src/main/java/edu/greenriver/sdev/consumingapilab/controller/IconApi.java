package edu.greenriver.sdev.consumingapilab.controller;

import edu.greenriver.sdev.consumingapilab.model.IconFile;
import edu.greenriver.sdev.consumingapilab.service.IconsService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * A simple RESTful api that provides links to image icons.
 */
@RestController
@RequestMapping("api/v1/icons")
public class IconApi
{
    private IconsService service;

    public IconApi(IconsService service)
    {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<IconFile>> getFiles()
    {
        return new ResponseEntity<>(service.getIcons(), HttpStatus.OK);
    }
}