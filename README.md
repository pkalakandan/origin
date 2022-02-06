# Whats in the code
1. JAVA maven prtoject generated form spring intializer
2. Open API spec as per the requirements
3. Swagger code gen was used generate code and models
4. MapStruct was used to map Request to DTO, DTO to Response
5. Spring Validator used to validate business requirements
   1. couldn't achieve error codes to be retrieved from propertied for readabilty
6. Service classes were used to do the functions
7. Open CSV was used to create CSV from DTO
8. Exception Hanlder was used standardise the exception handling
9. Unit test could have been better

#What could have been done better?
1. more unit testing
2. localsed error messages
3. integration testing for OAS required fields
4. Linting
5. small and simple K6
6. 100% securing the endpoint
7. 100% encrypt the CSV file as it has BSB/Account and Payment details


# Run
mvn clean install spring-boot:run