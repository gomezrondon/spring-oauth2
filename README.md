# spring-oauth2
Testing OAuth2 with Spring Boot 2.4

#### 1) Add the OAuth2 dependency
```
implementation 'org.springframework.boot:spring-boot-starter-oauth2-client'
```

#### 2) Registry the application in GitHub

https://github.com/settings/developers

select Auth app, configure your app and get the "github-client-id" and "github-client-secret"

#### 3) Configure the OAuth2 github credentials in Spring boot
```
spring:
  security:
    oauth2:
      client:
        registration:
          github:
            clientId: github-client-id
            clientSecret: github-client-secret
```

#### 4) Run the application
