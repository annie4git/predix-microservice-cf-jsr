
##set -x

## specify which url you want to connect
url_to_connect=https://www.google.com/

## do not modify below
cloudurl=https://predix-rmi-springboot-connect.cfapps.io/connect
echo ">>>>>>>> connect to https://www.google.com/"
curl -k  -H "Content-Type: application/json" -X POST -d '{"message":"https://www.google.com/"}' ${cloudurl} 
echo ""
echo ""

echo ">>>>>>>> connect to https://www.ge.com/"
curl -k  -H "Content-Type: application/json" -X POST -d '{"message":"https://www.ge.com/"}' ${cloudurl} 
echo ""
echo ""

echo ">>>>>>>> connect to predix cloud: predix-rmi-springboot-connect.run.aws-usw02-pr.ice.predix.io"
curl -k  -H "Content-Type: application/json" -X POST -d '{"message":"https://predix-rmi-springboot-connect.run.aws-usw02-pr.ice.predix.io/"}' ${cloudurl} 

echo ""
