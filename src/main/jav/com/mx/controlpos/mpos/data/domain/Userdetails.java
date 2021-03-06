package com.mx.controlpos.mpos.data.domain;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import test.BasePO;

/**
 * Auto generated by jpa-maven-plugin
 * @author user
 * @date 2019-01-15 10:09:33
 */
@Data
@Entity
@Table(name = "userdetails")
@EqualsAndHashCode(callSuper = false)
public class Userdetails extends BasePO {

    private static final long serialVersionUID = 1L;

    @Id
    private String username;
    private String name;
    private String surname;
    private String email;
    private String telephone;
    private String image;

}