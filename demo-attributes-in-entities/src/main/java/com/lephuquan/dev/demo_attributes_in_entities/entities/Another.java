package com.lephuquan.dev.demo_attributes_in_entities.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "tble_another")
@Setter
@Getter
public class Another {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // N-N Relationship
    @ManyToMany(mappedBy = "manyToMany")
    private Set<MainAttributesContainer> mainAttributesContainers;

}
