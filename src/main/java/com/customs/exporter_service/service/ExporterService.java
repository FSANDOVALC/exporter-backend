package com.customs.exporter_service.service;

import com.customs.exporter_service.model.Exporter;
import com.customs.exporter_service.repository.ExporterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExporterService {

    @Autowired
    private ExporterRepository exportadorRepository;

    public Exporter crearExportador(Exporter exportador) {
        return exportadorRepository.save(exportador);
    }

    public List<Exporter> obtenerTodosLosExportadores() {
        return exportadorRepository.findAll();
    }

    public Optional<Exporter> obtenerExportadorPorId(Integer id) {
        return exportadorRepository.findById(id);
    }
}