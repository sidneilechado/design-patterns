## O que é Anemic Model

Um anti-pattern muito discutido por `Martin Fowler`, criador do Domain Driven Design, resumidamente expressa que, lógicas de domínio que sao apenas "getters" e "setters" deveriam ser retrabalhados, seja adicionando validacoes, comportamentos ou o que for necessário para executarmos as operacoes de **dominio**.

E é ai que repositório comeca fazer sentido, pois um repositório por mais que sua interface devera ser implementada na camada de domínio, sua implementacao deve pertencer a aplicacao e organizar como os dados daquela **colecao** devem ser tratados.