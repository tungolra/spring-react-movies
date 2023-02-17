package com.ralphtungol.movies.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ralphtungol.movies.models.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
