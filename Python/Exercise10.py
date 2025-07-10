# Use the NewsAPI and the requests module to fetch the daily news related to different topics.
# Go to: https://newsapi.org/ and explore the various options to build you application
import requests
import json

query = input("What type of news are you interested in? ")
url = f"https://newsapi.org/v2/everything?q={query}&from=2025-06-10&sortBy=publishedAt&apiKey=3ee08750cd7b485dbf9f203e417b1cfe"
r = requests.get(url)
news = json.loads(r.text)
# print(news, type(news))
for article in news["articles"]:
   print(article["title"])
   print(article["description"])
   print("--------------------------------------")