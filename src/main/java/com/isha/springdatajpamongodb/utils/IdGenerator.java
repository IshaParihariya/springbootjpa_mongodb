package com.isha.springdatajpamongodb.utils;

import java.util.UUID;

public class IdGenerator
{
    //This class is used to generate your own custom IDs instead of letting MongoDB generate them automatically.
    // as primary ids are generated automatically in mongodb
    // so we will now generate ids by ourselves
    // in mongodb directly u can create primary ids of ur choice by _id
    public static String generateId()
    {
        //creates a unique random string like:
        //a12f45c8-6d7e-4b2a-9c11-ef34567ab890
        // in this custom id replace - by empty space
        // also only give me substring from 0 to 10 index
        return UUID.randomUUID().toString().replace("-","").substring(0,10);
    }
}
