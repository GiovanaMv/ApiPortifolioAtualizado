# Usa imagem oficial do Java
FROM eclipse-temurin:17-jdk

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o .jar gerado para dentro do container
COPY target/*.jar app.jar

# Expõe a porta padrão
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]