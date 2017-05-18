
##set -x

## specify which url you want to connect
url_to_connect=https://www.google.com/

## do not modify below
cloudurl=https://predix-java-springboot-connect-demo.run.aws-usw02-pr.ice.predix.io/connect
##curl -i -H "Content-Type: application/json" -X POST -d '{"message":"https://www.google.com/"}' ${cloudurl} 
echo ">>>>>>>> connect to https://www.google.com/"
curl  -H "Content-Type: application/json" -X POST -d '{"message":"https://www.google.com/"}' ${cloudurl} 
echo ""
echo ""

echo ">>>>>>>> connect to Pivotal Cloud: predix-rmi-springboot-connect.cfapps.io "
curl  -H "Content-Type: application/json" -X POST -d '{"message":"https://predix-rmi-springboot-connect.cfapps.io/"}' ${cloudurl} 
echo ""

