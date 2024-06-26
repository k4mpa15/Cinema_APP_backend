// RepertuarService.java
package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.Programme;
import pl.wat.backend.repository.RepertuarRepository;

import java.util.List;

@Service
public class RepertuarService {

    @Autowired
    private RepertuarRepository repertuarRepository;

    public List<Programme> getAllShows() {
        return repertuarRepository.findAll();
    }
}
