# Presentation
[View slides on slides.com](https://slides.com/znatanalves/docker-basics)

# Instalação

Atualizar o banco de pacotes

```
$ sudo apt-get update
```
Adicionar chave GPG para garantir a segurança dos dados durante a transferência dos arquivos entre os servidores do Docker e sua máquina.

```
$ sudo apt-key adv --keyserver hkp://p80.pool.sks-keyservers.net:80 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D
```

Adicionar o repositório do Docker as fontes do APT
```
$ sudo apt-add-repository 'deb https://apt.dockerproject.org/repo ubuntu-xenial main'
```

Atualizar o banco de pacotes com a nova fonte do Docker

```
$ sudo apt-get update
```

Garantir que o APT faça o download do repositório do Docker ao invés do repositório padrão do Ubuntu

```
$ apt-cache policy docker-engine
```

E finalmente instalar

```
$ sudo apt-get install -y docker-engine
```

Para checar se o serviço do Docker está rodando

```
$ sudo systemctl status docker
```

# Rodando o projeto

Navegue até o diretório `src` e rode o comando abaixo:

```
$ [sudo] docker build -f Dockerfile -t hello/docker:8
```