# API examples

## List

curl http://localhost:8080/api/tasks

## Create

curl -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"Learn Spring MVC","description":"Build a CRUD API","status":"TODO"}'

## Update

curl -X PUT http://localhost:8080/api/tasks/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"Learn Spring MVC","description":"CRUD API complete","status":"IN_PROGRESS"}'

## Delete

curl -X DELETE http://localhost:8080/api/tasks/1
