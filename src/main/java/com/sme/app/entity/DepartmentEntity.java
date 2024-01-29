package com.sme.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;


@Entity
@Table(name = "DEPARTMENT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Immutable
public class DepartmentEntity implements Serializable {

    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;

}
