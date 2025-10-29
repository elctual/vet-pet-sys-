# Use Case Diagram for Veterinarian System

## Actors
1. **Veterinarian**: Manages pet appointments and medical records.
2. **Pet Owner**: Books appointments and views pet records.
3. **Receptionist**: Manages appointments and client interactions.

## Use Cases
1. **Book Appointment**
   - Actor: Pet Owner
   - Description: The pet owner can book an appointment for their pet with a veterinarian.

2. **View Appointment**
   - Actor: Pet Owner, Receptionist
   - Description: The pet owner and receptionist can view upcoming appointments.

3. **Cancel Appointment**
   - Actor: Pet Owner, Receptionist
   - Description: The pet owner or receptionist can cancel an existing appointment.

4. **Manage Pet Records**
   - Actor: Veterinarian
   - Description: The veterinarian can view and update medical records for pets.

5. **Check Availability**
   - Actor: Receptionist
   - Description: The receptionist can check the availability of veterinarians for appointments.

6. **View Pet History**
   - Actor: Pet Owner, Veterinarian
   - Description: The pet owner and veterinarian can view the medical history of a pet.

## Diagram
```
[Pet Owner] -- (Book Appointment)
[Pet Owner] -- (View Appointment)
[Pet Owner] -- (Cancel Appointment)
[Pet Owner] -- (View Pet History)

[Receptionist] -- (View Appointment)
[Receptionist] -- (Cancel Appointment)
[Receptionist] -- (Check Availability)

[Veterinarian] -- (Manage Pet Records)
[Veterinarian] -- (View Pet History)
```

This use case diagram outlines the interactions between the actors and the system, providing a clear overview of the functionalities available in the veterinarian system.