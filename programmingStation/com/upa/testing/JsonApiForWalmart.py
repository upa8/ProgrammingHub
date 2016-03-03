import urllib2
import json

print "Something"

url = 'http://api.walmartlabs.com/v1/search?query=cell+phones&format=json&categoryId=1105910&facet.range=price%3A%5B150+TO+250%5D&apiKey=gm4wu8ppy3hfvhuuh2p3p6ck'

json_Object = urllib2.urlopen(url)

data = json.load(json_Object)

#print data["query"]
#print data["categoryId"]
#print data["sort"]
#print data["responseGroup"]
#print data["totalResults"]
#print data["start"]
#print data["numItems"]
#print data["items"]
for item in data['items']:
    print item["itemId"]
    print item["parentItemId"]
    print item["name"]
    #print item["msrp"]
    print item["salePrice"]
    print item["upc"]
    print item["categoryPath"]
    print item["shortDescription"]
    print item["longDescription"]
    print item["thumbnailImage"]
    print item["mediumImage"]
    print item["largeImage"]
    print item["productTrackingUrl"]
    print item["standardShipRate"]
    print item["marketplace"]
    print item["modelNumber"]
    print item["customerRating"]
    print item["numReviews"]
    print item["customerRatingImage"]
    print item["categoryNode"]
    print item["bundle"]
    print item["addToCartUrl"]
    print item["affiliateAddToCartUrl"]
    # gift option is again an array , call me if you want to add this into mongodb as well 
    print item["giftOptions"]
    print item["imageEntities"]
    print item["availableOnline"]
    
    
    
#print data["facets"]
