## Opções de configuração de Bando de Dados

//application.yml
````yml
# Configuração da aplicação
spring:
  application:
    name: CrudClientes

# Configuração do servidor
server:
  port: 8080

# Configuração do banco de dados
  datasource:
    url: ${DB_URL}
    username: ${DB_USERNAME}
    password: ${DB_PASSWORD}
    driver-class-name: com.mysql.cj.jdbc.Driver

# Configuração do JPA
  jpa:
    hibernate:
      ddl-auto: update
````
//application.properties
````properties
# Configuração da aplicação
spring.application.name=CrudClientes

# Configuração do servidor
server.port=8080

# Configuração do banco de dados
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Configuração do JPA
spring.jpa.hibernate.ddl-auto=update
````