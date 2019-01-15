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
@Table(name = "parametros_software")
@EqualsAndHashCode(callSuper = false)
public class ParametrosSoftware extends BasePO {

    private static final long serialVersionUID = 1L;

    private String nombreapp;
    private String version;
    private String contenedor;
    private Date fechacreacion;
    private Date fechaultimamodificacion;
    private String ruta;
    private Long jsonschema;
    private Long jsoncatalog;
    private Long jsondata;
    private Long jsondataschema;

}