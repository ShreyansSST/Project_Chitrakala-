package com.system.chitrakala.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    @Id
    @SequenceGenerator(name = "chitrakala_user_seq_gen", sequenceName = "chitrakala_user_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "chitrakala_user_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(nullable = false)
    private String category_name;
}
