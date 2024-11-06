# Bank Account Management

Este repositório contém a implementação de um sistema simples de gerenciamento de contas bancárias utilizando a linguagem de programação Java. Através da programação orientada a objetos (POO), o sistema modela operações bancárias como crédito, débito e transferências entre contas.

## Funcionalidades

- **Criação de contas**: Criação de contas bancárias com um identificador único (ID), nome do titular e saldo.
- **Crédito e débito**: Métodos para adicionar (crédito) ou subtrair (débito) um valor da conta.
- **Transferência**: Permite transferir valores de uma conta para outra, com verificação de saldo.

## Estrutura do Projeto

- **Classe `Account`**: Representa uma conta bancária. Contém métodos para realizar operações como crédito, débito e transferências.
- **Classe `TestMain`**: Classe principal para testar a funcionalidade do sistema. Exibe exemplos de como as operações funcionam.

## Como Usar

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/leticiamourass/bank-account-management

2. **Compile os Arquivos Java**

Navegue até o diretório do projeto e compile os arquivos .java:

cd REPOSITORIO
javac Rectangle.java TestMain.java

## Exemplo de Execução


A seguir, um exemplo de saída gerado pelo sistema:

Account[id=A101,name=Tan Ah Teck,balance=88]

Account[id=A102,name=Kumar,balance=0]

ID: A101

Name: Tan Ah Teck

Balance: 88

Account[id=A101,name=Tan Ah Teck,balance=188]

Account[id=A101,name=Tan Ah Teck,balance=138]

Amount exceeded balance

Account[id=A101,name=Tan Ah Teck,balance=138]

Account[id=A101,name=Tan Ah Teck,balance=38]

Account[id=A102,name=Kumar,balance=100]
