package com.ssafy.wayg.service;

import com.ssafy.wayg.dto.PlaceDto;
import com.ssafy.wayg.dto.PlacewordDto;
import com.ssafy.wayg.entity.Place;
import com.ssafy.wayg.entity.Placeword;

import java.util.List;

public interface ChatService {
    double placeword(String word, long total);
    long totalSize();
    List<PlacewordDto> oneSize(String str);
    List<String> findPlaces(List<String> nouns);
    PlaceDto searchName(String name);
}
