# FIAP - GH3Corp Challenge B2W

Um grupo composto por alunos do curso de `TDST` noturno da `FIAP`.

## Integrantes do grupo Gh3

- [x] Alexandre Pacheco do Couto (85657)
- [x] Allan Phyllyp Reis (85619)
- [x] Dihogo Cassimiro Teixeira (84082)
- [x] Fernando Borgatto Bouman (85833)
- [x] Ingrid Pinheiro (83579)
- [x] Juan Carlos Benvive Serrano (85468)

## Quem é a B2W Digtal?

A `B2W` é uma Companhia Digital,
líder na América Latina, cuja história se confunde com a própria história do e-commerce no Brasil. 
O propósito da Companhia é `CONECTAR PESSOAS`, `NEGÓCIOS`, `PRODUTOS E SERVIÇOS` em uma mesma plataforma digital. 
A Companhia possui as maiores e mais queridas marcas da internet (`Americanas.com`, `Submarino`, `Shoptime`,`Sou Barato`)
e uma operação de marketplace em rápido crescimento. A companhia atua nas seguintes frentes: 
`e-commerce` (1P) e `Marketplace` (3P) por meio das marcas `Americanas.com`, `Submarino`, `Shoptime`; 
serviços de crédito ao consumidor `Submarino Finance` e `Digital Finance`; pagamentos, crédito e serviços financeiros 
através da `Ame`; plataforma de tecnologia; e soluções de logística, distribuição e atendimento ao cliente.

## Problemática

`B2W` não possui uma plataforma unificada referente ao recrutamento de novos talentos para cia como: 
Provas, Status do recrutamento, análise de código, análise de documentação. 
Então há à necessidade de contratar vários serviços, o que demanda tempo e mais custo.

## Solução

Sistema de digitalização de documentos para o `RH` da `B2W`. 
A finalidade principal deste software será facilitar o acesso, com agilidade e segurança, 
a todas as fichas de empregados alocados em diferentes lugares do `Brasil` e do Mundo.

## Build local do projeto no Docker:

Para criar a imagem do projeto certifique-se que esteja na pasta raiz dele e execute a sequencia de comandos: 

```
$ docker image build . -t b2w-build-local:latest

$ docker run -dti --name challenge-teste -p 8080:80 b2w-build-local
```

Conferindo se o container está em execução:

```
$ docker ps

CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                  NAMES
692d807ff1d2        b2w-build-local     "/usr/sbin/httpd -D …"   4 minutes ago       Up 3 minutes        0.0.0.0:8080->80/tcp   b2w-build-local

```

Após finalizar a subida do container, acesse o endereço local da sua maquina indicando a porta exposta no host local:

`Exemplo:` http://127.0.0.1:8080

## Baixando imagem direto do Dockerhub:

```
$ docker pull docker push gh3corp/web-challenge-b2w:latest

$ docker run -dti --name gh3-b2w-build -p 8080:80 gh3corp/web-challenge-b2w:latest
```