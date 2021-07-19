# spring-hibernate-mapping
POC to study hibernate mapping

## Tech

* https://www.baeldung.com/hibernate-inheritance
* Java 11
* Spring
* Maven
* http://localhost:8080/h2-console

## Key Points
* @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
* @DiscriminatorColumn(name = "column_identifier", discriminatorType = DiscriminatorType.INTEGER)
* @DiscriminatorValue("id_n")

## Tips

* https://www.baeldung.com/spring-boot-h2-database



