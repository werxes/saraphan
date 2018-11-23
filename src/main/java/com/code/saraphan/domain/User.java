package com.code.saraphan.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "usr")
@Data
public class User implements Serializable{
    @Id
    @Column(length = 200)
    private String id;

    @Column(length = 200)
    private String name;

    @Column(length = 400)
    private String userpic;

    @Column(length = 200)
    private String email;

    @Column(length = 30)
    private String gender;

    @Column(length = 20)
    private String locale;

    private LocalDateTime lastVisit;
}