import requests

proxies = {'http': 'http://103.46.225.67:8080'} #http proxy
r = requests.get('http://bot.whatismyipaddress.com/', proxies=proxies)
print(r.text) #print proxy ip

