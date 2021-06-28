# Comparando ambos Patterns

- DAO é uma abstracao da persistencia de dados, enquanto Repositório é uma abstracao de uma colecao de objetos.
- DAO é mais próximo ao sistema de armazenamento enquanto Repositório é mais próximo a camada de Dominio e Aplicacao.
- Um DAO nao pode ser implementado utilizando um Repositório, mas um repositório poderá conter um ou mais DAOs.