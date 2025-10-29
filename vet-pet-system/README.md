# Veterinarian System

## Overview
The Veterinarian System is a comprehensive application designed to manage veterinary practices, including appointment scheduling, pet management, and veterinarian information. The system utilizes a MySQL database for data storage and Java for both the user interface and backend logic.

## Features
- **Appointment Management**: Schedule, view, and manage appointments for pets.
- **Pet Management**: Add, update, and delete pet records.
- **Veterinarian Management**: Manage veterinarian details and availability.
- **Database Integration**: Utilizes MySQL for persistent data storage.

## Project Structure
```
vet-pet-system
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controllers
│   │   │   ├── models
│   │   │   ├── dao
│   │   │   ├── utils
│   │   │   └── views
│   │   └── resources
│   └── test
├── docs
│   ├── diagrams
│   └── README.md
├── lib
├── .gitignore
└── README.md
```

## Database Schema
The database schema is defined in `src/main/resources/database/schema.sql`. It includes tables for appointments, pets, and veterinarians.

## Configuration
Configuration properties can be found in `src/main/resources/config.properties`.

## Diagrams
- **ER Diagram**: Located in `docs/diagrams/er-diagram.md`
- **Use Case Diagram**: Located in `docs/diagrams/use-case-diagram.md`

## Getting Started
1. Clone the repository.
2. Set up the MySQL database using the provided schema.
3. Configure the application properties as needed.
4. Run the application using your preferred Java IDE.

## License
This project is licensed under the MIT License.