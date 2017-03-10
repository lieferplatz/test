## build docker images

```bash
./gradlew buildImage
```

## run

```bash
docker-compose up
```

Wait for ~1 minutes on http://localhost:8761/ while applications `MANDANTS` and `PRODUCTS` are in status `UP`. 

Master server named `proxy` hosts two URLs:
* `http://localhost:8080/products/byMandantId/1` that is routed to "products" micro-service
* `http://localhost:8080/mandants` that is routed to "mandants" micro-service

## stop

docker-compose down