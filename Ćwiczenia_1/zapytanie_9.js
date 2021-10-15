db.people.updateMany({'first_name':'Antonio'},
{'$set':{'hobby':'pingpong'}});

printjson(db.people.find({'first_name':'Antonio'}).toArray())