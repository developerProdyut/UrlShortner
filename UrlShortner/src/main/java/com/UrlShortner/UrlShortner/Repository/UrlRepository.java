package com.UrlShortner.UrlShortner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UrlShortner.UrlShortner.Model.Url;

public interface UrlRepository extends JpaRepository<Url,Long>
{
    public Url findByShortLink(String shortLink);
}



