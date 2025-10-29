# ER Diagram for Veterinarian System

## Entities

1. **Veterinarian**
   - **Attributes:**
     - vet_id (Primary Key)
     - name
     - specialization
     - phone_number
     - email

2. **Pet**
   - **Attributes:**
     - pet_id (Primary Key)
     - name
     - species
     - breed
     - age
     - owner_id (Foreign Key)

3. **Owner**
   - **Attributes:**
     - owner_id (Primary Key)
     - name
     - phone_number
     - email

4. **Appointment**
   - **Attributes:**
     - appointment_id (Primary Key)
     - pet_id (Foreign Key)
     - vet_id (Foreign Key)
     - appointment_date
     - notes

## Relationships

- **Veterinarian** to **Appointment**: One-to-Many
  - A veterinarian can have multiple appointments.

- **Pet** to **Appointment**: One-to-Many
  - A pet can have multiple appointments.

- **Owner** to **Pet**: One-to-Many
  - An owner can have multiple pets.

## Diagram Representation

```
[Veterinarian] 1 ---- * [Appointment]
[Pet] 1 ---- * [Appointment]
[Owner] 1 ---- * [Pet]
```

This ER diagram outlines the structure of the veterinarian system's database, detailing the entities, their attributes, and the relationships between them.