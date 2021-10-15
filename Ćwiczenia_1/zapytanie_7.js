db.people.remove({'height':{'$gte:'190'}});
db.people.find({'height':{'$gte':'190'}})