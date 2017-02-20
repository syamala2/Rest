# Rest
This simple demo application for Spring rest

* AnimalSearchRest - This Spring rest service implementation for getting region of 3 Animals, validating it against XSD and Checking Duplicate request in last 1 day.
* AnimalRestClient - Sample Spring Rest client using RestTemplate
* DatabaseTables.sql - Contains script for creating the needed Tables.

### Framework/Container Used 

    Spring MVC, Spring JDBC, Jackson2xml, stax2, Junit, Mockito, Tomcat

### Test URI 

    http://localhost:8080/AnimalSearchRest/v1/animals/region?requestXml=<animalrequest xmlns="com.cognizant.animalearchapp.rest"><name>Elephant</name><name>tiger</name><name>DOg</name></animalrequest>
