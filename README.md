## API REST para proyecto To Do List

### Tecnologías usadas
* Java
* Spring Boot
* Maven
* JPA
* Oracle
* Swagger

### Dependencias necesarias
* Data JPA
* Oracle Connector
* Lombok
* Swagger 2
* Swagger UI


<!--
Anotaciones clave de Lombok
    @Getter: lo que va a hacer en generar los métodos getter para los atributos de la clase.
    @Setter: hace lo correspondiente con los setter.
    @RequiredArgsConstructor: genera un constructor para los atributos que tengamos marcados como no null o que sean final.
    @AllArgsConstructor: genera un constructor para todos los atributos de la clase.
    @NoArgsConstructor: genera un constructor sin argumentos, uno vacío.
    @EqualsAndHashCode: genera los métodos equals y hashcode.
    @ToString: genera el método toString.

Anotaciones derivadas
    @Data: equivalente a poner @Getter, @Setter, @RequiredArgsConstructor, @EqualsAndHashCode y @ToString.


springfox-swagger2 - Se encarga de analizar la estructura de nuestro proyecto y crear los metadatos para crear la auto documentación del API.
springfox-swagger-ui - Se encarga de tomar los metadatos de la primera y crear una interfaz gráfica amigable con los usuarios.
-->

### Links a páginas creadas por Swagger
Documentación de la API:
http://localhost:8080/v2/api-docs

Interfaz gráfica:
http://localhost:8080/swagger-ui.html#/

### Sentencias para Base de Datos
* Secuenciador
```oracle
CREATE SEQUENCE nombreEsquema.SEQ_TAREAS MINVALUE 0 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 30 NOCACHE NOORDER NOCYCLE;
```
* Tabla
```oracle
    CREATE TABLE "nombreEsquema"."TAREAS" (	
        "TAREA_ID" NUMBER NOT NULL ENABLE NOVALIDATE, 
        "DESCRIPCION" VARCHAR2(150), 
        "ESTADO" VARCHAR2(20),
        "FECHA_VENCIMIENTO" VARCHAR2(10),
        CONSTRAINT "PK_TAREAS" PRIMARY KEY ("TAREA_ID")
    );
    
    COMMENT ON COLUMN "nombreEsquema"."TAREAS"."TAREA_ID" IS 'IDENTIFICADOR DE LA TAREA';
    COMMENT ON COLUMN "nombreEsquema"."TAREAS"."DESCRIPCION" IS 'DESCRIPCION DE LA TAREA';
    COMMENT ON COLUMN "nombreEsquema"."TAREAS"."ESTADO" IS 'ESTADO DE LA TAREA';
    COMMENT ON COLUMN "nombreEsquema"."TAREAS"."FECHA_VENCIMIENTO" IS 'FECHA VENCIMIENTO DE LA TAREA';
```

<!-- 
CREATE OR REPLACE PUBLIC SYNONYM TAREAS FOR nombreEsquema.TAREAS;
-->
