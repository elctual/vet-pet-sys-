CREATE TABLE Veterinarians (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    specialization VARCHAR(100),
    phone VARCHAR(15),
    email VARCHAR(100)
);

CREATE TABLE Pets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    species VARCHAR(50),
    breed VARCHAR(50),
    age INT,
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES Owners(id)
);

CREATE TABLE Appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pet_id INT,
    vet_id INT,
    appointment_date DATETIME,
    notes TEXT,
    FOREIGN KEY (pet_id) REFERENCES Pets(id),
    FOREIGN KEY (vet_id) REFERENCES Veterinarians(id)
);

CREATE TABLE Owners (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(15),
    email VARCHAR(100)
);