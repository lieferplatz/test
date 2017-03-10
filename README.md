## build docker images

./gradlew buildImage

## run

docker-compose up

master server named `proxy` hosts two URLs:
* `http://localhost:8080/products/byMandantId/1` that is routed to "products" micro-service
* `http://localhost:8080/mandants` that is routed to "mandants" micro-service

## stop

docker-compose down