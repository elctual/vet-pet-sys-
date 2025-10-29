# Veterinary System Project

## Overview
The Veterinary System is a comprehensive application designed to manage the operations of a veterinary clinic. It provides functionalities for managing pets, veterinarians, and appointments, ensuring a seamless experience for both staff and pet owners.

## Features
- **Pet Management**: Add, update, and delete pet records.
- **Veterinarian Management**: Manage veterinarian profiles and their availability.
- **Appointment Scheduling**: Schedule, update, and cancel appointments for pets.
- **Database Integration**: Utilizes a MySQL database for persistent data storage.

## Technologies Used
- **Java**: The primary programming language for the application.
- **MySQL**: The database management system for storing application data.
- **Java Swing**: For creating the user interface.

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

## Installation
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd vet-pet-system
   ```
3. Set up the MySQL database using the provided `schema.sql` file located in `src/main/resources/database/`.

## Usage
- Run the application by executing the `MainView` class.
- Follow the on-screen instructions to manage pets, veterinarians, and appointments.

## Diagrams
- **ER Diagram**: Refer to `docs/diagrams/er-diagram.md` for the Entity-Relationship diagram.
- **Use Case Diagram**: Refer to `docs/diagrams/use-case-diagram.md` for the Use Case diagram.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.