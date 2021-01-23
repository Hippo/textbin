# textbin
A restful server to store text.

MongoDB support.

# API

## Post text
```http request
POST /api
```
Body:
```json
{
  "content": "This is an example paste"
}
```
This will return an `Integer` which is the id of the post.

## Get text
```http request
GET /api/{id}
```
