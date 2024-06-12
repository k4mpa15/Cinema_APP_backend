
package pl.wat.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wat.backend.entity.Programme;
import pl.wat.backend.services.RepertuarService;

import java.util.List;

@RestController
public class ProgrammeController {

    @Autowired
    private RepertuarService repertuarService;

    @GetMapping("/shows/repertuar")
    public List<Programme> getAllShows() {
        return repertuarService.getAllShows();
    }
}
