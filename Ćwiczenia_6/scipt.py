import riak

RIAK = riak.RiakClient(pb_port=8087)

bucket = RIAK.bucket('s24088')

me = {"name": "Maciek", "nr": 48}
key = bucket.new('student', data=me)
key.store()
print('New object')


res = bucket.get('student')
print('Updated object: ' + str(res.data))



res.data['nr'] = 49
res.store()

res_2 = bucket.get('student')
print('Get student: ' + str(res_2.data))


res_2.delete()
print('Deleted.')
res_3 = bucket.get('student')
print('Get student: ' + str(res_3.data))