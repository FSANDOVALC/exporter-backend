package com.customs.exporter_service.service;

import com.customs.exporter_service.model.Company;
import com.customs.exporter_service.model.Exporter;
import com.customs.exporter_service.repository.CompanyRepository;
import com.customs.exporter_service.repository.ExporterRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExporterService {

    @Autowired
    private ExporterRepository exportadorRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public Exporter crearExportador(Exporter exportador) {
        if (exportador.getCompany() != null && exportador.getCompany().getId() == null) {
            Company savedCompany = companyRepository.save(exportador.getCompany());
            exportador.setCompany(savedCompany);
        }
        return exportadorRepository.save(exportador);
    }

    public List<Exporter> obtenerTodosLosExportadores() {
        return exportadorRepository.findAll();
    }

    public Optional<Exporter> obtenerExportadorPorId(Integer id) {
        return exportadorRepository.findById(id);
    }

    public Exporter actualizarEstadoExportador(Integer id, String nuevoEstado) {
        Optional<Exporter> optionalExporter = exportadorRepository.findById(id);
        if (optionalExporter.isPresent()) {
            Exporter exportador = optionalExporter.get();
            exportador.setStatus(nuevoEstado);
            return exportadorRepository.save(exportador);
        } else {
            throw new EntityNotFoundException("Exportador no encontrado con id: " + id);
        }
    }
}