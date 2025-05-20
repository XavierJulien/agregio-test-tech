# agregio-test-tech

# ⚡ Agregio - Test Technique

Ce projet est une application de démonstration développée dans le cadre d'un exercice technique pour Agregio.  
Il s'appuie sur une architecture hexagonale avec Spring Boot, et modélise la gestion d'offres de vente d'énergie sur différents marchés.

## Architecture

Le projet suit une architecture hexagonale :

```

📦 agregio-test-tech
├── application          # Adapters et Command
│   └── mapper           # Mappers MapStruct (DTO <-> Domaine)
├── domain               # Modèle métier (entités, services, repository)
├── infrastructure
│   ├── adapter
│       ├── api          # Controllers REST + DTOs
│       └── persistence  # Repositories JPA + Entities

````

---

## 🚀 Technologies utilisées

- Java 17
- Spring Boot
- Spring Data JPA
- H2 (base de données en mémoire)
- Liquibase (versioning de schéma)
- MapStruct (mappings automatiques)
- Maven

---

## ▶️ Lancer le projet

### Pré-requis
- JDK 17+
- Maven 3.6+

### Commandes

```bash
# Cloner le projet
git clone https://github.com/votre-utilisateur/agregio-test.git
cd agregio-test-tech

# Lancer l'application
mvn spring-boot:run
````

L'application démarre sur : [http://localhost:8080](http://localhost:8080)

---

## 🔄 Endpoints REST

### 📌 Offres

* `POST /offres` : créer une offre avec ses blocs horaires
* `GET /offres?marche=PRIMAIRE` : liste les offres par marché

### 📌 Parcs

* `POST /parcs` : créer un parc de production
* `GET /parcs?marche=PRIMAIRE` : liste les parcs qui participent à des offres sur ce marché

---

## 📂 Exemple JSON - Création d'une offre

```json
{
  "marche": "PRIMAIRE",
  "blocHoraire": [
    {
      "heureDebut": "2025-05-21T00:00:00",
      "heureFin": "2025-05-21T03:00:00",
      "puissanceMw": 12.5,
      "prixPlancher": 45.0,
      "parcIds": ["1L, 2L"]
    }
  ]
}
```

## 🧠 Idées d'amélioration

* Ajout de la documentation Swagger
* Gestion des erreurs plus riche (codes + messages)
* Ajout de tests automatisés
* Ajouts de tests unitaires/intégrtion

---

## 👨‍💻 Auteur

Julien Xavier
Contact : [LinkedIn](https://www.linkedin.com/in/julienxavier774)
---

## ⚖️ Licence

Ce projet est fourni à des fins d’évaluation technique uniquement.


