# API de Gestion de Tâches

## Prérequis
- Java 17+
- Maven

## Installation
1. Cloner le dépôt :

````bash git clone https://github.com/votre-utilisateur/task-manager-api.git````

## Lancer l'API
``mvn spring-boot:run``

## Tester les EndPoints

    Créer une tâche : POST /api/tasks

    Lister les tâches : GET /api/tasks/all

    Mettre à jour : PUT /api/tasks/{id}

    Supprimer : DELETE /api/tasks/{id}

## SWAGGER API

Accéder à Swagger UI

``http://localhost:${port}/swagger-ui.html``
le numero de port est présent dans le fichier "application.properties" du repertoire "ressources" du projet
