#24/11/2019
#Basic tool to scrape imbd.com for the top movies
#Gets the top 25 films
#requirements: bs4, requests

import bs4, requests
from bs4 import BeautifulSoup
user_agent = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.47 Safari/537.36'
url = "https://www.imdb.com/chart/top/?ref_=nv_mv_250"

print("Starting")

response = requests.get(url,
                        headers={'User-Agent': user_agent}
                        )

imdb = BeautifulSoup(response.text, "html.parser")
tags = imdb.find_all(class_="titleColumn")
years = imdb.find_all(class_="secondaryInfo")
ratings = imdb.find_all(class_="ratingColumn imdbRating")

i = 0
while(i < 25):
    #print(tags[i].a.text, end='') #title
    #print(years[i].text, end='') #release year
    #print(ratings[i].strong.text) #film rating
    print("{:55} {:6} {:4}".format(
        tags[i].a.text,
        years[i].text,
        ratings[i].strong.text))
    i += 1
