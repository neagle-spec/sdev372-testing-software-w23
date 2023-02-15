package edu.greenriver.sdev.consumingapilab.service;

import edu.greenriver.sdev.consumingapilab.database.IconsRepository;
import edu.greenriver.sdev.consumingapilab.model.IconFile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Simple service layer that reads data from our H2 database
 * and provides it to the web api.
 */
@Service
public class IconsService
{
    private IconsRepository iconsRepo;

    public IconsService(IconsRepository iconsRepo)
    {
        this.iconsRepo = iconsRepo;
    }

    public List<IconFile> getIcons()
    {
        return iconsRepo.findAll();
    }
}
