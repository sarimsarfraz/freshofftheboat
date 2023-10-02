# freshofftheboat

# News Headlines Project

## Problem Domain Description

The News Headlines project aims to provide users with access to current news headlines from various news sources. Users can specify their interests, such as technology, sports, entertainment, etc., and retrieve the latest news articles.

## High-Level Description

The News Headlines application is a command-line tool that leverages the News API to fetch and display current news headlines based on user preferences. Users can input their preferred news category, and the application sends an API request to retrieve and display the latest news articles from trusted sources.

## API Documentation

We will use the News API, which provides a simple and easy-to-use interface to access news articles. You can find the API documentation here: [News API Documentation](https://newsapi.org/docs)

## Screenshot of Using Hoppscotch



## Example usage

Top News Headlines in Technology:

{
  "status": "ok",
  "totalResults": 10,
  "articles": [
    {
      "source": {
        "id": null,
        "name": "TechCrunch"
      },
      "author": "Ingrid Lunden",
      "title": "Fintech firm Mirador closes $12M round and rebrands as Vivid Money",
      "description": "Vivid Money, a German startup, has closed a $12 million Series A round and is now renaming to Vivid.",
      "url": "https://techcrunch.com/2022/09/13/fintech-firm-mirador-closes-12m-round-and-rebrands-as-vivid-money/",
      "urlToImage": "https://techcrunch.com/wp-content/uploads/2022/09/Amal-Louis".
      "publishedAt": "2022-09-13T13:43:15Z",
      "content": "Vivid Money"
    },
    {
      "source": {
        "id": "techcrunch",
        "name": "TechCrunch"
      },
      "author": "Tage Kene-Okafor",
      "title": "OnePipe Raises $25M Series A in Push to Make APIs Accessible to African Fintechs",
      "description": "OnePipe aims to make APIs are more accessible from banks, fintechs, and other financial service providers.
      "url": "https://techcrunch.com/2022/09/13/onepipe-raises-25m-series-a-in-push-to-make-apis-accessible-to-african-fintechs/",
      "urlToImage": "https://techcrunch.com/wp-content/uploads/2022/09/OnePipe -Logo.png",
      "publishedAt": "2022-09-13T08:07:08Z",
      "content": "OnePipe"
    },
    // Additional news articles...
  ]
}




