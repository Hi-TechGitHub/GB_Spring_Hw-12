package ru.gb.example1_seminar12.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gb.example1_seminar12.model.Resume;
import ru.gb.example1_seminar12.services.FileGateway;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Ну, это наш рест контролёр
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/resume")
public class ResumeController {
    private final FileGateway fileGateway;


    /**
     * Добавить работника
     * @param resume резюме
     */
    @PostMapping
    public ResponseEntity<Resume> addEmployee(@RequestBody Resume resume) {
        resume.setCreation(LocalDateTime.now());
        fileGateway.writeToFile(resume.getName() + ".txt", resume.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
