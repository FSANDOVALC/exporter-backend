package com.customs.exporter_service.controller;

import com.customs.exporter_service.model.Exporter;
import com.customs.exporter_service.service.ExporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/exportadores")
public class ExporterController {

    @Autowired
    private ExporterService exportadorService;

    @PostMapping
    public ResponseEntity<Exporter> crearExportador(@RequestBody Exporter exportador) {
        Exporter nuevoExportador = exportadorService.crearExportador(exportador);
        return new ResponseEntity<>(nuevoExportador, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Exporter>> obtenerTodosLosExportadores() {
        List<Exporter> exportadores = exportadorService.obtenerTodosLosExportadores();
        return new ResponseEntity<>(exportadores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exporter> obtenerExportadorPorId(@PathVariable Integer id) {
        Optional<Exporter> exportador = exportadorService.obtenerExportadorPorId(id);
        return exportador.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}