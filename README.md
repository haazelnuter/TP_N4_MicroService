# TP_N4_MicroService
Activité Pratique N°4 : Mise en oeuvre d'un micro-service
# Travail à faire :
1. Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok
2. Créer l'entité JPA Compte
3. Créer l'interface CompteRepository basée sur Spring Data
4. Tester la couche DAO
5. Créer le Web service Restfull qui permet de gérer des comptes
6. Tester le web micro-service en utilisant un client REST comme Postman
7. Générer et tester le documentation Swagger de des API Rest du Web service
8. Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections
9. Créer les DTOs et Mappers
10. Créer la couche Service (métier) et du micro service
11. Créer un Web service GraphQL pour ce micro-service 
************************************RESPONSE*************************************
 Teste du web micro-service en utilisant le client REST (Postman)
 -->>bankaccounts
 ![4](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/50a045aa-804d-4462-87f7-e0be2828382b)
 -->>bankaccounts/{id}
 ![5](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/f0e3486c-6c75-4fc8-b19d-27f39a491b05)
-->>POST: bankacounts
![7](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/aada2049-c98b-4ef5-bdbc-7da0fba083df)
-->>GET:bankaccounts/{id}
![6](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/67a7a176-70e7-4ac2-a045-6d54dc3815ae)
-----------------SWAGGER---------------------------------
Teste de la documentation Swagger des API Rest du Web service
![9](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/460c4107-4b90-46ce-b0a5-0208ce6dd3e1)
-->>bankaccounts/{id} using SWAGGER
![10](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/2d13a9f5-8f83-411f-8eb4-ca9c435ca261)
--------------------------------PROJECTION--------------------------------
![projection](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/c29304c2-d793-4cdf-af8f-0449ea7b4dbc)
--------------------------------SCHEMADTO---------------------------------
![schema_dto](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/ab1814d8-2750-4354-9571-5033050c5e51)
---------------------------------SPRING DATA REST------------------------------------------------------------
![spring_data_rest](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/6ed4ca7b-cb06-4889-9c43-5a3907cfcd41)
-------------------------------------FINDBYTTYPE--------------------------------------------------------------
![findByType](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/ef7bdd43-e841-4b91-a8ce-6e567135080f)
-----------------------------------------CUSTOMERS IN DATABASE------------------------------------------
![customer](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/b5066c52-5a07-43ef-ac1d-04e9aed95eb6)
----------------------------------GET ALL BANKACCOUNTS--------------------------------------------------------
![1](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/43dd3f47-9728-4e7f-a9ee-c2a68a56c264)
----------------------FIRST TEST USING BROWSER---------------------------------------------------------
![2](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/e769a173-52d2-46a8-82cf-fa41de5abd6d)
![3](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/3619f4bf-f926-417b-b4bb-e2de6df20a45)
![3](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/389de77a-6b31-4d10-a1e3-15296e5b4479)
------------------------------GRAPHQL-------------------------------------------------------
1/![graphql1](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/7d556fbd-d26f-4e24-91bd-cd8cc5e94569)
2/ ![graphql2](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/0f2e301f-5c15-4efa-b1b7-d6f2f3266aac)
3/ ![graphql3](https://github.com/haazelnuter/TP_N4_MicroService/assets/96618018/e0cbe8b6-d422-4af6-b6b2-83beaa73e79b)
***************************fin***************************************************************************************



