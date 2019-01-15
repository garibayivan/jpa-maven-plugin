package com.mx.controlpos.mpos.data.domain;

import javax.persistence.*;
import java.util.Date;
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
@Table(name = "download")
@EqualsAndHashCode(callSuper = false)
public class Download extends BasePO {

    private static final long serialVersionUID = 1L;

    private Date dateadded;
    private String filepath;
    private String name;
    private String namefile;

}