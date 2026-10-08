# Java Flight Booking System
## Note
This is an older university project and has been uploaded primarily to demonstrate previous programming experience as part of my CV and development portfolio. It is not actively maintained.

## About the Project

This is a console-based flight booking application where users can select a departure location, destination and flight class before receiving a booking confirmation.

The application supports both English and French and includes error handling for invalid user input.

## Features

- Flight booking system
- First Class, Business Class and Coach Class options
- Multiple departure and destination locations
- English and French language support
- Input validation and custom exception handling
- Multithreading using Java Threads
- Object-oriented programming and inheritance
- Java `ArrayList` collections
- File-based logging
- Audio feedback based on selected flight class

## How to Run

Open the project in a Java IDE such as IntelliJ IDEA or Eclipse.

Run:

`src/menu/Booking.java`

The `Booking` class contains the main method and starts the application.

Make sure the project libraries and required resources are available, including the `lib/` and `sounds/` folders.

## How to Use

1. Start the application by running `src/menu/Booking.java`.
2. Select a language:
   - `1` - English
   - `2` - French
3. Select your departure location.
4. Select your destination.
5. Select a flight class:
   - `1` - First Class
   - `2` - Business Class
   - `3` - Coach Class
6. The application displays a booking confirmation containing the selected flight details.
7. Choose whether to make another booking, change language or exit the application.

Invalid selections are handled by the application and the user is given an opportunity to try again.

## Project Structure

- `src/` - Java source code
- `lib/` - Project libraries
- `sounds/` - Audio files used by the application
- `docs/` - Project documentation

## Technologies

- Java
- Object-Oriented Programming
- Inheritance
- Exception Handling
- Multithreading
- Java Collections
- File I/O
- `ResourceBundle` localisation

