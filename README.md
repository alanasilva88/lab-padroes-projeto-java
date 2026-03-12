# Explorando Padrões de Projeto com Java

Este repositório contém a implementação de alguns **Design Patterns (Padrões de Projeto)** clássicos utilizando **Java puro**, desenvolvidos durante o laboratório da Digital Innovation One **Bootcamp Accenture - Desenvolvimento Java & Cloud**.

O objetivo do projeto é demonstrar na prática como aplicar padrões de projeto para melhorar a organização, reutilização e manutenção do código.

## Padrões Implementados

### Singleton
Garante que uma classe tenha **apenas uma instância** e fornece um ponto global de acesso a ela.

Implementações utilizadas:
- SingletonLazy
- SingletonEager
- SingletonLazyHolder

### Strategy
Permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis em tempo de execução.

Comportamentos implementados:
- ComportamentoNormal
- ComportamentoDefensivo
- ComportamentoAgressivo
- ComportamentoFurtivo (adicionado como melhoria no projeto)

### Facade
Fornece uma **interface simplificada** para um conjunto de subsistemas mais complexos.

No projeto, o Facade simplifica a comunicação entre:
- Serviço de CEP
- Serviço de CRM

## Estrutura do Projeto
src
└─ one.digitalinnovation.gof
├─ singleton
├─ strategy
└─ facade

## Como Executar

1. Clone o repositório
git clone https://github.com/alanasilva88/lab-padroes-projeto-java.git

2. Abra o projeto em uma IDE Java (VS Code, IntelliJ ou Eclipse)

3. Execute a classe:

Test.java

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Design Patterns (GOF)

## Autor

Projeto desenvolvido como parte do Bootcamp da Digital Innovation One por Alana Silva.

## Objetivo

Praticar a aplicação de padrões de projeto clássicos em Java para melhorar a organização e reutilização de código.
