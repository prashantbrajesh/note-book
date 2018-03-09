package myTestApi.com.notebook.repository;

import myTestApi.com.notebook.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by braj on 09/03/18.
 */
@Repository
public interface NoteRepository extends JpaRepository<Note,Long> {
}
