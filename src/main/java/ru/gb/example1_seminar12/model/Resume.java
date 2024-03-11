package ru.gb.example1_seminar12.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Resume {
    private Long id;
    private String name;
    private String aboutMe;
    private int workExperience;
    private LocalDateTime creation;

    public Resume(String name, String aboutMe, int workExperience) {
        this.name = name;
        this.aboutMe = aboutMe;
        this.workExperience = workExperience;
    }
}
