Descrição curta do Projeto

O Sistema de Gestão de Convidados é uma aplicação web desenvolvida utilizando tecnologias avançadas do ecossistema Spring. Projetado para facilitar a organização de eventos e festas, a aplicação permite o registro fácil e eficiente de convidados principais e seus acompanhantes.

## Sistema de Gestão de Convidados

Bem-vindo ao Sistema de Gestão de Convidados! Esta aplicação simples foi desenvolvida utilizando o Spring Boot, Spring MVC, Spring Data JPA, Spring Security e Thymeleaf. O objetivo principal é facilitar a gestão de convidados para eventos, permitindo o registro do nome do convidado principal e a quantidade de acompanhantes que o acompanharão.

### Funcionamento

A aplicação possui uma única tela com campos de entrada para o nome do convidado e a quantidade de acompanhantes. Após inserir essas informações, basta clicar no botão "Adicionar". Os dados cadastrados serão exibidos em uma tabela logo abaixo, proporcionando uma visão clara dos convidados registrados até o momento.

### Ferramentas Utilizadas

- **Spring Boot:** Facilita a criação de aplicativos Spring stand-alone, simplificando a configuração e o desenvolvimento.
- **Spring MVC:** Framework para desenvolvimento de aplicativos web baseados no padrão MVC.
- **Spring Data JPA:** Simplifica o acesso a dados em bancos de dados relacionais.
- **Spring Security:** Oferece recursos de segurança para proteger a aplicação contra ameaças comuns.
- **Thymeleaf:** Motor de templates para construção de páginas web utilizando HTML, permitindo integração fácil com o Spring.

### Instruções de Uso

1. **Cadastro de Convidados:**
   - Insira o nome do convidado principal no campo designado.
   - Informe a quantidade de acompanhantes que o convidado trará.
   - Clique no botão "Adicionar" para registrar o convidado.

2. **Visualização dos Convidados:**
   - Os dados cadastrados serão exibidos em uma tabela abaixo do formulário.

### Como Executar a Aplicação

Certifique-se de ter o [Java](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.

1. Clone este repositório:

   ```bash
   git clone https://seurepositorio.com/sua-aplicacao.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd sua-aplicacao
   ```

3. Execute a aplicação:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Abra seu navegador e acesse [http://localhost:8080](http://localhost:8080).

### Contribuição

Contribuições são bem-vindas! Se encontrar algum problema ou tiver sugestões de melhorias, por favor, abra uma [issue](https://github.com/seu-usuario/sua-aplicacao/issues).

### Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).
