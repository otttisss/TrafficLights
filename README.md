# Traffic Light Control System

This project implements a traffic light control system with support for manual and automatic modes. It is a multi-module Spring Boot application.

## Modules

### 1. Interfaces and API

- Defines interfaces and API for the traffic light system.
- Contains exception handling.

### 2. Storage

- Manages the "local storage" (not a database).
- Includes functions to retrieve the current state and store POJO objects.

### 3. Logic REST

- Handles HTTP requests and defines endpoints for controlling the traffic light.
- Utilizes Spring MVC for request handling.

### 4. Backend and Background Tasks Logic

- Encompasses the core logic for the traffic light's behavior.
- Implements background tasks scheduling using Spring's scheduler.

## How to Run

1. Make sure you have [Java](https://www.java.com/) and [Maven](https://maven.apache.org/) installed on your system.

2. Clone the repository:

''git clone https://github.com/otttisss/TrafficLights.git''

3. Navigate to the project directory:

''cd traffic-light-control''


4. Build the project:

''mvn clean install''

5. Start the application:

''mvn spring-boot:run''


The application will start, and you can access it at [http://localhost:8080](http://localhost:8080).


## Usage

### Manual Mode

- In manual mode, you can switch the traffic light manually using the following endpoints:

- `POST /switch-red` - Switch to red.
- `POST /switch-yellow` - Switch to yellow.
- `POST /switch-green` - Switch to green.

### Automatic Mode

- The traffic light operates automatically based on a predefined schedule.
- The automatic mode logic is implemented in the `TrafficLightScheduler` class.

### Set Mode

- You can set the mode (manual or automatic) using the following endpoint:

- `POST /set-mode?mode={mode}` - Set the mode (Replace `{mode}` with either `manual` or `automatic`).

### Get Current State

- Retrieve the current mode of the traffic light:

- `GET /current-state`

## Testing

The project includes JUnit tests for various components. To run the tests, use the following command:

''mvn test''


## Contributors

- [Efim](https://github.com/otttisss)

## License

This project is licensed under the [MIT License](LICENSE).

