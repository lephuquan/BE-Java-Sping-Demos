package com.lephuquan.dev.demo_attributes_in_entities.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_child")
@Setter
@Getter
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Nơi ánh xạ tới MainAttributesContainer
    @ManyToOne
    private MainAttributesContainer mainAttributesContainer;

}
