# yt-extractor
Steps to Get Youtube CDN

#Step-1:
  Create a object of YoutubeJExtractor
  Example.
  val youtubeJExtractor = YoutubeJExtractor()
  
 #Step-2:
    Pass the video Id in getUrlForAndroidEmbeddedPlayer or getUrl methods
    It will retunrn a url
    
    Example.
    val url1 = youtubeJExtractor.getUrlForAndroidEmbeddedPlayer(youtubeVideoId)
    val url2 = youtubeJExtractor.getUrl(youtubeVideoId)


