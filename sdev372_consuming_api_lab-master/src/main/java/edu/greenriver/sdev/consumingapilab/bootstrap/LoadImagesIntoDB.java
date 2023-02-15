package edu.greenriver.sdev.consumingapilab.bootstrap;

import edu.greenriver.sdev.consumingapilab.database.IconsRepository;
import edu.greenriver.sdev.consumingapilab.model.IconFile;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * This is a bootstrap file that hooks into the Spring context refreshed
 * event. When the context is refreshed on startup, I read through the
 * files in the static/images directory and save them to a local in-memory
 * database.
 */
@Component
public class LoadImagesIntoDB implements ApplicationListener<ContextRefreshedEvent>
{
    private IconsRepository imagesRepo;

    public LoadImagesIntoDB(IconsRepository imagesRepo)
    {
        this.imagesRepo = imagesRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event)
    {
        File imagesDir = new File("src/main/resources/static/images");
        System.out.println(imagesDir.exists());
        System.out.println(imagesDir.getAbsolutePath());

        for (File file : imagesDir.listFiles())
        {
            String relativePath = file.getPath()
                .replace("src\\main\\resources\\static\\", "")
                .replace("\\", "/");
            System.out.println(relativePath);

            imagesRepo.save(new IconFile(relativePath));
        }
    }
}
