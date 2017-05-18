


1. Download the project  
  ```
  $ git clone https://github.com/PredixDev/predix-microservice-cf-jsr.git  
  
  $ cd predix-microservice-cf-jsr
  
  $ mvn clean package  
  
    note: mvn clean install may run integration tests against services you may not have set up yet
  ```

  ```
1. Push to cloud  

    Take a look at the [predix-microservice-cf manifest.yml](manifest.yml) which provides properties and instructions for [pushing cloud foundry apps](https://docs.cloudfoundry.org/devguide/deploy-apps/manifest.html)
  ```
  $ cf push  
  
  visit http://(cloud-url-here)/services/ping - get the url from the output of cf push  
  ```

