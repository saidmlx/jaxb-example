# Java Architecture for XML Binding (JAXB) example

Cuando se implementa un Web Service se utiliza otra API para convertir de forma automática objetos a XML y de XML a objetos y esa API se llama Java Architecture for XML Binding (JAXB) 

## Descripción

Este proyecto muestra como utilizar JAXB 

## Que hay en el proyecto

En el proyecto tenemos un XSD donde definimos el esquema y lo que vamos hacer es que a partir de este XML generar las clases

Una vez cloando el recurso

```terminal
mvn generate-sources
``
y veremos que se crea el paquete con todo el modelo de objetos de Java

```java
src/main/generated/
├── META-INF
│   └── sun-jaxb.episode
├── online
│   └── saidmlx
│       └── database
│           └── northwind
│               └── products
│                   ├── ObjectFactory.java
│                   ├── ProductRequest.java
│                   ├── ProductResponse.java
│                   └── package-info.java
└── org
    └── w3
        └── _2001
            └── xmlschema
                └── Adapter1.java
``