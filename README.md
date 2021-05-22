# Backend - Controle de Fila

## Instalação
Após clonar o projeto, deve-se gerar um arquivo WAR com o comando **mvn clean package**.

Baixe o Apache Tomca em https://tomcat.apache.org/download-80.cgi t e descompacte-o.
Copie o arquivo WAR de target gerado para a  pasta tomcat/webapps/
No terminal, navegue até a pasta tomcat/bin e execute ** catalina.bat run** (no Windows).
A aplicação estará rodando no endereço http://localhost:8080.

## Banco de dados
Deve-se utilizar o PostgresSql como banco de dados. Você pode fazer o seu download em https://www.postgresql.org/download/.
Após a sua instalação, crie um banco dados e substitua as informação do seu banco de dados no arquivo
**application.properties** que está localizado na pasta **resources.**