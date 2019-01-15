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
@Table(name = "terminal_programming")
@EqualsAndHashCode(callSuper = false)
public class TerminalProgramming extends BasePO {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTerminalProgramming;
    private Integer idTerminal;
    private Integer idUser;
    private Date dateDownload;
    private Date dateNotification;
    private Date dateAdded;
    private Integer idStatusTransaction;
    private Integer idBatchProgramming;
    private String nombreapp;
    private String version;

}