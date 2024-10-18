### Resumo do Projeto: Consulta de CEP em Java com API

Este projeto foi desenvolvido em Java e tem como objetivo consultar um endereço com base no CEP fornecido pelo usuário. A aplicação utiliza uma API de consulta de CEP, que permite buscar informações detalhadas de endereço, como rua, bairro, cidade e estado, a partir de um CEP informado.

#### Principais Funcionalidades:
1. **Entrada de Dados**: O usuário insere um CEP na interface do programa.
2. **Consulta à API**: A aplicação faz uma requisição HTTP para a API de consulta de CEP, utilizando o CEP informado.
3. **Processamento da Resposta**: A resposta da API é processada para extrair os detalhes do endereço.
4. **Exibição dos Resultados**: Os dados retornados, como rua, bairro, cidade e estado, são exibidos de forma estruturada para o usuário.

#### Tecnologias Utilizadas:
- **Java**: Linguagem principal para desenvolvimento.
- **Bibliotecas de HTTP**: Utilizadas para realizar as requisições à API (por exemplo, `HttpURLConnection` ou bibliotecas como `OkHttp`).
- **API de CEP**: API de serviço que retorna informações de endereço com base no CEP (como a API ViaCEP, muito popular no Brasil).

#### Benefícios:
- **Automatização da Busca**: Permite ao usuário encontrar rapidamente o endereço completo, evitando a necessidade de consulta manual em sites.
- **Integração com APIs**: Demonstra a aplicação prática de requisições HTTP em projetos Java, sendo um ótimo exemplo de integração de sistemas.
- **Melhor Experiência de Usuário**: Simplicidade na entrada de dados e rapidez no retorno das informações.

Este projeto é ideal para quem busca entender como realizar requisições a APIs externas em Java e integrar funcionalidades práticas em suas aplicações.
