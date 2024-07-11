package com.customs.exporter_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "exporter")
public class Exporter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", nullable = false, length = 1)
    private String status;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = true)
    private Company company;

    @Column(name = "version")
    private Long version;

    @Column(name = "acceptance", nullable = false)
    private LocalDate acceptance;

    @Column(name = "expiration", nullable = false)
    private LocalDate expiration;

    @Column(name = "province_code", nullable = false)
    private Integer provinceCode;

    @Column(name = "canton_code", nullable = false)
    private Integer cantonCode;

    @Column(name = "district_code", nullable = false)
    private Integer districtCode;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "sector", nullable = false, length = 4)
    private String sector;

    public Exporter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public LocalDate getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(LocalDate acceptance) {
        this.acceptance = acceptance;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Integer getCantonCode() {
        return cantonCode;
    }

    public void setCantonCode(Integer cantonCode) {
        this.cantonCode = cantonCode;
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}

