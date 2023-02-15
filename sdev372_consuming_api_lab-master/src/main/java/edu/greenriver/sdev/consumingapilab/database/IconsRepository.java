package edu.greenriver.sdev.consumingapilab.database;

import edu.greenriver.sdev.consumingapilab.model.IconFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface defines a database layer to access image
 * icons from the in-memory database.
 */
@Repository
public interface IconsRepository extends JpaRepository<IconFile, Integer>
{

}
