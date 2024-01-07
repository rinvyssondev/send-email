# send-email

- o objetivo do projeto é de criar um login e em seguida receber um email personalizado. Projeto foi feito para aprimorar os meus conhecimentos em Java utilizando o framework Spring boot.

# Executando o projeto:

- Para executar o projeto basta ter o java instalado, nesse projeto estou utilizando o java 17 com o spring boot na versão
3.1.2.
- Vá até a raíz do projeto e execute o comando *docker-compose up -d* isso fará com que o banco de dados seja executado dentro de um container.
- Se estiver utilizando o IntelliJ vá na aba ao lado do botão de executar o projeto depois clique em Edit Configuration, dentro dele
terá o Environment variables.
- Dentro de Environment variables crie $USER_MAIL = **coloque o seu email** e $USER_PASSWORD = **coloque o seu password**.
- Para gerar o password vá na sua conta google e clique em "Gerenciar minha conta" >> Seguranca >> Verificacao em duas etapas, veja se essa verificacao está com um ok verde ao lado.
- Depois vá em pesquisar e coloque "senhas de app" depois é só seguir com o passo a passo e no final ele dará uma senha do tipo "ueha ueha euha ueha" guarde e utilize ela lá no $USER_PASSWORD = **coloque o seu password**.
- Agora é só entrar no postman (ou similares) e colocar para enviar como POST nessa rota "http://localhost:8080/user" com os parametros.


- **"name": "coloque o seu nome"**
- **"email": "coloque seu email"**
- **"password": "coloque a sua senha"**


Estou fazendo algumas melhorias no projeto.
 