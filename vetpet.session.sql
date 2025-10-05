CREATE TABLE appointment (appID INT PRIMARY KEY, appDate DATETIME(0), appReason VARCHAR(255),petID INT,vetID INT);
CREATE TABLE vaccine (vacID INT PRIMARY KEY, vacName CHAR(64), vacDescription VARCHAR(255));
CREATE TABLE vet (vetID INT PRIMARY KEY, vetName CHAR(64), hireDate DATE, leavingDate DATE);
CREATE TABLE petSurg (surgID int PRIMARY KEY, surgType CHAR(64), surgCost DECIMAL(10,2),petID INT);
CREATE TABLE petTreatment (treatID INT PRIMARY KEY, trtDescription VARCHAR(255), trtMedication VARCHAR(255), trtCost DECIMAL(10,2),petID INT);
CREATE TABLE petVac (vacPetID INT PRIMARY KEY, vacFirstDate DATE, dueDate DATE, isVaccinated BOOL,petID INT,vacID INT);
CREATE TABLE pet (petID INT PRIMARY KEY, petName CHAR(64), dateOfBirth DATE, bread CHAR(64), gender CHAR(64), species CHAR(64),  chronicIll VARCHAR(225),ownerID INT);
CREATE TABLE owner (ownerID INT PRIMARY KEY, ownerName VARCHAR(225), ownerPhoneNum VARCHAR(12), numberOfPets INT);
#ALTER TABLE your_table_nameADD CONSTRAINT fk_nameFOREIGN KEY (column_name)REFERENCES referenced_table_name(referenced_column_name);

ALTER TABLE appointment 
ADD CONSTRAINT fkPetIDapp FOREIGN KEY (petID) REFERENCES pet(petID),
ADD CONSTRAINT fkVetIDapp FOREIGN KEY (vetID) REFERENCES vet(vetID);

ALTER TABLE petSurg 
ADD CONSTRAINT fkPetIDsurg FOREIGN KEY (petID) REFERENCES pet(petID);

ALTER TABLE petTreatment 
ADD CONSTRAINT fkPetIDtrt FOREIGN KEY (petID) REFERENCES pet(petID);

ALTER TABLE petVac 
ADD CONSTRAINT fkPetIDvac FOREIGN KEY (petID) REFERENCES pet(petID),
ADD CONSTRAINT fkVacIDvac FOREIGN KEY (vacID) REFERENCES vaccine(vacID);

ALTER TABLE pet
ADD CONSTRAINT fkOwnerIDpet FOREIGN KEY (ownerID) REFERENCES owner(ownerID);
