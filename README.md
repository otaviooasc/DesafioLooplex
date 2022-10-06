# DesafioLooplex


Olá, fiz esse desafio usando SpringBoot, jpa/hibernate e o banco de dados H2.

#Instruções para a execução

Para efetuar as requisições use o postman.

Após subir a aplicação via uma IDE da sua preferencia use o link: localhost:8080/api/documentos no postman para efetuar uma requisição GET.

Para efetuar um POST/inserir um novo doc use: localhost:8080/api/inserir com o JASON exemplo abaixo:



    {"id": 2,

    "nome": "Documento 2",

    "listBrach": [

        {

            "id": 3,

            "nome": "Branch 1",

            "date": "06/10/2022 11:39:32",
            "profundidade": "A profundidade da branch é: 1",
            "leaf": [
                {
                    "id": 4,
                    "nome": "Leaf 1",
                    "date": "06/10/2022 11:39:32"
                },
                {
                    "id": 5,
                    "nome": "Leaf 2",
                    "date": "06/10/2022 11:39:32"
                }
            ]
        },
        {
            "id": 4,
            "nome": "Branch 2",
            "date": "06/10/2022 11:39:32",
            "profundidade": "A profundidade da branch é: 2",
            "leaf": [
                {
                    "id": 6,
                    "nome": "Leaf 3",
                    "date": "06/10/2022 11:39:32"
                },
                {
                    "id": 7,
                    "nome": "Leaf 4",
                    "date": "06/10/2022 11:39:32"
                }
            ]
        }
    ]}
