package pl.edu.pjwstk.jazs20499nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pjwstk.jazs20499nbp.model.Data;

import java.util.List;
import java.util.Optional;

public interface Repository extends JpaRepository<Data, Long> {

    @Override
    List<Data> findAll();

    @Override
    Optional<Data> findById(Long id);

    @Override
    Data save(Data movie);

    @Override
    void deleteById(Long id);
}


