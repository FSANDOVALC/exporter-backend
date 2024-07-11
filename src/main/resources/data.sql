-- Crear las tablas "exporter" y "company" si no existen
CREATE TABLE IF NOT EXISTS company (
                                       id INT AUTO_INCREMENT PRIMARY KEY,
                                       identification_type VARCHAR(1) NOT NULL,
    identification VARCHAR(35) NOT NULL,
    name VARCHAR(100) NOT NULL
    );

CREATE TABLE IF NOT EXISTS exporter (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        status VARCHAR(1) NOT NULL,
    company_id INT NOT NULL,
    version BIGINT,
    acceptance DATE NOT NULL,
    expiration DATE NOT NULL,
    province_code INT NOT NULL,
    canton_code INT NOT NULL,
    district_code INT NOT NULL,
    email VARCHAR(100) NOT NULL,
    sector VARCHAR(4) NOT NULL,
    FOREIGN KEY (company_id) REFERENCES company(id)
    );

-- Insertar datos en las tablas "company" y "exporter"
INSERT INTO company (identification_type, identification, name)
VALUES
    ('T', '12345678901234567890123456789012345', 'Empresa 1'),
    ('T', '98765432109876543210987654321098765', 'Empresa 2');

INSERT INTO exporter (status, company_id, version, acceptance, expiration, province_code, canton_code, district_code, email, sector)
VALUES
    ('A', 1, 1, '2024-07-15', '2025-07-15', 1, 1, 1, 'empresa1@example.com', 'SECT'),
    ('I', 2, 2, '2024-08-15', '2025-08-15', 2, 2, 2, 'empresa2@example.com', 'SECT');
