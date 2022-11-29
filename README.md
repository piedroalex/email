# Projeto: email

## Descrição

Microsserviço para envio de e-mail.

## Pré-Requisitos

- [x] [Ambiente de execução: Java](https://www.java.com/pt-BR/download/manual.jsp)
- [x] [Banco de dados: Postgres](https://www.postgresql.org/download/)
- [x] [IDE: Postman](https://www.postman.com/downloads/)
- [x] [Mensageria: RabbitMQ](https://www.rabbitmq.com/#getstarted)
- [x] [Serviço de e-mail: Gmail](https://support.google.com/accounts/answer/185833)

## Como rodar a aplicação

1. Executar o RabbitMQ e o Postgres.
2. Clone o repositório para sua máquina
3. Abra um terminal e navegue até o repositório
4. Para rodar o projeto, execute o comando: ```./mvnw spring-boot:run```
5. Utilizando o RabbitMQ, adicionar uma mensagem na fila passando no payload um JSON com os seguintes atributos:
```
{
    "ownerRef": "Nome do remetente",
    "emailFrom": "E-mail do remetente",
    "emailTo": "E-mail do destinatário",
    "subject": "Título do e-mail",
    "text": "Corpo do e-mail"
}
```
