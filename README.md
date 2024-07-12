# exporter-backend

1. **Limpiar y reconstruir el Proyecto:**
   ```bash
   ./gradlew clean build

2. **Navegar a la consola H2:**

    - Abrir buscador y visitar [http://localhost:8080/h2-console]
   
    
3. **Credenciales H2:**
- **Driver Class:** `org.h2.Driver`
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** `password`

4. **Correr el proyecto:**
   ```bash
   ./gradlew bootRun

5. **Link de swagger:**

http://localhost:8080/swagger-ui/index.html