package edu.greenriver.sdev.consumingapilab.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This POJO represents an image icon in the static/images folder. The class is used to
 * return objects from a restful controller as well as storing corresponding database
 * records.
 */
@Entity
@Data
@NoArgsConstructor
public class IconFile
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imagePath;

    public IconFile(String imagePath)
    {
        this.imagePath = imagePath;
    }
}
