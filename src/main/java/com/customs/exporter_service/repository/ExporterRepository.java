package com.customs.exporter_service.repository;

import com.customs.exporter_service.model.Exporter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExporterRepository extends JpaRepository<Exporter, Integer> {
}
