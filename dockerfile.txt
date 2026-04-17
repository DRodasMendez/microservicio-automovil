# ---------- Etapa 1: Build ----------
# Usa una imagen de Maven con JDK 21 para compilar.
FROM maven:3.9.5-eclipse-temurin-21-alpine AS build

WORKDIR /app

# Copia y descarga dependencias primero para usar cache
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia el resto del código
COPY src ./src

# Compila el proyecto (sin tests)
RUN mvn package -DskipTests

# ---------- Etapa 2: Runtime ----------
# Usa una imagen ligera con el JRE 21 para ejecutar la app.
FROM eclipse-temurin:21-jre

WORKDIR /app

# Expone el puerto que usará tu app (ajusta si usas otro)
EXPOSE 8080

# Copia el JAR generado desde la etapa de build
COPY --from=build /app/target/*.jar app.jar

# Comando para iniciar la app
ENTRYPOINT ["java", "-jar", "app.jar"]