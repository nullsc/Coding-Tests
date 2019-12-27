#basic example of a generator
def fib(num):
'''fibonacci sequence generator'''
	a,b = 0,1
	for i in range(0, num):
		yield("{}: {}".format(i+1, a))
		a,b = b,a+b

		
for item in fib(10):
	print(item)
