**CongestionTaxCalculator**


CongestionTaxCalculator is a Springboot REST Api service to calculate the congestion tax  in Gothenberg  City.

As part of calculation, this applications implemented some of exemption on Holidays, weekends and some of vehicle.

REST Endpoint:

API URL: http://localhost:8080/tax/calculator

API method: POST

API Content Type: application/json

Input Json:

{

    "vehicle_type": "Car",
    "dates": [
    
        "2013-01-14 21:00:00","2013-01-15 21:00:00",
        "2013-02-07 06:23:27","2013-02-07 15:27:00",
        "2013-02-08 06:27:00","2013-02-08 06:20:27",
        "2013-02-08 14:35:00","2013-02-08 15:29:00",
        "2013-02-08 15:47:00","2013-02-08 16:01:00",
        "2013-02-08 16:48:00","2013-02-08 17:49:00",
        "2013-02-08 18:29:00","2013-02-08 18:35:00",
        "2013-03-26 14:25:00","2013-03-28 14:07:27"
	
    ]
    
}


Output:

   {
   
		"error": null,
		"tax": 58,
		"message": "Tax calculated successfully, Vehicle :Car Amount : 58",
		"timestamp": 1637177384362
		
   }
   
   
**Build and Run**

Prerequsit
Java 8 +

Maven

Clone application
git clone https://github.com/deepthi-Pulicherla/CongestionTaxCalculator.git

Build application
Run the below maven command on the congestion-tax-calculator

**mvn clean install**

Run application

**java -jar target/CongestionTaxCalculator-0.0.1-SNAPSHOT.jar**

Run application with external application.yml

**java -jar target/CongestionTaxCalculator-0.0.1-SNAPSHOT.jar --spring.config.location=src/main/resources/application.yml**

Configuration

The application configurations are placed in application.yml (Under src/main/resources)

The tax prices, exempt vehicles, and holidays in a year are configured through the configuration file.

Test cases Information
Total 16 test are implemented for test the Application REST endpoint with different inputs


![image](https://user-images.githubusercontent.com/75684075/155523764-06351d89-9257-4a1c-8dc9-dffc79420eff.png)





