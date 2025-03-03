# TechStore
TechStore é um aplicativo simples baseado em terminal para gerenciar produtos em uma loja. Ele permite visualizar, adicionar, atualizar, vender e excluir produtos.

## Pre-requisitos

- Java 11 or higher
- Gradle 7.0 or higher
- MongoDB

## Setup

### Clone the repository

```sh
git clone https://github.com/bruno-marqs/techstore.git
cd techstore

```
## Configure o MongoDB
Certifique-se que o MongoDB está instalado e em execução em sua máquina local. A configuração padrão assume que o MongoDB está em execução em localhost:27017.

### Build up o Projeto
```shell
./gradlew build
```
### Inicie a aplicação
```shell
./gradlew run
```
## Usando a aplicação TechStore
A aplicação TechStore é baseada em terminal. Você pode usar os comandos a seguir:

Bem vindo a TechStore
Clique 1 - Para Ver todos os produtos
Clique 2 - Para Cadastrar novo produto
Clique 3 - Para Atualizar produto
Clique 4 - Para Vender um produto
Clique 5 - Para Apagar produto
Clique 6 - Para Sair

