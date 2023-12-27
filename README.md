# Least Cost Route Project

This is a Java Spring Boot project that finds the least cost route between two Person in different exchange.

## Prerequisites

- Java 17
- Maven

## Getting Started

1. Clone the repository.
2. Build the project using `mvn clean install`.
3. Run the application  `LeastCostRoutingApplication.java`.

## For Testing
1. Use Postman to make Post call
2. Application run on port 8080, you change the port in application.properties
3. Test data is present in src/main/resources/data
4. Curl command to be used for testing
   curl --location 'http://localhost:8080/least-cost-routing/find-route' \
   --header 'Content-Type: application/json' \
   --data '{"sourcePersonName":"PersonA","destinationPersonName":"PersonE"}'


