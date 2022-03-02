# mongodb 연습

## 몽고디비
- 여러개의 Collection 으로 이루어져 있으며 하나의 Collection 당 여러개의 document 들로 이루어져 있다. (Collection = table, document = row)

## ObjectId
- MongoDb 에 데이터를 넣을 때 ObjectId 를 지정해주지 않는 이상 자동으로 값이 부여되어 저장이 된다.
- 모든 데이터들은 각각의 ObjectId 를 부여받는다.
- RDBMS 에서 primary key 와 같은 역할을 해준다. (해당 값으로 삭제, 업데이트 가능)
- jpa 처럼 1씩 자동으로 증가해주지는 않는다 (@Id 로 지정했을경우)
