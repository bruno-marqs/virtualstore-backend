# TechStore
TechStore é um aplicativo simples baseado em terminal para gerenciar produtos em uma loja. Ele permite visualizar, adicionar, atualizar, vender e excluir produtos.

## Pre-requisitos

- Java 11 or higher
- Gradle 7.0 or higher
- MongoDB

## Setup

### Clone the repository

```sh
git clone https://github.com/bruno-marqs/virtualstore.git
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
### Execute o arquivo Main.kt
A aplicação TechStore é baseada em terminal. Você pode usar os comandos a seguir:

Bem vindo a TechStore 
Clique 1 - Para Ver todos os produtos 
Clique 2 - Para Cadastrar novo produto 
Clique 3 - Para Atualizar produto 
Clique 4 - Para Vender um produto 
Clique 5 - Para Apagar produto 
Clique 6 - Para Sair

## Validação de Novo Produto
Para adicionar um novo produto, você deve fornecer o nome, a descrição, o preço e a quantidade. 
O preço e a quantidade devem ser números válidos.
* "Nome do produto não pode ser vazio" 
* "Quantidade do produto não pode ser negativa" 
* "Preço deve ser maior que zero" 

# Exemplo de tela com a Aplicação Funcionando
<img width="618" alt="Captura de Tela 2025-03-03 às 09 34 09" src="https://github.com/user-attachments/assets/f535ffd5-c9cb-455a-a3d1-2aa491562f57" />
