package com.UrlShortner.UrlShortner.Services;

import org.springframework.stereotype.Service;

import com.UrlShortner.UrlShortner.Model.Url;
import com.UrlShortner.UrlShortner.Model.UrlDto;

@Service
public interface UrlService {
    
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public  void  deleteShortLink(Url url);
  

}
