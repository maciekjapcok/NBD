db.people.updateMany({'job':'Editor'},
{'$unset':{'email':1}});

printjson(db.people.find({'job':'Editor'}).toArray())