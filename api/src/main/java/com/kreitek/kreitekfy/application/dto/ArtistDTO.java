package com.kreitek.kreitekfy.application.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ArtistDTO {
    private Long id;
    private String name;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthdate;
    private byte[] avatar;

    public ArtistDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }
}
