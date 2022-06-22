package com.example.workjob.pojo;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class XmlUser {
    private int userId;
    private String userName;
}
