# CP2_JAVA

FIAP – Faculdade de Informática e Administração Paulista
Curso de Tecnologia em Análise em Desenvolvimento de Sistemas (TDS)

Checkpoint 2
Programação Spring Boot com Persistência

Foi desenvolvido um programa de gerenciamento de brinquedos para uma empresa voltada para o público infantil de até 12 anos, o programa foi desenvolvido utilizando o framework spring boot configurado com maven, juntamente com o banco de dados Oracle e teste dos endpoints utilizando o software Postman. 

Imagem do Spring Initializr com a configuração final e suas dependências. 
![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/1bed1f53-00c2-477b-9f57-44ed6f27a4a8)

Antes do desenvolvimento do código, as tabelas foram criadas no banco de dados para consulta.

 ![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/6168c3d7-e02f-44f7-9b99-55738b3dac26)
 
Após isso, o código começou a ser criado, classes e um repositório.

![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/518cf166-dfc2-455a-974f-1313f6f37401)

Na pasta Checkpoint2_LojaBrinquedo contém o código que inicia uma aplicação spring boot e possuí o método principal da aplicação Spring Boot. Ele inicia a aplicação Spring Boot passando a própria classe Checkpoint2LojaBrinquedoApplication e os argumentos recebidos pela linha de comando.

![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/1f42b818-d501-4a79-abc5-36bd31384059)

Na pasta seguinte, Controller, contém @GetMapping e @PostMapping. O @GetMapping é usado para mapear requisições HTTP GET para métodos Java. No método getAllBrinquedos(), esta anotação mapeia solicitações GET para o caminho /brinquedos, então quando uma solicitação GET é feita para /brinquedos, este método é chamado e retorna uma lista de todos os brinquedos do repositório. O @PostMapping é uma anotação usada para mapear requisições HTTP POST para métodos Java. No método addBrinquedo(), esta anotação mapeia solicitações POST para o caminho /brinquedos, então quando uma solicitação POST é feita para /brinquedos, este método é chamado e adiciona um novo brinquedo ao repositório, utilizando o corpo da requisição como dados para o novo brinquedo.

![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/c34e2b82-364a-4b06-a5fd-4dc9f9ea6e12)

Na pasta seguinte, Entity, a classe é marcada como uma entidade JPA que significa que objetos desta classe podem ser mapeados para tabelas de banco de dados. Além disso possuí uma anotação que especifica o nome da tabela no banco de dados que será usada para armazenar instâncias desta entidade (TDS_TB_BRINQUEDO). Depois, a classe declara campos privados para representar diferentes atributos de um brinquedo, como id, nome, tipo, classificação, tamanho e preço.
As anotações @Id e @GeneratedValue(strategy = GenerationType.IDENTITY) marcam o campo id como a chave primária da tabela e especificam que o valor do id será gerado automaticamente pelo banco de dados usando a estratégia de identidade. 
O código define uma classe Brinquedo que pode ser usada para representar brinquedos em uma aplicação Java. Esses objetos podem ser mapeados para uma tabela de banco de dados usando a API de persistência JPA.

![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/dfd77454-bd92-41dc-8145-3038c044d410)
![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/e97f1ce4-c029-40a1-a51b-536b687a8276)

Os getters e setters possuem mais linhas de código, mas não foram todas incluídas na imagem.
![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/98b7ae4c-c13b-4de7-9ae8-3242c1801126)
![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/ac6dd3c5-ee58-4e57-b458-a725b6dc8bac)

A pasta Repository, define uma interface que estende a interface JpaRepository da estrutura Spring Data JPA portanto o código herda todos os métodos definidos em JpaRepository, incluindo métodos para salvar, excluir, buscar todos os registros, buscar por ID, entre outros. 

![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/ccb97c28-a506-4356-b39c-6c9b1a1a9371)

Essas foram as linhas de códigos para rodar o programa pronto. Agora, os testes foram feitos e os resultados foram positivos.

Depois de rodar a aplicação este é o resutado obtido.
![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/1869307e-9a3f-4164-87d3-fddc4fd763aa)

Essa imagem, mostra o Get e Post dentro do Postman.
![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/e2dce6df-5b38-49c1-b65c-f15980bd6b95)

Nesse teste, as informações sobre o brinquedo foram requisitados no banco de dados.
![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/d18a30b2-435f-4739-951a-a4415b007061)

Aqui, o Post está executando a requisição que envia dados ao servidor.
![image](https://github.com/bwtrxz/CP2_JAVA/assets/130010850/1844728c-3537-4fca-9bf2-05b6465c5cd7)









 
